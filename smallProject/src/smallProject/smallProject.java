/*
 * Fast Food
 * @author Tim Harrold
 */
package smallProject;
import java.util.Scanner;

public class smallProject {
	public static void main(String[] args) {
		
		final double BURGER_PRICE = 2.50;
		final double FRIES_PRICE = 1.25;
		final double DRINK_PRICE = 2.00;
		double total = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to McDoubles, how many burgers would you like?");
		int burgers = input.nextInt();	//Intakes burger count
		System.out.println("How many fries would you like?");
		int fries = input.nextInt();	//Intakes fries count
		System.out.println("How many drinks would you like?");
		int drinks = input.nextInt();	//Intakes drinks count
		total = (burgers * BURGER_PRICE) + (fries * FRIES_PRICE) + (drinks * DRINK_PRICE); //Calculates total, prints on next line
		System.out.println("Your total is: " + total + " for " + burgers + " burgers, " + fries + " fries, and " + drinks + " drinks.");
		System.out.println("How any dollars will you be paying with?"); //Gets dollars being paid with
		//double moneyIn = input.nextDouble();
		int dollars = input.nextInt();
		System.out.println("How many quarters?"); //Gets quarters being paid with
		int quarters = input.nextInt();
		System.out.println("How many dimes?"); //Gets dimes
		int dimes = input.nextInt();
		System.out.println("How many nickels?"); //Gets nickels
		int nickels = input.nextInt();
		System.out.println("How many pennies?"); //Gets pennies
		int pennies = input.nextInt();
		double moneyIn = (dollars + (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01));
		while (moneyIn < total) {
			System.out.println("This is not enough money. Please pay with a valid amount.");
			//moneyIn = input.nextDouble();
			moneyIn = (dollars + (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01));
		}
		double change = moneyIn % total;
		System.out.println("Your change is: $" + change);
		//For option 2,
		
	}
}
