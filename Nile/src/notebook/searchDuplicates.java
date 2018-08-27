package notebook;

public class searchDuplicates {

	public static void main(String[] args) {

		int[]a= {-14,-10,2,108,243,285,285,401};
		int s=0;
		int e=a.length-1;
		int t=285;int res=0;
		while(s<e) {
			int mid=(s+e)/2;
			if(a[mid]==t)
			{	res=mid;
				e=mid-1;
				//s=mid+1 if you need the last occurrence
			}
			else if(a[mid]<t) {
				s=mid+1;
			}
			else
				e=mid;
		}
		System.out.println(res);
	}

}
