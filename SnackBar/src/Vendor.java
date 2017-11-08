/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
	// Fields:
	private int price;
	private int stock;
	private int deposited;
	private int change;
	private static double totalSales;
	
	/**
	 * Constructs a Vendor
	 * @param price the price of a single item in cents (int)
	 * @param stock number of items to place in stock (int)
	 */
	public Vendor(int cost, int quantity)
	{
		price = cost;
		stock = quantity;
		deposited = 0;
		change = 0;
	}
	
	
	public static double getTotalSales() {
		double temp = totalSales;
		totalSales = 0;
		return temp;
	}
	
	/**
	 * Sets the quantity of items in stock.
	 * @param qty number of items to place in stock (int)
	 */
	public void setStock(int quantity)
	{
		stock = quantity; 
	}

	/**
	 * Returns the number of items currently in stock.
	 * @return number of items currently in stock (int)
	 */
	public int getStock()
	{
		return stock;
	}

	/**
	 * Adds a specified amount (in cents) to the
	 * deposited amount.
	 * @param number of cents to add to the deposit (int)
	 */
	public void addMoney(int money)
	{
		deposited += money;
	}

	/**
	 * Returns the currently deposited amount (in cents).
	 * @return number of cents in the current deposit (int)
	 */
	public int getDeposit()
	{
		return deposited;
	}

	/**
	 * Implements a sale.  If there are items in stock and
	 * the deposited amount is greater than or equal to
	 * the single item price, then adjusts the stock
	 * and calculates and sets change and returns true;
	 * otherwise refunds the whole deposit (moves it into
	 * change) and returns false.
	 * @return true for a successful sale, false otherwise (boolean)
	 */
	public boolean makeSale()
	{
		if(deposited >= price && stock > 0) {
			stock --;
			totalSales += (price / 100);
			change = deposited - price;
			deposited = 0;
			
			return true;
		}
		else {
			change = deposited;
			deposited = 0; 
			return false;
		}
	}

	/**
	 * Returns and zeroes out the amount of change (from
	 * the last sale or refund).
	 * @return number of cents in the current change (int)
	 */
	public int getChange()
	{
		int tempChange = 0;
		tempChange = change;
		change = 0;
		return tempChange;
	}
}
