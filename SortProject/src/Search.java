/******************************************************************
 * A Project of Sorts
 * 
 * Implements Search Algorithms on integer arrays
 * Includes Linear and Binary searches
 * Binary Search requires a sorted list
 * All Search methods are static
 * All Search helper methods are private
 * 
 * @author 
 *
 *******************************************************************/
public class Search 
{
	/**
	 * Implements a Linear Search
	 *    1. Iterate through each element in array
	 *    2. If number is found in array at current iteration, return number array
	 *    3. If number is not found in array, return -1
	 * @param list - integer list to search in
	 * @param num - integer to search for
	 * @return index of found item, -1 if not found
	 */
	public static int linearSearch(int[] list, int num)
	{
		for(int i = 0; i < list.length; i++) {
			if(list[i] == num) {
				return i;
			}	
		}
		return -1;
	}
	
	/**
	 * Implements a Binary Search
	 *    <Include Algorithm Steps here>
	 * Pre: list must be sorted
	 * 
	 * @param list - integer list to search in
	 * @param num - integer to search for
	 * @return index of found item, -1 if not found
	 */
	public static int binarySearch(int[] list, int num)
	{
		if(list[list.length / 2] < num) {
			int[] arr = new int[list.length / 2];
			for(int i = 0; i < list.length / 2; i++) {
				arr[i] = list[i + (list.length / 2)];
			}
			binarySearch(arr, num);
		}
		else if(list[list.length / 2] > num) {
			int[] arr = new int[list.length / 2];
			for(int i = 0; i < list.length / 2; i++) {
				arr[i] = list[i];
			}
			binarySearch(arr, num);
		}
		else if(list[list.length / 2] == num) {
			return list[list.length / 2];
		}
		return -1;
	}
}