package Nile;
import java.util.*;
public class BFS_DFS_Test {

	public static void main(String[] args) {

			int a[][]= {
					{1,1,1},{1,1,1},{1,1,1},{1,1,-1}
			};
			doBFS(a);
			for(int i=0;i<a.length;++i) {
				for(int j=0;j<a[0].length;++j) {
					System.out.print(a[i][j]+",");
					a[i][j]=1;
				}System.out.println();
			}
			a[3][2]=-1;
			doDFS(a,0,0);
			System.out.println("DFS beigns");
			for(int i=0;i<a.length;++i) {
				for(int j=0;j<a[0].length;++j) {
					System.out.print(a[i][j]+",");
					a[i][j]=0;
				}System.out.println();
			}
	}

	private static void doDFS(int[][] a,int i,int j) {
		if(i>=0&&i<a.length&&j>=0&&j<a[0].length &&a[i][j]!=-1&&a[i][j]==1) {
			a[i][j]=a[i][j]+1;
			doDFS(a, i+1, j);
			doDFS(a, i-1, j);
			doDFS(a, i, j+1);
			doDFS(a, i, j-1);
		}
		
	}

	private static void doBFS(int[][] a) {
		Queue<Cordinate>q= new LinkedList<>();
		Cordinate temp=new Cordinate(0, 0);
		q.offer(temp);
		int dir[][]= {{0,1},{0,-1},{1,0},{-1,0}};
		while(!q.isEmpty()) {
			Cordinate t=q.poll();
			for(int d[]:dir) {
				int newX=t.x+d[0];
				int newY=t.y+d[1];
			//	System.out.println(newX+":"+newY);
				if(newX>=0&&newX<a.length&&newY>=0&&newY<a[0].length&&a[newX][newY]!=-1&&a[newX][newY]==1) {
					a[newX][newY]=a[newX][newY]+1;
					q.offer(new Cordinate(newX,newY));
					
				}
			}
		}
		
	}

}
