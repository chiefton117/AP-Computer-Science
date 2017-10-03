package pizzaProject;
import java.math.*;
import java.text.NumberFormat;

public class pizzaPie {
	public static void main(String[] args) {
		final String CUSTOMER1 = "G. Hopper"; //Lines 7-23 - Customer and Order variable declarations
		final String ORDER1 = "3 Medium Pizza Cheese";
		
		final String CUSTOMER2 = "B. Gates";
		final String ORDER21 = "2 Small Veggie Pizza Mushrooms Roasted Red Peppers Artichoke Hearts";
		final String ORDER22 = "1 Large Meat Lover Pizza Pepperoni Sausage BBQ Chicken";

		
		final String CUSTOMER3 = "J. Gosling";
		final String ORDER31 = "1 Large Pizza Pepperoni Extra Cheese";
		final String ORDER32 = "2 Small Pizza Mushroom Sausage";
		final String ORDER33 = "1 Medium Pizza Everything";
		
		final String CUSTOMER4 = "T. Harrold";
		final String ORDER41 = "1 Large Pizza Cheese";
		final String ORDER42 = "4 Medium Pizza Everything";
		final String ORDER43 = "5 Small Pizza Everything";
	
		double price1 = 0; //25-40 - Pricing declarations for pizza, toppings, and totals.
		double price2 = 0;
		double price3 = 0;
		double subtotal = 0;
		double tax  = 0;
		double deliveryCharge = 0;
		double total = 0;
		double smallPizza = (Math.PI * Math.pow(10/2, 2)) * 0.05;
		double smallRegTopping = Math.sqrt(0.49 * 10);
		double smallPremTopping = Math.sqrt(0.79 * 10);
		double medPizza = (Math.PI * Math.pow(12/2, 2)) * 0.05;
		double medRegTopping = Math.sqrt(0.49 * 12);
		double medPremTopping = Math.sqrt(0.79 * 12);
		double largePizza = (Math.PI * Math.pow(14/2,  2)) * 0.05;
		double largeRegTopping = Math.sqrt(0.49 * 14);
		double largePremTopping = Math.sqrt(0.79 * 14);
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(); //Price formatting declaration
		price1 = medPizza * 3; //43-53 Calculating individual price, printing all information formatted in USD format
		tax = price1 * 0.07;
		deliveryCharge = (tax + price1) / 10;
		total = tax + price1 + deliveryCharge;
		System.out.println("Geometry Joe's Pizza Parlor");
		System.out.println("Customer " + CUSTOMER1);
		System.out.println(ORDER1 + "\t" + formatter.format(price1));
		System.out.println("Tax\t\t\t" + formatter.format(tax));
		System.out.println("Delivery Charge\t\t" + formatter.format(deliveryCharge));
		System.out.println("Total\t\t\t" + formatter.format(total));
		System.out.println("Thank you for your order");
		
		System.out.println();//Spacer
		
		price1 = (smallPizza * 2) + smallRegTopping + (smallPremTopping * 2); //57-70 Calculating individual price, printing all information formatted in USD format
		price2 = largePizza + largePremTopping + (largeRegTopping * 2);
		subtotal = price1 + price2;
		tax = (subtotal) * 0.07;
		deliveryCharge = (tax + subtotal) / 10;
		total = tax + subtotal + deliveryCharge;
		System.out.println("Geometry Joe's Pizza Parlor");
		System.out.println("Customer " + CUSTOMER2);
		System.out.println(ORDER21 + "\t" + formatter.format(price1));
		System.out.println(ORDER22 + "\t\t\t" + formatter.format(price2));
		System.out.println("Tax\t\t\t\t\t\t\t\t\t" + formatter.format(tax));
		System.out.println("Delivery Charge\t\t\t\t\t\t\t\t" + formatter.format(deliveryCharge));
		System.out.println("Total\t\t\t\t\t\t\t\t\t" + formatter.format(total));
		System.out.println("Thank you for your order");
		
		System.out.println(); //Spacer
		
		price1 = largePizza + (largeRegTopping * 2); //74-89 Calculating individual price, printing all information formatted in USD format
		price2 = (smallPizza * 2) + (smallRegTopping * 2);
		price3  = medPizza + (medRegTopping * 6) + (medPremTopping * 4);
		subtotal = price1 + price2 + price3;
		tax = (subtotal) * 0.07;
		deliveryCharge = (tax + (subtotal)) / 10;
		total = tax + subtotal + deliveryCharge;
		System.out.println("Geometry Joe's Pizza Parlor");
		System.out.println("Customer " + CUSTOMER3);
		System.out.println(ORDER31 + "\t" + formatter.format(price1));
		System.out.println(ORDER32 + "\t\t" + formatter.format(price2));
		System.out.println(ORDER33 + "\t\t" + formatter.format(price3));
		System.out.println("Tax\t\t\t\t\t" + formatter.format(tax));
		System.out.println("Delivery Charge\t\t\t\t" + formatter.format(deliveryCharge));
		System.out.println("Total\t\t\t\t\t" + formatter.format(total));
		System.out.println("Thank you for your order");
		
		System.out.println(); //Spacer
		
		price1 = largePizza + (largeRegTopping * 2); //93-108 Calculating individual price, printing all information formatted in USD format
		price2 = (smallPizza * 2) + (smallRegTopping * 2);
		price3  = medPizza + (medRegTopping * 6) + (medPremTopping * 4);
		subtotal = price1 + price2 + price3;
		tax = (subtotal) * 0.07;
		deliveryCharge = (tax + (subtotal)) / 10;
		total = tax + subtotal + deliveryCharge;
		System.out.print("Geometry Joe's Pizza Parlor");
		System.out.println("Customer\t" + CUSTOMER4);
		System.out.println(ORDER41 + "\t\t" + formatter.format(price1));
		System.out.println(ORDER42 + "\t" + formatter.format(price2));
		System.out.println(ORDER43 + "\t" + formatter.format(price3));
		System.out.println("Tax\t\t\t\t" + formatter.format(tax));
		System.out.println("Delivery Charge\t\t\t" + formatter.format(deliveryCharge));
		System.out.println("Total\t\t\t\t" + formatter.format(total));
		System.out.println("Thank you for your order");
		
	}
}
