package ford;
import java.util.*;

public class kClosest {

	public static void main(String[] args) {
		int k=3;
		int x=5;
		int [] arr= {0,0,1,2,3,3,4,7,7,8};
		int lo = 0, hi = arr.length - k;
	    while (lo < hi) {
	        int mid = (lo + hi) / 2;
	        if (x - arr[mid] > arr[mid+k] - x)
	        {
	        	lo = mid + 1;
	        	System.out.println(lo);
	        }
	        else {
	        	hi = mid;
	            
	        }
	    }
	    List<Integer>ls= new ArrayList<Integer>();
	    for(int i=lo;i<lo+k;++i) {
	    	ls.add(arr[i]);
	    }
		
	}

}
