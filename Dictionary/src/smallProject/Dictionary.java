package smallProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 * Words 'R Fun Dictionary Project Template
 * Complete the methods to analyze the dictionary.
 * Add additional methods as needed. All variables except the File and Scanner
 * should be local.
 * @author rodriguezd
 * Modified by Tim Harrold
 *
 */
public class Dictionary
{
	static File fWebsters = new File("websters_dictionary.txt");
	static Scanner in;

	/*
	 * Counts how many total words and five-letter words
	 * are in this dictionary
	 * Pre: File is opened, Scanner declared
	 * Post: Number of words is printed
	 */
	public static void countWords() throws IOException
	{
		in = new Scanner(fWebsters); //Initialize the Scanner
		int totalWords = 0;
		int fiveWords = 0;
		String currentWord = "";

		while(in.hasNext())
		{
			totalWords++; //Increment totalWords by one for each word
			currentWord = in.next();
			if(currentWord.length() == 5) { //If current word in scanner has at least five characters, increment fiveWords by one
				fiveWords++;
			}
		}

		System.out.println("Total Words: " + totalWords);
		System.out.println("Five Letter Words: " + fiveWords);

	}

	/*
	 * Counts how many five-letter words have 5,4,3,2,1,and 0 vowels
	 * Only a e i o u upper and lower case are vowels
	 * Pre: File is opened, Scanner declared
	 * Post: Number of different vowel words are printed
	 * Post: 0-Vowel words are printed
	 */
	public static void countVowels() throws IOException
	{   
		//reset Scanner to start of file
		in = new Scanner(fWebsters);
		String current = "";
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int vowelCount = 0;
		String[] vowels = {"a", "e", "i", "o", "u"};

		while(in.hasNext()) {
			current = in.next().toLowerCase();
			if(current.length() == 5) {
				vowelCount = 0;
				for(int i = 0; i < current.length(); i++) { //Iterate through current word length

					for(String vowel : vowels) {
						if(vowel.equals(current.substring(i, i+1))) { //If any character matches vowel in vowelArray, increment vowelCount
							vowelCount++;
						}
					}
				}
				switch(vowelCount) { //Increment count0-5 subjective to vowelCount for each word
				case 0 : count0++; System.out.println(current);
				break;
				case 1 : count1++;
				break;
				case 2 : count2++;
				break;
				case 3 : count3++;
				break;
				case 4 : count4++;
				break;
				case 5 : count5++;
				break;
				}
			}
		}
		System.out.println("0 Vowels: " + count0);
		System.out.println("1 Vowels: " + count1);
		System.out.println("2 Vowels: " + count2);
		System.out.println("3 Vowels: " + count3);
		System.out.println("4 Vowels: " + count4);
		System.out.println("5 Vowels: " + count5);
	}

	/*
	 * Counts the number of characters in the longest and shortest word
	 * Pre: File is opened, Scanner declared
	 * Post: Number of characters in the longest word is printed
	 * Post: Number of characters in the shortest word is printed
	 */
	public static void longestAndShortestCount () throws IOException
	{
		in = new Scanner(fWebsters);
		int longest = 0;
		int shortest = 5;
		String current = "";
		String longestWord = "";
		String shortestWord = "";
		while(in.hasNext()) {
			current = in.next();
			if (current.length() > longest) { //If current word is longer than longest, set longest word/int to current and current length
				longest = current.length();
				longestWord = current;
			}
			if (current.length() < shortest) { //If current word is longer than longest, set longest word/int to current and current length
				shortest = current.length();
				shortestWord = current;
			}
		}
		System.out.println("Longest word has " + longest + " Character(s)");
		System.out.println("Shortest word has " + shortest + " Character(s)");
		System.out.println("The longest word is: " + longestWord);
		System.out.println("The shortest word is: " + shortestWord);

	}


	/*
	 * Counts and displays all the words containing "java" in any case.
	 * Pre: File is opened, Scanner declared
	 * Post: Number of java words is printed
	 * Post: All the java words are printed with java converted to all upper case
	 */
	public static void javaWords() throws IOException
	{
		in = new Scanner(fWebsters);
		String current = "";
		String result = "";
		int count = 0;
		while(in.hasNext()) {
			current = in.next().toLowerCase(); //Iterates through file
			if(current.length() > 3) { //For every word able to contain the phrase 'java'
				for(int i = 0; i < current.length() - 3; i++) {
					if(current.substring(i, i+4).equalsIgnoreCase("JAVA")) { //If current iteration of word contains Java, set result to capitalized 'JAVA' in word
						result = current.substring(0, i) + "JAVA" + current.substring(i+4, current.length());
						count++;
						System.out.println(result);
						break;
					}
				}
			}
		}

		System.out.println("Words containing Java: " + count);
	}

	public static void main(String[] args) throws IOException
	{
		//Open file
		//Add file to project folder
		fWebsters = new File ("websters_dictionary.txt");

		//Analyze words
		countWords();
		System.out.println(); //Line break
		countVowels();
		System.out.println(); //Line break
		longestAndShortestCount();
		System.out.println(); //Line break
		javaWords();
	}
}