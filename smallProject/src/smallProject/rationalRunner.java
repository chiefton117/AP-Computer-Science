package smallProject;

public class rationalRunner {
		
		public static void main(String[] args) {
			Rational rat1 = new Rational(1, 2);
			Rational rat2 = new Rational(3, 4);
			
			System.out.println(Rational.multiply(rat1, rat2)); //3/8
			System.out.println(Rational.divide(rat1, rat2)); //4/6, 2/3
			System.out.println(Rational.add(rat1, rat2)); //7/4
			System.out.println(Rational.subtract(rat1, rat2)); //-1/2
			System.out.println(Rational.power(rat1, 2)); //1/4
			System.out.println(rat2.compareTo(rat1));
		}
}
