
/**
 * @author Tim Harrold
 * Converts files of ZipCodes to BarCodes
 * Converts files of BarCodes to ZipCodes
 * Finds indexes of ZipCodes given BarCodes or ZipCodes
 **/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Zipcodes {
	static String[] convertedArray = new String[5];
	// Array of BarCode values 0-9
	static String[] barArray = { "||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:",
			"|:|::" };

	/**
	 * Prompts the user to choose one Option to print out, otherwise asking them to
	 * choose a valid option.
	 * 
	 * Option 1: Loops the ZipCodes file, translating and returning each ZipCode as
	 * an array via convertCode method.
	 * 
	 * Option 2: Creates an array of ZipCodes from ZipCodes.txt, simultaneously
	 * iterating though City ZipCodes. Checks each City ZipCode in ZipArray, prints
	 * matching results.
	 * 
	 * Option 3: Iterates through ZipBarCodes file, translating each to a ZipCode
	 * via convertBar method.
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		File zipCodes = new File("ZipCodes.txt");
		Scanner zipParse = new Scanner(zipCodes);

		File cityCodes = new File("ZipCodesCity.txt");
		Scanner cityParse = new Scanner(cityCodes);

		File barCodes = new File("ZipBarCodes.txt");
		Scanner barParse = new Scanner(barCodes);
		System.out.println("Which option would you like to print? (1, 2, 3)");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		if (choice == 1) {
			while (zipParse.hasNextLine()) {
				String current = zipParse.nextLine();
				convertCode(current);
				System.out.printf("%-15s %15s %n", current,
						"Readable Barcode" + convertedArray[0] + " " + convertedArray[1] + " " + convertedArray[2] + " "
								+ convertedArray[3] + " " + convertedArray[4]);
				System.out.printf("%-15s %15s %n", " ", "Postal Barcode" + convertedArray[0] + convertedArray[1]
						+ convertedArray[2] + convertedArray[3] + convertedArray[4]);

			}
			barParse.close();
			zipParse.close();
		} else if (choice == 2) {
			String current = zipParse.nextLine();
			convertCode(current);
			String[] zipArray = zipArrayMaker(zipParse);
			while (cityParse.hasNextLine()) {
				String currentCity = cityParse.nextLine();
				String currentCityZip = currentCity.substring(0, 5);

				if (Arrays.asList(zipArray).contains(currentCityZip)) {
					String[] tokens = currentCity.split(",");
					System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2]);
					System.out.println("\tReadable Barcode" + " | " + convertedArray[0] + " " + convertedArray[1] + " "
							+ convertedArray[2] + " " + convertedArray[3] + " " + convertedArray[4] + " | ");
					System.out.println("\tPostal Barcode" + " |" + convertedArray[0] + convertedArray[1]
							+ convertedArray[2] + convertedArray[3] + convertedArray[4] + "| ");
				}
			}
			cityParse.close();

		} else if (choice == 3) {
			for (int i = 0; barParse.hasNextLine(); i++) {
				String currentBar = barParse.nextLine();
				String convertedZip = convertBar(currentBar);
				cityParse = new Scanner(cityCodes);
				String[] zipBarArray = new String[11];
				zipBarArray[i] = convertBar(currentBar);
				System.out.println(currentBar + "  ------>	" + convertedZip);
				while (cityParse.hasNextLine()) {
					String currentCity = cityParse.nextLine();
					String currentCityZip = currentCity.substring(0, 5);
					if (Arrays.asList(zipBarArray).contains(currentCityZip)) {
						String[] tokens = currentCity.split(",");
						System.out.println(tokens[1] + " " + tokens[2]);
						System.out.println(); // Spacer
					}
				}
				if (zipBarArray[i].equals("Error - Invalid check digit!")) {
					System.out.println("No Location Found");
					System.out.println(); // Spacer
				}

			}
		} else {
			System.out.println("Please choose a valid option.");
			choice = input.nextInt();
		}
		input.close();

	}

	/**
	 * Creates and returns an array of all ZipCodes from file ZipCodes.txt
	 * 
	 * @param zipParse
	 *            (Scanner for the ZipCodes file)
	 * @return zipArray (Array for ZipCodes)
	 * @throws FileNotFoundException
	 */
	public static String[] zipArrayMaker(Scanner zipParse) throws FileNotFoundException {
		File zipCodes = new File("ZipCodes.txt");
		zipParse = new Scanner(zipCodes);
		int arrayLength = 0;
		while (zipParse.hasNextLine()) {
			arrayLength++;
			zipParse.nextLine();
		}
		zipParse = new Scanner(zipCodes);
		String[] zipArray = new String[arrayLength];
		for (int i = 0; zipParse.hasNextLine(); i++) {
			zipArray[i] = zipParse.nextLine();
		}
		zipParse.close();
		return zipArray;
	}

	/**
	 * Converts given list of ZipCodes into BarCodes, returns result as array of one
	 * ZipCode(5 digits)
	 * 
	 * @param current
	 *            (current ZipCode being handled)
	 * @return convertedArray (array of converted BarCodes)
	 */
	public static String[] convertCode(String current) {
		for (int i = 0; i < 5; i++) {

			switch (current.substring(i, i + 1)) {
			case "0":
				convertedArray[i] = barArray[0];
				break;
			case "1":
				convertedArray[i] = barArray[1];
				break;
			case "2":
				convertedArray[i] = barArray[2];
				break;
			case "3":
				convertedArray[i] = barArray[3];
				break;
			case "4":
				convertedArray[i] = barArray[4];
				break;
			case "5":
				convertedArray[i] = barArray[5];
				break;
			case "6":
				convertedArray[i] = barArray[6];
				break;
			case "7":
				convertedArray[i] = barArray[7];
				break;
			case "8":
				convertedArray[i] = barArray[8];
				break;
			case "9":
				convertedArray[i] = barArray[9];
				break;
			default:
				convertedArray[i] = "---";
			}

		}
		return convertedArray;
	}

	/**
	 * Converts BarCode to ZipCode, using a checksum to assure that the input data
	 * is valid.
	 * 
	 * @param currentBar
	 *            (Current BarCode being handled)
	 * @return convertedZip (String of converted BarCode as ZipCode)
	 */
	public static String convertBar(String currentBar) {
		String[] convertedZipArray = new String[6];
		currentBar = currentBar.substring(1, 31);
		String[] convertedDigit = new String[6];
		int checkSum = 0;
		String[] currentArray = { currentBar.substring(0, 5), currentBar.substring(5, 10), currentBar.substring(10, 15),
				currentBar.substring(15, 20), currentBar.substring(20, 25), currentBar.substring(25, 30) };
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
}