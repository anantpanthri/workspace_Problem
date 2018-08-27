package SortingSearching;

public class Searchpivotedarray {

	public static void main(String[] args) {
		int []a= {4,5,6,7,0,1,2};
		int t=2;
		//this has been pivoted
		int hi=a.length-1;
		int low=0;
		
		while(low<hi) {
			int mid=(low+hi)/2;
			if(a[mid]>a[hi])
				low=mid+1;
			else
				hi=mid;
		}
		 int rot=low;
	     int   lo=0;hi=a.length-1;
	        // The usual binary search and accounting for rotation.
	        while(lo<=hi){
	            int mid=(lo+hi)/2;
	            int realmid=(mid+rot)%a.length;
	            /*
	             * to eliminate this condition of a[realmid] used mid
	            if(realmid==7)
	            	realmid=0;
	            */
	            System.out.println(mid+"+"+rot+" %7 ="+realmid+" value "+a[realmid]); 
	            if(a[realmid]==t)break;
	            if(a[realmid]<t)lo=mid+1;
	            else hi=mid-1;
	        }
		
		

	}

}
