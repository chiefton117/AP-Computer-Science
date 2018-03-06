/******************************************************************
 * A Project of Sorts
 * 
 * Implements Sort Algorithms on integer arrays
 * Includes Bubble, Insertion, Selection, Merge, and Quick Sorts
 * Merge and Quick Sorts are recursive
 * All Sort methods are static
 * All Sort helper methods are private
 * 
 * @author 
 *
 *******************************************************************/
public class Sort extends Search
{
  
  /************************
   * Implements Bubble Sort
   *  1.Scan list and compare adjacent elements
   *  2.Swap if out of order and set a flag
   *  3.Repeat 1-2 until no swaps are made (flag is false)
   *    scanning one less at the end each pass
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void bubbleSort(int[] arr)
  {
	  int c = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}
  }
  
  /************************
   * Implements Insertion Sort
   *  1.Start with a sorted list of one value
   *  2.Add another value and sort the values, placing in correct location
   *  3.Repeat 2-3 shifting sorted values to the right until it is placed
   *    in the correct position
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void insertionSort(int[] arr)
  {
	  int temp = 0;
		for(int j = 0; j < arr.length; j++) {
			for(int i = 1; i < arr.length; i++) {
	
				if(arr[i] < arr[i-1]) {
					temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
				}
			}
		}

  }
  
  /************************
   * Implements Selection Sort
   *  1.Scan the list to find the smallest value
   *  2.Swap with first position
   *  3.Repeat 1-2 Scanning and swapping with the next position in the list
   *    Until you are at the end of the list
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void selectionSort(int[] arr)
  {
	  int temp = 0;
		for(int i = 0; i < arr.length; i++) {

			int index = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[index] > arr[j]) {
					temp = arr[index];
					arr[index] = arr[j];
					arr[j] = temp;
				}
			}
		}	
  }
  
  /************************
   * Implements Merge Sort recursively
   *  1.Divide the list in half
   *  2.Sort each half (recursively)
   *  3.Merge the two sorted lists
   *  Note: Use indexes into the array to mark two sublists
   *        and a temporary array when merging
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void mergeSort(int[] arr, int l, int r)
  {
	  if(l < r) {
			int m = (l + r) / 2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			
			Merge(arr, l, m, r);
		}
  }
  private static void Merge(int[] arr, int l, int m, int r) {
		
		int[] arr2 = new int[r - l + 1];
		
		
		int j = l;
		int k = m + 1;
		int n = 0;
		
		
		while(j <= m && k <= r) {
			
			if(arr[j] < arr[k]) {
				arr2[n] = arr[j];
				j++;
			}
			else {
				arr2[n] = arr[k];
				k++;
			}
			n++;
		}
		
		while(j <= m) {
			arr2[n] = arr[j];
			j++;
			n++;
		}
		while(k <= r) {
			arr2[n] = arr[k];
			k++;
			n++;
		}
		for(int i = 0; i < arr2.length; i++) {
			arr[l+i] = arr2[i];
		}
	}
  /************************
   * Implements Quick Sort recursively
   *  1.Divide into two sublists, < and > a pivot value
   *  2.Recursively sort each sublist
   *  Use the first element in the list as the pivot
   *  Note: Use indexes into the array to mark two sublists
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void quickSort(int[] arr, int low, int high)
  {
 
	  if (low < high)
      {
          int pi = partition(arr, low, high);

          quickSort(arr, low, pi-1);
          quickSort(arr, pi+1, high);
      }
  }
  public static int partition(int arr[], int low, int high)
  {
      int pivot = arr[high]; 
      int i = (low-1);
      for (int j=low; j<high; j++)
      {
    
          if (arr[j] <= pivot)
          {
              i++;

         
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
      }

      int temp = arr[i+1];
      arr[i+1] = arr[high];
      arr[high] = temp;

      return i+1;
  }
  
  
}