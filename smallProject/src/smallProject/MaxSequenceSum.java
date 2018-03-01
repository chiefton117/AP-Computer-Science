package smallProject;

public class MaxSequenceSum {

	public static void main(String[] args) {
		
		int[] arr = {1, -2, 6, -4, 5, 11, -6, 2, 5, -1};
		
		for(int a : Sort(arr)) {
			System.out.print(a + " ");
		}
	}
	public static int[] Sort(int[] arr) {
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			
			
			int min = 99999999;
			int mindex = -1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < min) {
					min = arr[i];
					mindex = i;
				}
				System.out.println(min);
			}
			arr = arr[0-mindex];
			
			
		}
		return arr2;
	}
	//Remove lowest element from array when found
	/*public static int getMin(int start, int[] arr) {
		int min = 99999999;
		int mindex = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				mindex = i;
			}
			System.out.println(min);
		}
		arr[mindex] = null;
		return min; 
	}
	*/
}
