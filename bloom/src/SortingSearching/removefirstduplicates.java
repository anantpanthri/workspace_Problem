package SortingSearching;

import java.util.Arrays;

public class removefirstduplicates {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,1,3,24,5,6,7,8,4,2,6,9};
		Arrays.sort(arr);
		
		int writeIndex=1;
		for(int i=1;i<arr.length;++i) {
			if(arr[i-1]!=arr[i]) {
				arr[writeIndex++]=arr[i];
				
			}
		}
		for(int i=0;i<writeIndex;++i) {
			System.out.println(arr[i]);
		}
		
	}

}
