package Nile;
import java.util.*;
public class SearchMazeBFS {

	public static void main(String[] args) {

		int arr[][]= {
				{0,0,9},
				{0,1,1},
				{0,1,1}
		};
		int [][]dir= {{0,1},{0,-1},{1,0},{-1,0}};
		boolean[][]visited= new boolean[arr.length][arr[0].length];
		//use BFS to find the path from 0 to 9
		Queue<Cordinate> q= new LinkedList<Cordinate>();
		Cordinate startIndex= new Cordinate(2, 0);
		q.add(startIndex);
		while(!q.isEmpty()) {
			Cordinate temp=q.poll();
			for(int[] d:dir) {
			int newX=temp.x+d[0];
			int newY=temp.y+d[1];
			Cordinate cc= new Cordinate(newX, newY);
			if(newX>0&&newX<arr[0].length&&newY>0&&newY<arr[0].length&&arr[newX][newY]!=9&&arr[newX][newY]!=-1&&!visited[newX][newY]) {
				System.out.print(arr[newX][newY]);
				arr[newX][newY]=arr[newX][newY]+1;
				System.out.print(arr[newX][newY]);
				q.offer(cc);
				visited[newX][newY]=true;
			}
			}
		}System.out.println("This is it");
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[0].length;++j) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}

}
