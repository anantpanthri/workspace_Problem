package SortingSearching;

public class PivotedArraySearch {

	public static void main(String[] args) {
		// The array is pivoted and we have to search the element
		int [] arr= {27,35,39,45,11,23,24};
		
		int lo=0;
		int hi=arr.length-1;
		while(lo<hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]>arr[hi]) {
				lo=mid+1;
			}
			else
				hi=mid;
		}
		int ro=lo;
		 lo=0;
		 hi=arr.length-1;
		 int t=45;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			int realmid=(mid+ro)%arr.length;
			System.out.println("mid+ "+mid+" ro "+ro+" %arr.length "+arr.length+ "= "+realmid);
			if(arr[realmid]==t) {
				System.out.println(realmid);
				break;
			}
			if(arr[realmid]<t)
				lo=mid+1;
			else
				hi=mid-1;
			
		}
		
		
}
	
}
