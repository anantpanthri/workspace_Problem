package Nile;
import java.util.*;
public class ComputeEnclosedRegions {

	public static void main(String[] args) {

		computeEnclosure();
	}

	private static void computeEnclosure() {
		
		char a[][]= {
				{'B','B','B','B'},	
				{'W','B','W','B'},
				{'B','W','W','B'},
				{'B','B','B','B'}
		};
		//Algorithm change the color of W close to boundary 
		//so that it doesn't hamper the BFS
		for(int i=0;i<a.length;++i) {
				a[0][i]=a[0][i]=='W'?'T':a[0][i];
				a[i][0]=a[i][0]=='W'?'T':a[i][0];
		}
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a[0].length;++j) {
				if(a[i][j]=='W')
				{
					BFSClosure(a,i,j);
					break;
				}
			}
		}
		for(int i=0;i<a.length;++i) {
			a[0][i]=a[0][i]=='T'?'W':a[0][i];
			a[i][0]=a[i][0]=='T'?'W':a[i][0];
	}
		
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a.length;++j) {
				System.out.print(a[i][j]);
			}System.out.println();
		}
	 
	
		
		
	}

	private static void BFSClosure(char[][] a, int i, int j) {
		Queue<Cordinate>q= new LinkedList<>();
		Cordinate n= new Cordinate(i, j);
		int [][] dir= {{1,0},{-1,0},{0,-1},{0,1}};
		q.offer(n);
		while(!q.isEmpty()) {
			Cordinate temp=q.poll();
			for(int d[]:dir){
				int newX=temp.x+d[0];
				int newY=temp.y+d[1];
if(newX<a.length&&newX>=0&&newY<a[0].length&&newY>=0&&a[newX][newY]=='W')
			{
				a[newX][newY]='B';
				Cordinate cc= new Cordinate(newX,newY);
				q.offer(cc);
			}
			
			}
				
		}
		
		
		
	}

}
