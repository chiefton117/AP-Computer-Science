package zipCodes2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Zipcode {
	private String zipcode;
	private File cities = new File("ZipCodesCity.txt");

	public Zipcode(String input) {
		zipcode = input;
	}
	public void setZip(String zip) {
		zipcode = zip;
	}
	private String getZip() {
		return zipcode;
	}
	public boolean isZip() {
		boolean isZip = true;
		if(this.toString().substring(1, 2).equals("|") || this.toString().substring(1, 2).equals(":")) {
			isZip = false;
			return isZip;
		}
		return isZip;
	}
	/**
	 * Represents the string value of the Zipcode object
	 */
	public String toString() {
		return zipcode.toString();
	}
	/**
	 * If the given input is a barcode, converts to a zipcode. Otherwise, returns the zipcode.
	 * @return zipcode(converted or not)
	 */
	public String toZip() {
		String converted = this.toString();
		if (this.isZip()) {
			System.out.println("Input is already a zipcode!");
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
			return convertedZip;
		}
		return converted;
	}
	public String getLocation() {
		return zipcode;
	}

}
