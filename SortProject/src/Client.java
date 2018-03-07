
public class Client {

	public static void main(String[] args) {
		
	sortAll(1000);
	sortAll(5000);
	//sortAll(10000);
	//sortAll(50000);
	//sortFour(100000);
	//sortFour(500000);
	//sortTwo(1000000);
	//sortTwo(5000000);
	//sortAll(200000);
	//sortSorted200k();
	//sortRevSorted200k();
	//sortRand200k();
	int[] arr = makeArray(5000000);
	
	//Perform a linear search on an unsorted array
	linear(copyArray(arr), 533);
	Sort.mergeSort(copyArray(arr), 0, arr.length - 1);
	//Perform a linear search on a sorted array
	linear(arr, 533);
	//Perform a binary search on a sorted array
	binary(arr, 533);
	}
	/*
	 * uses a linear search to find the index of integer parameter goal, prints time taken to search, index if found, and -1 if not found
	 */
	public static void linear(int[] arr, int goal) {
		StopWatch1 s = new StopWatch1();
		s.start();
		Search.linearSearch(arr, goal);
		s.stop();
		System.out.printf("%10s%10s%10d%10s%10d%10s%10d", "\nLinear search", "Goal ", goal, "Index", Search.linearSearch(arr, goal), " Time taken", s.getElapsedTime());
	}
	/*
	 * uses a binary search to find the index of integer parameter goal, prints time taken to search, index if found, and -1 if not found
	 */
	public static void binary(int[] arr, int goal) {
		Sort.mergeSort(arr, 0, arr.length - 1);
		StopWatch1 s = new StopWatch1();
		s.start();
		Search.binarySearch(arr, goal);
		s.stop();
		System.out.printf("%10s%10s%10d%10s%10d%10s%10d", "\nBinary search", "Goal ", goal, " Index ", Search.binarySearch(arr, goal), " Time taken", s.getElapsedTime());
		System.out.println(arr[Search.binarySearch(arr, goal)]);
	}
	/*
	 * Defines instantiates an array of given size, then sorts said array with all five sorting algorithms, printing the time taken to sort each list. Copies of the array
	 * are made and passed for each sort, so each algorithm is given an unsorted array.
	 * Pre-condition: None
	 * Post-condition: Statement printed giving the time taken for each sort
	 * 
	 * @param size of array to be sorted
	 */
	public static void sortAll(int size) {
		int bubble = 0;
		int insertion = 0;
		int selection = 0;
		int merge = 0;
		int quick = 0;
		StopWatch1 s = new StopWatch1();
		int[] arr = makeArray(size);
		s.start();
		Sort.bubbleSort(copyArray(arr));
		s.stop();
		bubble = (int) s.getElapsedTime();
		
		
		s.start();
		Sort.insertionSort(copyArray(arr));
		s.stop();
		insertion = (int) s.getElapsedTime();
		
		s.start();
		Sort.selectionSort(copyArray(arr));
		s.stop();
		selection = (int) s.getElapsedTime();
		
		s.start();
		Sort.mergeSort(copyArray(arr), 0, arr.length - 1);
		s.stop();
		merge = (int) s.getElapsedTime();
		
		s.start();
		Sort.quickSort(copyArray(arr), 0, arr.length - 1);
		s.stop();
		quick = (int) s.getElapsedTime();
		System.out.printf("%12d%10s%10s%10s%10s%10s", size, "Bubble", "Insertion", "Selection", "Merge", "Quick\n");
		System.out.printf("%12s%10d%10d%10d%10d%10d%10s", "Time", bubble, insertion, selection, merge, quick, "\n");
	}
	
