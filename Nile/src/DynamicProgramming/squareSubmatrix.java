package DynamicProgramming;

public class squareSubmatrix {

	public static void main(String[] args) {
		boolean arr[][]= {
				{true,true,true,true,true},
				{true,true,true,true,false},
				{true,true,true,true,false},
				{true,true,true,true,false},
				{true,false,false,false,false}
		
		};
		
		System.out.println(squareSubmatrix(arr));
		//System.out.println(totalNumberofSquareSubmatrix(arr));
		
	}


	private static int squareSubmatrix(boolean[][] arr) {
		int max=0;
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[0].length;++j) {
				if(arr[i][j])max=Math.max(max,squareSubmatrix(arr,i,j));
			}
		}
		return max;
	}

	private static int squareSubmatrix(boolean[][] arr, int i, int j) {
		if(i==arr.length||j==arr[0].length)return 0;
		
		if(!arr[i][j])return 0;
		System.out.println("arr["+i+"]["+j+"] ="+arr[i][j]);
		int minimum1=Math.min(squareSubmatrix(arr,i+1,j),squareSubmatrix(arr,i,j+1));
		//int minimum2=Math.min(minimum1, squareSubmatrix(arr,i+1,j+1));
		return 1+minimum1;
	}
	/*
	 * below methods will find the total number of matrixes that are true
	 */
	//method finds the total number of square matrix with true that can be formed
	private static int totalNumberofSquareSubmatrix(boolean[][] arr) {
	int max=0;
	for(int i=0;i<arr.length;++i) {
		for(int j=0;j<arr[0].length;++j) {
			if(arr[i][j])max+= squareSubmatrix(arr,i,j) ;
		}
	}
	return max;
	}



}
