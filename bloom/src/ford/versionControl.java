package ford;

public class versionControl {

	public static void main(String[] args) {
		int n=2126753390;
		int start=0;
		int end=n;
		int fbv=1;//first bad version
	        while(start<=end){
	        	int mid= start+(-start+end)/2;
	        System.out.println(mid);
	            if(isBadVersion(mid)){
	                fbv=mid;
	                end=mid-1;
	            }
	            else{
	                start=mid+1;
	            }
	        }
	        if(start==end)System.out.println(start);
	       System.out.println("ans"+fbv);

	}

	private static boolean isBadVersion(int mid) {
		if(mid==4)
			return true;	
		return false;
	}

	
	
	
}