	/*
	 * Defines instantiates an array of given size, then sorts said array with four sorting algorithms(excluding bubble), printing the time taken to sort each list. Copies of the array
	 * are made and passed for each sort, so each algorithm is given an unsorted array.
	 * Pre-condition: None
	 * Post-condition: Statement printed giving the time taken for each sort
	 * 
	 * @param size of array to be sorted
	 */
	public static void sortFour(int size) {
		int insertion = 0;
		int selection = 0;
		int merge = 0;
		int quick = 0;
		StopWatch1 s = new StopWatch1();
		int[] arr = makeArray(size);
		
		s.start();
		Sort.insertionSort(copyArray(arr));
		s.stop();
		insertion = (int) s.getElapsedTime();
		
		s.start();
		Sort.selectionSort(copyArray(arr));
		s.stop();
		selection = (int) s.getElapsedTime();
		
		s.start();
		Sort.mergeSort(copyArray(arr), 0, arr.length - 1);
		s.stop();
		merge = (int) s.getElapsedTime();
		
		s.start();
		Sort.quickSort(copyArray(arr), 0, arr.length - 1);
		s.stop();
		quick = (int) s.getElapsedTime();
		
		System.out.printf("%12d%10s%10s%10s%10s", size, "Insertion", "Selection", "Merge", "Quick\n");
		System.out.printf("%12s%10d%10d%10d%10d%10s", "Time", insertion, selection, merge, quick, "\n");
	}
	
	/*
	 * Defines instantiates an array of given size, then sorts said array with two sorting algorithms(merge and quick), printing the time taken to sort each list. Copies of the array
	 * are made and passed for each sort, so each algorithm is given an unsorted array.
	 * Pre-condition: None
	 * Post-condition: Statement printed giving the time taken for each sort
	 * 
	 * @param size of array to be sorted
	 */
	public static void sortTwo(int size) {
		int merge = 0;
		int quick = 0;
		System.out.println("With array size of " + size);
		StopWatch1 s = new StopWatch1();
		int[] arr = makeArray(size);
		
		s.start();
		Sort.mergeSort(copyArray(arr), 0, arr.length - 1);
		s.stop();
		merge = (int) s.getElapsedTime();
		
		s.start();
		Sort.quickSort(copyArray(arr), 0, arr.length - 1);
		s.stop();
		quick = (int) s.getElapsedTime();
		
		System.out.printf("%12d%10s%10s", size, "Merge", "Quick\n");
		System.out.printf("%12s%10d%10d%10s", "Time", merge, quick, "\n");
	}
	/*
	 * Defines and instantiates an array of size 200k, sorts said array, then times each sort(excluding bubble) and prints the results
	 * Pre-condition: None
	 * Post-condition Array is created and results are printed for each sort of sort
	 */
	public static void sortSorted200k() {
		
		int insertion = 0;
		int selection = 0;
		int merge = 0;
		int quick = 0;
		
		int[] arr = makeArray(200000);
		Sort.quickSort(arr, 0, arr.length - 1);
		
		StopWatch1 s = new StopWatch1();
		s.start();
		Sort.insertionSort(arr);
		s.stop();
		insertion = (int) s.getElapsedTime();
		
		s.start();
		Sort.selectionSort(arr);
		s.stop();
		selection = (int) s.getElapsedTime();
		
		s.start();
		Sort.mergeSort(arr, 0, arr.length - 1);
		s.stop();
		merge = (int) s.getElapsedTime();
		
		s.start();
		Sort.quickSort(arr, 0, arr.length - 1);
		s.stop();
		quick = (int) s.getElapsedTime();
		
		System.out.println("Sort a sorted data set of 200,000");
		System.out.printf("%12d%10s%10s%10s%10s", 200000, "Insertion", "Selection", "Merge", "Quick\n");
		System.out.printf("%12s%10d%10d%10d%10d%10s", "Time", insertion, selection, merge, quick, "\n");
	}
	/*
	 * Defines and instantiates an array of size 200k, reverse sorts said array, then times each sort(excluding bubble) and prints the results
	 * Pre-condition: None
	 * Post-condition Array is created and results are printed for each sort of sort
	 */
	public static void sortRevSorted200k() {
		int insertion = 0;
		int selection = 0;
		int merge = 0;
		int quick = 0;
		int[] arr = makeArray(200000);
		Sort.mergeSort(arr, 0, arr.length - 1);
		for(int i = arr.length; i > 0; i--) {
			arr[i] = arr.length - i;
		}
		
		StopWatch1 s = new StopWatch1();
		s.start();
		Sort.insertionSort(arr);
		s.stop();
		insertion = (int) s.getElapsedTime();
		
		s.start();
		Sort.selectionSort(arr);
		s.stop();
		selection = (int) s.getElapsedTime();
		
		s.start();
		Sort.mergeSort(arr, 0, arr.length - 1);
		s.stop();
		merge = (int) s.getElapsedTime();
		
		s.start();
		Sort.quickSort(arr, 0, arr.length - 1);
		s.stop();
		quick = (int) s.getElapsedTime();
		
		System.out.println("Sort a reverse sorted data set of 200,000");
		System.out.printf("%12d%10s%10s%10s%10s", 200000, "Insertion", "Selection", "Merge", "Quick\n");
		System.out.printf("%12s%10d%10d%10d%10d%10s", "Time", insertion, selection, merge, quick, "\n");
	}
	/*
	 * Defines and instantiates an array of size 200k, with each value being random from 1-20, then times each sort(excluding bubble) and prints the results
	 * Pre-condition: None
	 * Post-condition Array is created and results are printed for each sort of sort
	 */
	public static void sortRand200k() {
		int insertion = 0;
		int selection = 0;
		int merge = 0;
		int quick = 0;
		int[] arr = new int[200000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20) + 1;
		}
		
