package smallProject;

public class Arrays {
	public static void main(String[] args) {
	
		int[] Array1 = new int[11];
		for(int i = 1; i<11; i++) {
			Array1[i] = i;
			System.out.print(Array1[i] + " ");
		}
		
		
		System.out.println();
		int[] Array2 = new int[11];
		int counter = 0;
		for(int i = 0; i<11; i++) {
			Array2[i] = counter;
			counter += 2;
			System.out.print(Array2[i] + " ");
		}

		
		System.out.println();
		int[] Array3 = new int[11];
		for(int i = 1; i<11; i++) {
			Array3[i] = i * i;
			System.out.print(Array3[i] + " ");
		}

		
		System.out.println();
		int[] Array4 = new int[11];
		for(int i = 1; i<11; i++) {
			Array4[i] = 0;
			System.out.print(Array4[i] + " ");
		}

		
		System.out.println();
		int[] Array5 = new int[] {1, 4, 9, 16, 9, 7, 4, 9, 11};
		for(int item : Array5) {
			System.out.print(item + " ");
		}

		
		System.out.println();
		int[] Array6 = new int[11];
		for(int i = 1; i<11; i++) {
			if(i % 2 == 1) {
				Array6[i] = 0;
			}
			if(i % 2 == 0) {
				Array6[i] = 1;
			}
			System.out.print(Array6[i] + " ");
		}

		
		System.out.println();
		int[] Array7 = new int[11];
		counter = 0;
		for(int i = 1; i<11; i++) {
			Array7[i] = counter;
			counter++;
			if(counter == 5) {
				counter = 0;
			}
			System.out.print(Array7[i] + " ");
		}
		
		System.out.println();
		counter = 0;
		int[] Array8 = new int[10];
		for(int i = 0; i < Array8.length; i++) {
			Array8[i] = (int) (Math.random() * 10);
			System.out.print(Array8[i] + " ");
		}
		System.out.println("\nEvery number at an even index");
		for(int num : Array8) {
			if(counter % 2 == 0) {
				System.out.print(num + " ");
			}
			counter++;
		}
		System.out.println("\nEvery even number: ");
		for(int num : Array8) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println("\nElements in reverse");
		for(int i = Array8.length; i > 0; i--) {
			System.out.print(Array8[i - 1] + " ");
		}
		System.out.println();
		System.out.println("First and last elements: " +  Array8[0] + " " + Array8[Array8.length - 1]);
		
		System.out.println("Alternating Sum");
		int result = 0;
		counter = 0;
		for(int num : Array8) {
			if(counter % 2 == 1) {
				result += num;
			}
			if(counter % 2 == 0) {
				result -= num;
			}
		counter++;
		}
		System.out.println(result);
	}
}
