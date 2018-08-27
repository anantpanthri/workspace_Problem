package revisE;

public class mergeSort1 {
	public static void main(String[] args) {
		int [] arr= {9,8,7,6,5,4,3,2,1};
		mergeSort(arr);
		for(int i:arr) {
			System.out.print(i+",");
		}
	}

	private static void mergeSort(int[] arr) {
		int left=0;
		int end=arr.length-1;
		mergeSort(arr,left,end);
	}

	private static void mergeSort(int[] arr, int left, int end) {
		if(left<end) {
		int mid=(left+end)/2;
		mergeSort(arr,left,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,left,mid,end);
		printArray(arr);
	}
	}
	private static void merge(int[] arr, int left, int mid, int end) {
		int n1=mid-left+1;
		int n2=end-mid;
		int L[]= new int[n1];
		int R[]= new int[n2];
		int i = 0,j=0;
		int k=left;
		//copying data
		  for (int i1=0; i1<n1; ++i1)
	            L[i1] = arr[left + i1];
	        for (int j1=0; j1<n2; ++j1)
	            R[j1] = arr[mid + 1+ j1];
		while(i<n1&&j<n2) {
			if(L[i]<=R[j]) {
				arr[k++]=L[i++];
			}
			else {
				arr[k++]=R[j++];
			}
		}
		//if the array is not filled fully as && is used above
		while(i<n1) {
			arr[k++]=L[i++];
		}
		while(j<n2) {
			arr[k++]=R[j++];
		}
	}
	private static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+",");
		}
		System.out.println();
	}
}
