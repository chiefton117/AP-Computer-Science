package smallProject;
import java.util.Scanner;

public class ifProblems {
	public static void main(String[] args) {
		double x = -8;
		double y = 0;
		System.out.println("Starting value: " + x);
		if (x >= 0) {
			System.out.println("Value already absolute!");
		}
		else {
			y = -x;
			System.out.println("Ending value: " + y);
		}
		
		System.out.println(); //Spacer
		
		double side1 = 9.0;
		double side2 = 1.0;
		double side3 = 1.0;
		if ((side1 + side2 > side3) || (side2 + side3 > side1) || (side1 + side3 > side2)) {
			System.out.println("Valid triangle");
		}
		else {
			System.out.println("Cannot be a triangle");
		}
		System.out.println(); //Spacer
		
		System.out.println("Plese input a year");
		Scanner calendar = new Scanner(System.in);
		int input = calendar.nextInt();
		while (input < 1582) {
			System.out.println("Please input a year past 1582!");
			input = calendar.nextInt();
		}
		if ((input % 4 == 0) && (input % 100 != 0) || (input % 4 == 0) && (input % 400 == 0)) {
			System.out.println("Leap year!");
		}
		else {
			System.out.println("Not a leap year.");
		}
		
		
	}
}
