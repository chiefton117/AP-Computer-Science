
public class Client extends Sort {

	public static void main(String[] args) {
		
		int[] arr = makeArray(10000);
		StopWatch1 s = new StopWatch1();
		s.start();
		bubbleSort(copyArray(arr));
		s.stop();
		System.out.println("elapsed time in milliseconds for bubble sort: " + s.getElapsedTime());
		s.start();
		insertionSort(copyArray(arr));
		s.stop();
		System.out.println("elapsed time in milliseconds for insertion sort: " + s.getElapsedTime());

	}
	public static void partOne() {
		//Part 1 of project, declares/instantiates/sorts 5 different arrays using each algorithm
				System.out.println("Bubble Sort");
				int[] arr1 = makeArray();
				printArray(arr1);
				bubbleSort(arr1);
				printArray(arr1);
				
				System.out.println("Insertion Sort");
				int[] arr2 = makeArray();
				printArray(arr2);
				insertionSort(arr2);
				printArray(arr2);
				
				System.out.println("Selection Sort");
				int[] arr3 = makeArray();
				printArray(arr3);
				selectionSort(arr3);
				printArray(arr3);
				
				System.out.println("Merge Sort");
				int[] arr4 = makeArray();
				printArray(arr4);
				mergeSort(arr4, 0, arr4.length-1);
				printArray(arr4);
				
				System.out.println("Quick Sort");
				int[] arr5 = makeArray();
				printArray(arr5);
				quickSort(arr5, 0, arr5.length-1);
				printArray(arr5);
	}
	/*
	 * Helper method used to create array for part 1 of the project. Creates an array of range -20 to 20.
	 * Pre-condition: Must declare array
	 * Post-condition Array is assigned random values in every place from -20 to 20
	 */
	private static int[] makeArray() {
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * (20 + 20 + 1)) - 20;
		}
		return arr;
	}
	/*
	 * Helper method meant to create an array of any given size, assuming the range to be 1 to size.
	 * Pre-condition: Must declare array
	 * Post-condition: Array is assigned random values in every place from 1 to size
	 */
	private static int[] makeArray(int size) {
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * (size)) + 1;
		}
		return arr;
	}
	/*
	 * Helper method meant to print any array
	 * Pre-condition: Must have declared and instantiated array
	 * Post-condition: Array is printed from console
	 */
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	/*
	 * Copies given array and returns a new array, meant to use in place of modifying the contents of the original array
	 * Pre-condition: Must define and instantite array of size > 0
	 * Post-condition: Copy array is returned with same values as original array
	 */
	private static int[] copyArray(int[] arr) {
		int[] arr2 = arr;
		return arr2;
	}
}
