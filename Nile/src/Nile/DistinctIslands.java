package Nile;
import java.util.*;
public class DistinctIslands {

	public static void main(String[] args) {
		int [][]grid=	{
						{1,1,0,1,1},
						{1,0,0,0,0},
						{0,0,0,0,1},
						{1,1,0,1,1}
						};
		calculateDistinctIslands(grid);
	}

	private static void calculateDistinctIslands(int[][] grid) {
		int m=grid.length;
		int n=grid[0].length;
		Set<List<List<Integer>>>islands= new HashSet<>();
		for(int i=0;i<grid.length;++i) {
			for(int j=0;j<grid[0].length;++j) {
				List<List<Integer>>island= new ArrayList<>();
				if(doDFS(i,j,i,j,m,n,grid,island))
					islands.add(island);
			}
		}
		System.out.println(islands.size());
	}

	private static boolean doDFS(int i0, int j0, int i, int j, int m, int n, int[][] grid, List<List<Integer>> island) {

		if(i<0||i>=m||j<0||j>=n||grid[i][j]<=0) return false;
		
		island.add(Arrays.asList(i-i0,j-j0));
		System.out.println((i-i0)+":"+(j-j0));
		grid[i][j]*=-1;
		
		doDFS(i0,j0,i+0,j+1,m,n,grid,island);
		doDFS(i0,j0,i+1,j+0,m,n,grid,island);
		doDFS(i0,j0,i+0,j-1,m,n,grid,island);
		doDFS(i0,j0,i-1,j+0,m,n,grid,island);
		
		
		return true;
	}

}
