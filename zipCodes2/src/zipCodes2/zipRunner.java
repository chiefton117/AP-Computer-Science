package zipCodes2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class zipRunner {
	public static void main(String[] args) throws IOException
	{
		File zipBarCodes = new File ("ZipBarCodes.txt");
		File zipCodes = new File ("ZipCodes.txt");

		String[] barcodes = makearray(zipBarCodes);
		String[] zipcodes = makearray(zipCodes);

		printArray(barcodes);
		printArray(zipcodes);
		printZips(zipCodes);
		
	}
	public static void printZips(File zipCodes) throws IOException {
		String zipCode;
		Scanner zipParse = new Scanner(zipCodes);
		while(zipParse.hasNextLine()) {
			zipCode = zipParse.nextLine();
			Zipcode zip = new Zipcode(zipCode);
			System.out.println(zip.getLocation());
		}
		
		
	}
	public static String[] makearray(File file)  throws IOException
	{

		Scanner in = new Scanner(file);
		int length = 0;
		int openPosition = 0;


		while(in.hasNextLine())
		{
			in.nextLine();
			length++;
		}
		String[] result = new String[length];

		in = new Scanner(file); //start over 
		while(in.hasNextLine())
		{
			result[openPosition] = in.nextLine();
			openPosition++;
		}
		in.close();
		return result;

	}
	public static void printArray(String[] array)
	{
		for(int i = 0; i < array.length; i++)   //go through each element and print
			System.out.println(array[i]);
		System.out.println();  //casual line break
	}
}
