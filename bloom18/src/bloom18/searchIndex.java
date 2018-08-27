package bloom18;

//search first occurrence of index in o(log(n))
public class searchIndex {

	public static void main(String[] args) {
		int a[]= {-14,-10,2,108,108,243,285,285,285,401};
		int s=0;
		int e=a.length-1;
		int t=a[7];
		int res=0;
		while(s<e) {
			int m=s+(e-s)/2;
			if(a[m]==t) {
				res=m;
				System.out.println(res);
				e=m;//just this tweak 20%
				//if you need to search the last entry then the tweak should be 
				//s=m+1                              
			}
			else if(t<a[m]) {
				e=m;
			}
			else {
				s=m+1;
				
			}
		}
		System.out.println(res);
		
	}

}
