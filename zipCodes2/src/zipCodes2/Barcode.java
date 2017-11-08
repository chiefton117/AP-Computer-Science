package zipCodes2;

public class Barcode {
	String barcode;

	/**
	 * create Barcode object
	 * @param x, string of 5 digits
	 */
	public Barcode(String x) //converts 5 digits to a Barcode
	{
		barcode = whichBarcode(x);
	}
	/**
	 * takes a Barcode, checks digits, then makes the object
	 * @param x is the Barcode we want to convert
	 * @param y is just there as a check that it is a Barcode being input
	 */
	public Barcode(String x, char y) 
	{
		barcode = checkSum(x);

	}
	/**
	 * toString method for printing barcodes
	 * returns a string from an object
	 */
	public String toString()
	{
		return barcode.toString();
	}
	/**
	 * Translates Zipcode to Barcode
	 * @param x the Zipcode being translated
	 * @return string which is a 25 length Barcode
	 */
	private String whichBarcode(String x)
	{
		String barcode = "";


		for(int i = 0; i < 5; i++)
		{
			switch (x.substring(i,i+1)) {
			case "0": barcode+="||:::"; break;
			case "1": barcode+=":::||"; break;
			case "2": barcode+="::|:|"; break;
			case "3": barcode+="::||:"; break;
			case "4": barcode+=":|::|"; break;
			case "5": barcode+=":|:|:"; break;
			case "6": barcode+=":||::"; break;
			case "7": barcode+="|:::|"; break;
			case "8": barcode+="|::|:"; break;
			case "9": barcode+="|:|::"; break;	
			}
		}
		return barcode;
	}
	/**
	 * checks the sum of a 5 length zipcode, if passed, return the input, if not, return "invalid Barcode"
	 * @param x 5 length Zipcode
	 * @return either the Zipcode if everything is fine, "Invalid Barcode!" if something is wrong with it
	 */
	private String checkSum(String x)
	{
		int sum = 0;
		String y = x.substring(1, x.length() - 1);
		for(int i = 0; i < 30; i+=5)
		{
			switch (y.substring(i,i+5)) {
			case "||:::": sum+=0; break;
			case ":::||": sum+=1; break;
			case "::|:|": sum+=2; break;
			case "::||:": sum+=3; break;
			case ":|::|": sum+=4; break;
			case ":|:|:": sum+=5; break;
			case ":||::": sum+=6; break;
			case "|:::|": sum+=7; break;
			case "|::|:": sum+=8; break;
			case "|:|::": sum+=9; break;	
			}
		}
		if(sum%10==0)
			return x;
		else
			return "Invalid barcode!";
	}

}
