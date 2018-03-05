
public class Sorting {


	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 10, 9, 4, 8, 2, 7, 6};
		for( int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		Bubble(arr);
		for( int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println();
		int[] arr2 = {1, 5, 3, 10, 9, 4, 8, 2, 7, 6};
		for( int a : arr2) {
			System.out.print(a + " ");
		}
		System.out.println();
		Selection(arr2);
		for( int a : arr2) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println();
		int[] arr3 = {1, 5, 3, 10, 9, 4, 8, 2, 7, 6};
		for( int a : arr3) {
			System.out.print(a + " ");
		}
		System.out.println();
		Insertion(arr3);
		for( int a : arr3) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println();
		int[] arr4 = {1, 5, 3, 10, 9, 4, 8, 2, 7, 6};
		for( int a : arr4) {
			System.out.print(a + " ");
		}
		System.out.println();
		mergeSort(arr4, 0, arr4.length-1);
		for( int a : arr4) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println();
		int[] arr5 = {1, 5, 3, 10, 9, 4, 8, 2, 7, 6};
		for( int a : arr5) {
			System.out.print(a + " ");
		}
		System.out.println();
		quickSort(arr5, 0, arr5.length-1);
		for( int a : arr5) {
			System.out.print(a + " ");
		}
		System.out.println();

	}
	public static void Bubble(int[] arr) {
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
	public static void Selection(int[] arr) {
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
	public static void Insertion(int[] arr) {
		
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
	
	public static void Merge(int[] arr, int l, int m, int r) {
		
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
	public static void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
			int m = (l + r) / 2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			
			Merge(arr, l, m, r);
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
	public static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
 
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
}
}