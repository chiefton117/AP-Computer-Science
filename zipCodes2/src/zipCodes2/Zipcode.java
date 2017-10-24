package zipCodes2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zipcode {
	private String zipcode;

	public Zipcode(String input) {
		zipcode = input;
	}
	//Sets Zipcode
	public void setZip(String zip) {
		zipcode = zip;
	}
	//Returns Zipcode
	private String getZip() {
		return zipcode;
	}
	/**
	 * Checks to see if input value is a Zipcode.
	 * @return Boolean value (true if Zipcode, otherwise false)
	 */
	private boolean isZip() {
		boolean isZip = true;
		if(this.toString().substring(1, 2).equals("|") || this.toString().substring(1, 2).equals(":")) {
			isZip = false;
			return isZip;
		}
		return isZip;
	}
	//Represents the string value of the Zipcode object
	public String toString() {
		return zipcode.toString();
	}
	/**
	 * If the given input is a Barcode, converts to a Zipcode. Otherwise, returns the Zipcode.
	 * @return Zipcode(converted or not) as type Zipcode
	 */
	public Zipcode toZip() {
		String converted = this.toString();
		if (this.isZip()) {
			return this;
		}
		else {
			String[] convertedZipArray = new String[6];
			converted = converted.substring(1, 31);
			String[] convertedDigit = new String[6];
			int checkSum = 0;
			String[] currentArray = { converted.substring(0, 5), converted.substring(5, 10), converted.substring(10, 15),
					converted.substring(15, 20), converted.substring(20, 25), converted.substring(25, 30) };
			for (int i = 0; i < 6; i++) {
				String currentCode = currentArray[i];
				for (int x = 0; x < 5; x++) {
					if (currentCode.substring(x, x + 1).equals("|")) {
						convertedDigit[x] = "1";
					} else if (currentCode.substring(x, x + 1).equals(":")) {
						convertedDigit[x] = "0";
					} else {
						convertedDigit[x] = "Error";
						break;
					}
				}
				int b0 = Integer.parseInt(convertedDigit[0]);
				b0 = b0 * 7;
				int b1 = Integer.parseInt(convertedDigit[1]);
				b1 = b1 * 4;
				int b2 = Integer.parseInt(convertedDigit[2]);
				b2 = b2 * 2;
				int b3 = Integer.parseInt(convertedDigit[3]);
				int number = b0 + b1 + b2 + b3;
				if (number == 11) {
					number = 0;
				}
				checkSum = checkSum + number;
				convertedZipArray[i] = Integer.toString(number);
			}
			String convertedZip = convertedZipArray[0] + convertedZipArray[1] + convertedZipArray[2] + convertedZipArray[3]
					+ convertedZipArray[4];
			if (checkSum % 10 != 0) {
				convertedZip = "Error - Invalid check digit!";
			}
			Zipcode convertedOb = new Zipcode(convertedZip);
			return convertedOb;
		}

	}
	/**
	 * Finds the location of a Barcode or Zipcode, printing the result as a Location associated with a Zipcode.
	 * @return Location of Zipcode object as associated in ZipCodesCity.txt as type String
	 * @throws FileNotFoundException
	 */
	public String printLocation() throws FileNotFoundException {
		if(this.isZip()) {
			File cities = new File("ZipCodesCity.txt");
			Scanner cityParse = new Scanner(cities);
			String currentCity;
			String currentCityZip;
			String location = "";
					
			while(cityParse.hasNextLine()) { //For every passed item, checks against CityZipCodes.txt and prints matches
				currentCity = cityParse.nextLine();
				currentCityZip = currentCity.substring(0, 5);
				if (zipcode.equals(currentCityZip)) {
					Location city = new Location(currentCity);
					Location state = new Location(currentCity);
					location = city.getCity() + " " + state.getState();
					System.out.println(location);
				}
				if (zipcode.equals("Error - Invalid check digit!")) {
					location = "No Location Found";
					System.out.println(location);
					break;
				}
			}
			cityParse.close();
			return location;
		}
		else {
			return this.toZip().printLocation();

		}
	}
}
