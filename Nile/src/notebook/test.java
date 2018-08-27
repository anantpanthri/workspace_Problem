package notebook;

public class test {

	public static void main(String args[]) {
		int []a= {1,4,6,7,8,9,12};
		//number greater than 5
		int t=5;
		int e=a.length-1;
		int s=0;
		while(s<e) {
			int mid=(e-s)/2+s;
			if(a[mid]<t)
			s=mid+1;
			else
				e=mid;
		}
		System.out.println(a[s]);
		}
	}
