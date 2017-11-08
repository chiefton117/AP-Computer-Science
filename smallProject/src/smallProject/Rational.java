package smallProject;

//********************************************************************
//  Rational.java       Author: Lewis/Loftus/Cocking
//
//  Represents one rational number with a numerator and denominator.
//********************************************************************

public class Rational implements Comparable<Rational>, doubleAmount
{
   private int numerator, denominator;

   //-----------------------------------------------------------------
   //  Sets up the rational number by ensuring a nonzero denominator
   //  and making only the numerator signed.
   //-----------------------------------------------------------------
   public Rational (int numer, int denom)
   {
      if (denom == 0)
      denom = 1;

      // Make the numerator "store" the sign
      if (denom < 0)
      {
      numer = numer * -1;
      denom = denom * -1;
      }

      numerator = numer;
      denominator = denom;
      reduce();
   }

   //-----------------------------------------------------------------
   //  Returns the numerator of this rational number.
   //-----------------------------------------------------------------
   public int getNumerator ()
   {
      return numerator;
   }

   //-----------------------------------------------------------------
   //  Returns the denominator of this rational number.
   //-----------------------------------------------------------------
   public int getDenominator ()
   {
      return denominator;
   }

   //-----------------------------------------------------------------
   //  Returns the reciprocal of this rational number.
   //-----------------------------------------------------------------
   public Rational reciprocal ()
   {
      return new Rational (denominator, numerator);
   }

   //-----------------------------------------------------------------
   //  Adds this rational number to the one passed as a parameter.
   //  A common denominator is found by multiplying the individual
   //  denominators.
   //-----------------------------------------------------------------
   public static Rational add (Rational op1, Rational op2)
   {
      int commonDenominator = op1.denominator * op2.getDenominator();
      int numerator1 = op1.denominator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * op1.denominator;
      int sum = numerator1 + numerator2;

      return new Rational (sum, commonDenominator);
   }

   //-----------------------------------------------------------------
   //  Subtracts the rational number passed as a parameter from this
   //  rational number.
   //-----------------------------------------------------------------
   public static Rational subtract (Rational op1, Rational op2)
   {
      int commonDenominator = op1.denominator * op2.getDenominator();
      int numerator1 = op1.numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * op1.denominator;
      int difference = numerator1 - numerator2;

      return new Rational (difference, commonDenominator);
   }

   //-----------------------------------------------------------------
   //  Multiplies this rational number by the one passed as a
   //  parameter.
   //-----------------------------------------------------------------
   public static Rational multiply (Rational op1, Rational op2)
   {
      int numer = op1.numerator * op2.getNumerator();
      int denom = op1.denominator * op2.getDenominator();
      return new Rational (numer, denom);
   }

   //-----------------------------------------------------------------
   //  Divides this rational number by the one passed as a parameter
   //  by multiplying by the reciprocal of the second rational.
   //-----------------------------------------------------------------
   public static Rational divide (Rational op1, Rational op2)
   {
      return multiply (op1, op2.reciprocal());
   }
   
   public static Rational power(Rational op1, int power) {
	   Rational opNew = new Rational(op1.numerator, op1.denominator);
	   for (int i = 1; i < power; i++) {
		 opNew = multiply(op1, opNew);
	   }
	   return opNew;
   }
   public double toDouble() {
	   return this.numerator / this.denominator;
   }
   
   public int compareTo(Rational op2) {
	   
	   if(this.toDouble() > op2.toDouble()) {
		   return 1;
	   }
	   else if (this.toDouble() < op2.toDouble()) {
		   return -1;
	   }
	   else {
	   return 0;
	   }
   }
   //-----------------------------------------------------------------
   //  Returns this rational number as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      String result;

      if (numerator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = numerator + "";
         else
            result = numerator + "/" + denominator;
      return result;
   }

   //-----------------------------------------------------------------
   //  Reduces this rational number by dividing both the numerator
   //  and the denominator by their greatest common divisor.
   //-----------------------------------------------------------------
   private void reduce ()
   {
      if (numerator != 0)
      {
         int common = gcd (Math.abs(numerator), denominator);

         numerator = numerator / common;
         denominator = denominator / common;
      }
   }

   //-----------------------------------------------------------------
   //  Computes and returns the greatest common divisor of the two
   //  positive parameters. Uses Euclid's algorithm.
   //-----------------------------------------------------------------
   private int gcd (int num1, int num2)
   {
      while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;

      return num1;
   }
}