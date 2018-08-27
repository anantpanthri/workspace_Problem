package Nile;
import java.util.*;
/*
{1,0,1,0,0,0,1,1,1,1},
{0,0,1,0,0,1,0,0,1,1},
{1,1,1,0,0,1,1,0,1,1},
{0,1,0,1,1,1,1,0,1,0},
{1,0,1,0,0,0,0,1,0,0},
{1,0,1,0,X,0,0,1,1,1},
{0,0,0,0,1,0,1,0,0,1},
{1,0,1,0,1,0,1,0,0,0},
{1,0,1,1,0,0,0,1,1,1},
{0,0,0,0,0,0,0,1,1,0}
*/
public class PaintBooleanMatrix {

	
	public static void main(String args[]) {
	int arr[][]= {
			{1,0,1,0,0,0,1,1,1,1},
			{0,0,1,0,0,1,0,0,1,1},
			{1,1,1,0,0,1,1,0,1,1},
			{0,1,0,1,1,1,1,0,1,0},
			{1,0,1,0,0,0,0,1,0,0},
			{1,0,1,0,0,0,0,1,1,1},
			{0,0,0,0,1,0,1,0,0,1},
			{1,0,1,0,1,0,1,0,0,0},
			{1,0,1,1,0,0,0,1,1,1},
			{0,0,0,0,0,0,0,1,1,0}
	};
	paintCells(arr,5,5);
	System.out.println("\n The paint strikes again \n");
	paintCells(arr,5,5);
	}

	private static void paintCells(int[][] arr, int row, int col) {
		Queue<Cordinate>q= new LinkedList<>();
		//boolean[][]visited= new boolean[10][10];
		int [][]dir= {{0,1},{0,-1},{1,0},{-1,0}};
		int oldColor=arr[row][col];
		arr[5][5]=Math.abs(arr[5][5]-1);
		Cordinate color= new Cordinate(5,5);
		q.add(color);
		while(!q.isEmpty()) {
			Cordinate temp=q.poll();
			for(int d[]:dir)
			{
				int newX=temp.x+d[0];
				int newY=temp.y+d[1];
				
				if(newX>=0 && newX< arr.length && newY>=0 && newY<arr[0].length && arr[newX][newY]==oldColor )
				{	
					arr[newX][newY]=arr[color.x][color.y];
					Cordinate cc= new Cordinate(newX,newY);
					q.offer(cc);
				
				}
			}
		}
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[0].length;++j) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		
		
	}
}
