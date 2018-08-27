import java.util.*;
public class kadane {

	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		kadane(arr);
	}

	private static void kadane(int[] arr) {
		int max=0;
		int maxstart=-1;
		int maxend=-1;
		int currentstart=0;
		int maxsofar=0;
				for(int i=0;i<arr.length;++i) {
					maxsofar+=arr[i];
					if(maxsofar<0) {
						maxsofar=0;
						currentstart=i+1;
					}
					if(max<maxsofar) {
						maxstart=currentstart;
						maxend=i;
						max=maxsofar;
					}
					
				}
				System.out.println(max);
				
		
		
	}

}
