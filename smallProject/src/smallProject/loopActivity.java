package smallProject;

public class loopActivity {

	public static void main(String[] args) {
		System.out.println(Triangle(6));
		System.out.println(BunnyEars(6));
		Dia(6);
	}
	public static void Dia(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}

			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();

		}            
		for(int i=num-1;i>0;i--) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}  
	}
	public static int Triangle(int rows) {
		int combinations = 0;
		for(int i = 0; i <= rows; i++) {
			combinations += i;
		}
		return combinations;
	}
	public static int BunnyEars(int bunnies) {
		int ears = 0;

		for(int i = 1; i <= bunnies; i++) {
			if(i % 2 == 0) {
				ears+= 3;
			}
			else ears += 2;
		}
		return ears;
	}
}
