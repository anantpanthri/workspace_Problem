package codility;
import java.util.*;
public class graphs {

	public static void main(String[] args) {
		int a[]= {9,1,4,9,0,4,8,9,0,1};
		//converting a 1D matrix to a 2d graph
		int arr[][]= new int[a.length][a.length];
		int city=0;
		for(int i=0;i<a.length;++i) {
			city=a[i];
			for(int j=0;j<a.length;++j)
			{
				if(j==city ) {
					arr[i][j]=1;
					arr[j][i]=1;
				}

			}
		}
		
//		for(int i=0;i<a.length;++i) {
//			for(int j=0;j<a.length;++j)
//			{
//				if(j==i ) {
//					arr[i][j]=0;
//				}
//
//			}
//		}
		
		
		Queue<int[]>q= new LinkedList<>();
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a.length;++j)
				if(arr[i][j]==1)
					q.add(new int[] {i,j});
		}
		
		while(!q.isEmpty()) {
			int [] top=q.remove();
			int row=top[0];
			int col=top[1];
			if(row>0&&arr[row-1][col]==0)
			{
				arr[row-1][col]=arr[row][col]+1;
				q.add(new int[] {row-1,col});
			}
			if(row<arr.length-1&&arr[row+1][col]==0)
			{
				arr[row+1][col]=arr[row][col]+1;
				q.add(new int[] {row+1,col});
			}
			if(col>0&&arr[row][col-1]==0)
			{
				arr[row][col-1]= arr[row][col]+1;
				q.add(new int[] {row,col-1});
			}
			if(col<arr[0].length-1&&arr[row][col+1]==0)
			{
				arr[row][col+1]=arr[row][col]+1;
				q.add(new int[] {row,col+1});
			}
			
		}
		
		
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a.length;++j)
			{
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}

	}

}
