package notebook;

public class maximumSubRectangle {

	
	
	public static void main(String[] args) {
		int [][]a= {
				{2,1,-3,-4,5},
				{0,6,3,4,1	},
				{2,-2,-1,4,-5},
				{-3,3,1,0,3}
		};
		int currentsum=0;
		int maxsum=0;
		int leftMax=0;
		int rightMax=0;
		int left=0;
		int temp[]=new int[a.length];
		for(int right=0;right<a[0].length;++right) {
		
			for(int i=0;i<a.length;++i) {
			temp[i]+=a[i][left];
		}
			Kadane k =new Kadane();
			getKadane(k,temp);
			left++;
			if(maxsum<k.max) {
				maxsum=k.max;
				leftMax=left;
				//rightmax=
			}
			
		}

	}

	private static void getKadane(Kadane k, int a[]) {
		int max=0;
		int maxsofar=0;
		int maxstart=0;
		int maxend=0;
		int currentmax=0;
		
		for(int i=0;i<a.length;++i) {
			
		}

	}

}
