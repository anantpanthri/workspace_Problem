package walmart;

public class QuickSort {
	
	public static void main(String args[]) {
		int arr[]= {1, 12, 5, 26, 7, 14, 3, 7, 2};
		int left=0;
		int right=8;
		
		quicksort(arr,left,right);
		for(int a:arr)
			System.out.println(a);
	}

	private static void quicksort(int[] arr, int left, int right) {
		 int index=partition(arr,left,right);
		 if(left<index-1) {
			 quicksort(arr, left, index-1);
		 }
		 if(right>index) {
			 quicksort(arr, index, right);
		 }
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot=arr[(left+right)/2];
		int temp=0;
		int i=left;
		int j=right;
		while(i<=j) {
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
}
