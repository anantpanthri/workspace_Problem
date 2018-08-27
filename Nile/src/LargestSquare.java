public class LargestSquare {
	public static void main(String[] args) {
		
		int a[][]= {
				{1,1,0,1,0},
				{0,1,1,1,0},
				{1,1,1,1,0},
				{0,1,1,1,1} 
		};
		int cache[][]=a.clone();
		
		int max=0;
		int newI=0;
		int newJ=0;
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a[0].length;++j) {
				if(i==0||j==0)continue;
				else {
					if(a[i][j]!=0) {
					cache[i][j]=1+Math.min(a[i-1][j],
							Math.min(a[i-1][j-1], a[i][j-1]));
					if(max<cache[i][j]) {max=cache[i][j];
					newI=i;
					newJ=j;
					}
					}
				}
			}
		}
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a[0].length;++j) {
		//	System.out.print(cache[i][j]+",");
			}
			System.out.println();
			}
		for(int i=a.length-newI;i<=newI;++i)
		{
			for(int j=a[0].length-newJ-1;j<=newJ;++j) {
				System.out.print(a[i][j]+",");
				
			}
			System.out.println();
		}
	}

}
