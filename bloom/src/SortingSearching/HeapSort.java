package SortingSearching;

public class HeapSort {

	public static void main(String[] args) {
		int [] arr= {12,11,13,5,6,7,18};
		int n=arr.length;
		HeapSort ob= new HeapSort();
		ob.sort(arr);
		System.out.println("Sorted array is");
		printArray(arr);

	}
	private static void printArray(int[] arr) {
		for(int i:arr)
			System.out.print(i+",");
	}
	private void sort(int[] arr) {
		int n=arr.length;
		for(int i=(n/2-1);i>=0;--i) {
			heapify(arr,n,i);
		}
		printArray(arr);
		for(int i=n-1;i>=0;--i) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr,i,0);
		}
	}
	private void heapify(int[] arr, int n, int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n&&arr[l]>arr[largest])
			largest=l;
		if(r<n&&arr[r]>arr[largest])
			largest=r;
		if(largest!=i) {
			int swap=arr[i];
			arr[i]=arr[largest];
			arr[largest]=swap;
			
			heapify(arr,n,largest);
			
		}
		
		

		
	}

}
