package arrays;

import java.util.*;

public class spiralmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {
					   {1,2,3,4},
					   {10,11,12,5},
					   {9,8,7,6}
					  };
		List <Integer> res= new ArrayList<>();
		int rowbegin=0;
		int rowEnd=arr.length-1;
		int col=0;
		int colEnd=arr[0].length-1;
		
		while(rowbegin<=rowEnd&&col<=colEnd) {
			
			//traverse right
			for(int j=col;j<=rowEnd;++j) {
				res.add(arr[rowbegin][j]);
			}
			rowbegin++;
			//traverse down
			for(int i=rowbegin;i<=rowEnd;++i) {
				res.add(arr[i][colEnd]);
			}
			colEnd--;
			//traverse left
			if(rowbegin<=rowEnd) {
				for(int i=colEnd;i>=col;--i) {
					res.add(arr[rowEnd][i]);
				}
			}
			rowEnd--;
			//traverse up
			if(col<=colEnd) {
				for(int i=rowEnd;i>=rowbegin;--i) {
					res.add(arr[i][col]);
				}
			}
			col++;
		}
		
		for(Integer i: res) {
			System.out.print(i);
		}
		

	}

}
