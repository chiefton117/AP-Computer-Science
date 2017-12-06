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
		for(int i = 1; i<11; i++) {
			Array7[i] = 0;
			System.out.print(Array7[i] + " ");
		}
	}
}
