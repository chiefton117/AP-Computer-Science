
package zipCodes2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * An improvement on the Zipcodes project now utilizing advanced concepts such as multiple classes and objects
 * @author Tim Harrold
 * @author Dan Krasnonosenkikh
 *
 */
public class zipRunner {
	public static void main(String[] args) throws IOException
	{
		File zipBarCodes = new File ("ZipBarCodes.txt");
		File zipCodes = new File ("ZipCodes.txt");

		String[] barcodes = makearray(zipBarCodes); //create array from these files
		String[] zipcodes = makearray(zipCodes);

		Scanner in = new Scanner(System.in); //Scanner to take user choice, deciding which option to print
		System.out.println("Print option 2 or 3?");
		String choice = in.next();

		while(!(choice.equals("2")) && !(choice.equals("3"))) { //Assures user to enter acceptable value
			System.out.println("Please choose a valid option");
			choice = in.next();
		}

		if(choice.equals("2")) { //Options 1 & 2

			for(String zipcode: zipcodes) { 
				Zipcode zipOb = new Zipcode(zipcode); //creates barcode and zipcode of the same location
				Barcode barOb = new Barcode(zipcode); // see line above
				System.out.println(zipcode); 
				String location = zipOb.printLocation(); //Print statement for locations
				if(location.equals("")) {
					System.out.println("No Location Found");
				}
				readablePostalBarcodes(barOb); 
				System.out.println();
			}
		}
		else if (choice.equals("3")) { //Option 3
			for(String barcode: barcodes) { 
				Zipcode barOb = new Zipcode(barcode);
				System.out.println(barcode + "    ------->    " + barOb.toZip());
				String location = barOb.printLocation();
				if(location.equals("")) {
					System.out.println("No Location Found");
				}
				System.out.println("");
			}

		}
		in.close();
	}

	/**
	 *  makes an array from a file, by counting number of things in file, then creating an array
	 *  then filing the array
	 * @param file
	 * @return array from the file
	 * @throws IOException
	 */
	public static String[] makearray(File file)  throws IOException
	{

		Scanner in = new Scanner(file);
		int length = 0;
		int openPosition = 0;

		while(in.hasNextLine()) //counts length
		{
			in.nextLine();
			length++;
		}

		String[] result = new String[length]; //creates array of said length

		in = new Scanner(file); //start over 
		while(in.hasNextLine()) //fill array
		{
			result[openPosition] = in.nextLine();
			openPosition++;
		}
		in.close();
		return result;

	}
	/**
	 * does option1 of the assignment, takes in a Barcode and prints in nice an legibly
	 * @param x, containing a 27-character Barcode
	 */
	public static void readablePostalBarcodes(Barcode x)
	{
		System.out.println("Postal Barcode- " + "|" + x + "|");
		String readable = "| ";
		for (int i = 0; i < 21; i+=5)
		{
			readable+= x.toString().substring(i, i + 5) + " ";
		}
		readable+= " |";
		System.out.println("Readable Barcode- " + readable);
	}


}