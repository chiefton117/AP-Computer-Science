package smallProject;

public class whileLoops {
	public static void main(String[] args) {
		
		System.out.println(whileHundredSum());
		System.out.println(whileEvenHundredSum());
		printFor3H();
		
	}
	public static int whileHundredSum() {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		return sum;
	}
	public static int whileEvenHundredSum() {
		int a = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				a += i;
			}
			i++;
		}
		return a;
		
	}
	public static void printFor3H() {
		int div = 0;
		int check = 0;
		for(int i = 0; check < 300; i++) {
			if(i % 3 == 0) {
				div = i;
				System.out.println(div);
				check++;
			}
		}
		System.out.println(check);
	}
}