		StopWatch1 s = new StopWatch1();
		s.start();
		Sort.insertionSort(arr);
		s.stop();
		insertion = (int) s.getElapsedTime();
		
		s.start();
		Sort.selectionSort(arr);
		s.stop();
		selection = (int) s.getElapsedTime();
		
		s.start();
		Sort.mergeSort(arr, 0, arr.length - 1);
		s.stop();
		merge = (int) s.getElapsedTime();
		
		s.start();
		Sort.quickSort(arr, 0, arr.length - 1);
		s.stop();
		quick = (int) s.getElapsedTime();
		
		System.out.println("Sort a sorted data set of 200,000");
		System.out.printf("%12d%10s%10s%10s%10s", 200000, "Insertion", "Selection", "Merge", "Quick\n");
		System.out.printf("%12s%10d%10d%10d%10d%10s", "Time", insertion, selection, merge, quick, "\n");
	}
	
	/*
	 * Part 1 of project, declares/instantiates/sorts 5 different arrays using each algorithm
	 */
	public static void partOne() {
		
				System.out.println("Bubble Sort");
				int[] arr1 = makeArray();
				printArray(arr1);
				Sort.bubbleSort(arr1);
				printArray(arr1);
				
				System.out.println("Insertion Sort");
				int[] arr2 = makeArray();
				printArray(arr2);
				Sort.insertionSort(arr2);
				printArray(arr2);
				
				System.out.println("Selection Sort");
				int[] arr3 = makeArray();
				printArray(arr3);
				Sort.selectionSort(arr3);
				printArray(arr3);
				
				System.out.println("Merge Sort");
				int[] arr4 = makeArray();
				printArray(arr4);
				Sort.mergeSort(arr4, 0, arr4.length-1);
				printArray(arr4);
				
				System.out.println("Quick Sort");
				int[] arr5 = makeArray();
				printArray(arr5);
				Sort.quickSort(arr5, 0, arr5.length-1);
				printArray(arr5);
	}
	/*
	 * Helper method used to create array for part 1 of the project. Creates an array of range -20 to 20.
	 * Pre-condition: Must declare array
	 * Post-condition Array is assigned random values in every place from -20 to 20
	 * 
	 * @return Array of size 20 with values of -20 to 20
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
	 * 
	 * @param Size of array to be made
	 * @return array of size size
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
	 * 
	 * @param Array to be printed
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
	 * 
	 * @param Array to be copied
	 * @return New array with copied values
	 */
	private static int[] copyArray(int[] arr) {
		int[] copy = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
}
