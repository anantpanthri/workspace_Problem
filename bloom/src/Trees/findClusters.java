package Trees;

public class findClusters {
	public static final int offsets[]= {-1,0,1};//this will subttract 
	//1 add 1 to the data that means it will check if the data next 
	//to it or previous to it was 1 or not (both ways column and row wise)
	public static void main(String[] args) {
		int[][] arr = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1},
             };
		System.out.println(findclusters(arr));
	}
	//[
	//["1","1","0","0","0"],
	//["1","1","0","0","0"],
	//["0","0","1","0","0"],
	//["0","0","0","1","1"]
	//]
	private static int findclusters(int[][] arr) {
		boolean visited[][]= new boolean[arr.length][arr[0].length];
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;++j) {
				if(arr[i][j]==1&&!visited[i][j]) {
					c+=1;
				doDFS(arr,i,j,visited);
				}
			}
		}
		return c;
	}
	private static void doDFS(int[][] arr, int i, int j, boolean[][] visited) {
		if(visited[i][j])
		return;
		visited[i][j]=true;
		
		int xoffset,yoffset;
		

//	for(int l=0;l<offsets.length;++l) {
//			xoffset=offsets[l];
//			for(int m=0;m<offsets.length;++m) {
//				yoffset=offsets[m];
//				//do not consider xoffset and yoffset as its own neighbors
//				if(xoffset==0&&yoffset==0)
//					continue;
//				
//				if(neighboursExist(arr,i+xoffset,j+yoffset)) {
//					System.out.println("x:"+xoffset+" y:"+xoffset);
//					doDFS(arr, i+xoffset,j+yoffset, visited);
//				}
//				
//			}
//		}
		
		
		if(neighboursExist(arr,i-1,j+0))
			doDFS(arr, i-1,j+0, visited);
		if(neighboursExist(arr,i+0,j-1))
			doDFS(arr, i+0,j-1, visited);
	    if(neighboursExist(arr,i-1,j-1))
	    	        doDFS(arr, i-1,j-1, visited);
	    if(neighboursExist(arr,i+1,j+0))
	    		doDFS(arr, i+1,j+0, visited);
	    if(neighboursExist(arr,i+0,j+1))
	    		doDFS(arr, i+0,j+1, visited);
	    if(neighboursExist(arr,i+1,j+1))
	    		doDFS(arr, i+1,j+1, visited);
       

	
	}
		
	private static boolean neighboursExist(int[][] arr, int i, int j) {
		if(i>=0 && i<arr.length && j>=0 && j<arr[0].length)
			{if(arr[i][j]==1)
				{return true;}
			}
		return false;
	}
	

}
