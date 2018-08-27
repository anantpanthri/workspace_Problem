package walmart;

public class Zigzag {

	public static void main(String[] args) {
		int [][]a= {
				{1,2,3,4},
				{8,7,6,5},
				{9,10,11,12},
				{16,15,14,13}
				
		};
		
		for(int i=0;i<a.length;++i) {
			int col=0;
			while(col<a[0].length) {
				System.out.print(a[i][col]+",");
				++col;
			}i+=1;
			while(col>0) {
				--col;
				System.out.print(a[i][col]+",");
				
			}
		}


	}

}
