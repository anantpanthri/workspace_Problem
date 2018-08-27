package bloom18;
public class uniqueElementUsingDP {

	public static void main(String[] args) {
		int t[][]= {
				{0,0},
				{1,1},
				{0,0}
			};
		
	int r=t.length;
	int c=t[0].length;
	int dp[][]=new int[r][c];
	
	for(int i=0;i<t.length;++i) {
		if(t[i][0]==1)
			break;
		dp[i][0]=1;
	}
	for(int i=0;i<t[0].length;++i) {
		if(t[0][i]==1)
			break;
		dp[0][i]=1;
	}	
		
	for(int i=1;i<t.length;++i) {
		for(int j=1;j<t[0].length;++j) {
			if(t[i][j] != 1)
			dp[i][j]=dp[i-1][j]+dp[i][j-1];
		}
		
	}
	
	System.out.println(dp[r-1][c-1]);
	
	
	
	
	
	}
	 
}
