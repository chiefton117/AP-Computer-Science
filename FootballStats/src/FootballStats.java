import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Practice working with arrays using Quarterback Ratings (QBR)
 * Read input from a file into an array
 * Find the average, min, and max QBR from array data
 * Print the QBR array & calculated statistics
 * Use a separate method for printing the array, 
 * and calculating the minimum, maximum, and average QBR ratings.
 */
public class FootballStats
{

	
public double 
 /**
  * Prints an array of doubles on one line with a valid separator character (i.e. | )
  * @param arr
  */
  public static void printArray(double[] arr)
  {
	  for (double item : arr) {
		  System.out.println(item);
	  }
  }
 
  /**
   * Calculates the average value in the array
   * @param arr
   * @return average
   */
  public static double calcAverage(double[] arr)
  {

  }
  
  /**
   * Calculates the max value in the array
   * @param arr
   * @return maximum value
   */
  public static double calcMax(double[] arr)
  {

  }
  
  /**
   * Calculates the min value in the array
   * @param arr
   * @return minimum value
   */
  public static double calcMin(double[] arr)
  {

  }
  
  public static void main(String[] args) throws IOException
  {
    //Set up Input using file QBRating2017.txt
	//Add the text file to your project folder in Eclipse
	File inFile = new File("QBRating2017.txt");
	Scanner in = new Scanner(inFile);

    //Determine size and initialize array of Quarterback ratings
    //The number of Quarterbacks is the first entry in the file, followed by the QB name and QBR, one per line
	//<Add code here to read the number of QBs and declare and initialize the QBR array>
	int size = 0;
	while(in.hasNext()) {
		size++;
		in.next();
	}
	String[] info = new String[size];
	
	
    //read QBRs into array, you will need to read the player name to skip over it
    //<Add for loop here that reads the QBRs from the file into the array. QBRs are floating point numbers>

	
    //Print all the QBRs from array on one line using a space separator
	//<Add a method call to a printArray method here>
	System.out.println("The 2017 Quarterback Ratings:");
    
    //Calculate the average QBR
	//Your method should take the array as a parameter and return the average
	//<Add a method call to a calcAverage method here>

    
    //Find the min and max QBR
	//Your methods should take the array as a parameter and return the maximum or the minimum
	//<Add two method calls to minAverage and maxAverage methods here>

    
    //Print the returned average, min and max QBRs 
	//<Add code here to print the resulting statistics>

  }

}