package smallProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/***
 * Array Project
 * @author Tim Harrold
 * Manipulates a set of dictionary data, finding such things as vowel counts, longest and shortest words, and words with differing vowel counts
 */
public class Dictionary2 {

	
	/*
	 * Main method, initializes array of data, assuring it to be able to handle all words in dataset, and manipulates said array with helper methods
	 * Pre-condition: none
	 * Post-condition: Array initialized and prints manipulated data
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String[] words = new String[235];
		fillArray(words);
		System.out.println("Shortest word: " + getShortest(words));
		System.out.println("Shortest word has " + getVowels(getShortest(words)) + " vowel(s).");
		System.out.println("Longest word: " + getLongest(words));
		System.out.println("Longest word has " + getVowels(getLongest(words)) + " vowel(s).");
		System.out.println("Second longest word: " + getSecLon(words, 1));
		System.out.println("Second longest word has " + getVowels(getSecLon(words, 1)) + " vowel(s).");
		
		for(String word : makeSixArray(words)) {
			if(word != null) {
			System.out.println(word);
			}
		}
		
		
		
	}
	/*
	 * Returns the second longest word in array(last occurrence)
	 * Pre-condition: Must have initialized String array filled with at least two items of data
	 * Post-condition: Second longest element of input array is returned
	 * @param String array to analyze
	 * @param Int(mark) word length to check for
	 */
	public static String getSecLon(String[] array, int mark) {
		int secLen = getLongest(array).length() - mark;
		String secLon = "";
		for(String word : array) {
			if(word.length() == secLen) {
				secLon = word;
			}
		}
		if(secLon.equals("")) {
			return getSecLon(array, mark + 1);
		}
		else return secLon;
	}
	/*
	 * Returns amount of vowels present in input string
	 * Pre-condition: Must have initialized string to scan
	 * Post-condition: Returs int count of vowels from input string
	 * @param String to analyze
	 */
	public static int getVowels(String str) {
		int vowels = 0;
		for(int i = 0; i < str.length(); i++) {
			switch(str.toLowerCase().charAt(i)) {
			case 'a' : vowels++;
			break;
			case 'e' : vowels++;
			break;
			case 'i' : vowels++;
			break;
			case 'o' : vowels++;
			break;
			case 'u' : vowels++;
			break;
			default : 
			}
		}		
		return vowels;
	}
	/*
	 * Creates array of words with 6 vowels from dataset
	 * Pre-condition: Must have initialized String array with at least one item of data
	 * Post-condition: Returns String array with all data items of 6 or more vowels
	 * @param Defined String array to fill
	 */
	public static String[] makeSixArray(String[] array) {
		String[] sixArray = new String[200];
		int counter = 0;
		for(String word: array) {
			if(getVowels(word) >= 6) {
				sixArray[counter] = word;
				counter++;
			}
		}
		return sixArray;
	}
	/*
	 * Returns shortest word in dataset
	 * Pre-condition: Must have initialized String array with at least two items
	 * Post-condition: Returns String of shortest word dataset
	 * @param String array to analyze
	 */
	public static String getShortest(String[] array) {	
		String shortest = array[50];
		for (String word: array) {
			if (shortest.length() > word.length()) {
				shortest = word;
			}
		}
	return shortest;
	}
	/*
	 * Returns the longest word in dataset
	 * Pre-condition: Must have initialized String array with at least two items
	 * Post-condition: Returns String of longest word from dataset
	 * @param String array to analyze
	 */
	public static String getLongest(String[] array) {	
		String longest = array[50];
		for (String word: array) {
			if (longest.length() < word.length()) {
				longest = word;
			}
		}
	return longest;
	}
	/*
	 * Fills initialized array with data from input file(websters_dictionary in this case, every 1000th word) 
	 * Pre-condition: Must have defined array with adequate space for items( > 200 )
	 * Post-condition: Returns filled array with websters_dictionary data
	 * @param String array to be filled
	 */
	public static String[] fillArray(String[] array) throws FileNotFoundException {
		File file = new File("websters_dictionary.txt");
		Scanner in = new Scanner(file);
		int counter = 0;
		for(int i = 0; in.hasNext(); i++) {
			String current = in.next();
			if(i % 1000 == 0) {
				array[counter] = current;
				counter++;
			}
		}
		return array;
	}
}
