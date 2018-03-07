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
	 *    1. Get middle index of list
	 *    2. If the middle index of the list is equal to the goal, return index
	 *    3. If middle index of list is greater than goal, binary search the bottom half of the list
	 *    4. If middle index of list is lesser than goal, binary search the top half of the list
	 * Pre: list must be sorted
	 * 
	 * @param list - integer list to search in
	 * @param num - integer to search for
	 * @return index of found item, -1 if not found
	 */
	public static int doBinarySearch(int[] list, int num, int min, int max)
	{

		int val = (min + max) / 2;
		if(list[val] == num) {
			return val;
		}
		else if(num > list[val]) {
			return doBinarySearch(list, num, val, max);
		}
		else {
			return doBinarySearch(list, num, min, val - 1);
		}
		  
	}
	/*
	 * Simplified calling method for binarySearch, allowing the client to call the method without passing the necessary parameters
	 */
	public static int binarySearch(int[] list, int num) {
		return doBinarySearch(list, num, 0, list.length - 1);
	}
}