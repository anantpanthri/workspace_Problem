package bloom18;
//[1,2,3,4,2,1],
public class increasingdecreasing {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,6,7,8,6,4,3,2,1};
		int t=6;
		int s=0;
		int e=arr.length-1;
		
		System.out.println(getTargetLeft(arr,s,e,t));
			
			
			
			
		}

	private static int getTargetLeft(int[] arr, int s, int e, int t) {
		while(s<e) {
			int mid=s+(-s+e)/2;
			if( arr[mid]==t) {
				System.out.println("got it");
				return mid;
			}
			else {
				if(t<arr[mid])
					s=mid+1;
				
				else if(t>arr[mid])
				{
					e=mid;
					
				}
				 
			}
		
	}
		return -1;
		
	}

}
