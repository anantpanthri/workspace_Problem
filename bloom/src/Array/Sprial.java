package Array;
//left for a later time
public class Sprial {

	public static void main(String[] args) {
		int [][] a={
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		       };
		boolean [][]visited=new  boolean [a[0].length][a[0].length];
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a.length;++j) {
				if(!visited[i][j]) {
					visited[i][j]=true;
					
				}
				
			}
		}
		
		
		
	}

}
