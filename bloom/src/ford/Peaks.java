package ford;

import java.util.Arrays;

public class Peaks {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,5,6,4};
		//output {1,0,7,4,9,8,}
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i+=2) {
			//
			swap(arr,i-1,i);
		}
		
		for(int i:arr) {
			System.out.print(i+",");
		}
		int max=Integer.MIN_VALUE;
        int maxIndex=0;
		for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
		System.out.println("max"+max+"maxIndex"+maxIndex);
	}

	private static int maxIndex(int arr[],int aIndex,int bIndex,int cIndex) {
		
		int l=arr.length;
		int aValue=aIndex<l?arr[aIndex]:Integer.MIN_VALUE;
		int bvalue=bIndex<l?arr[bIndex]:Integer.MIN_VALUE;
		int cValue=cIndex<l?arr[cIndex]:Integer.MIN_VALUE;
		int max=Math.max(aValue, Math.max(bvalue, cValue));
		if(aValue==max)return aIndex;
		else if(bvalue==max)return bIndex;
		else return cIndex;
		
	}
	
	private static void swap(int[] arr, int i, int i2) {
		int temp=arr[i];
		arr[i]=arr[i2];
		arr[i2]=temp;
		
	}

}
