package ford;

public class roatatedarray {

	public static void main(String[] args) {
		int arr[]={4,5,6,7,0,1,2};
		int s=0,e=arr.length-1;
		int t=2;
		while(s<e) {
			int m=(s+e)/2;
			if(arr[m]>arr[e])s=m+1;
			else e=m-1;
		}
		int ro=s;
		
		s=0;e=arr.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			int realmid=(mid+ro)%arr.length;
			if(arr[realmid]==t) {
				System.out.println("this is the number at index  "+arr[realmid]+" index  "+realmid);
				break;
			}
			if(arr[realmid]>t)e=mid-1;
			else s=mid+1;
			
		}

	}
}

