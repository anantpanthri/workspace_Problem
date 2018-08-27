
public class findMaximumSubRectangle {

	
	public static void main(String[] args) {
		
		int maxSum=0;
		int maxup=0;
		int maxbottom=0;
		int maxleft=0;
		int maxright=0;
		int a[][]= {
				{2,1,-3,-4,5},
				{0,6,3,4,1},
				{2,-2,-1,4,-5},
				{-3,3,1,0,3}
		};int j=0;
		int temp[]= new int[a.length];
		for(int i=0;i<a.length;++i) {
			for(j=0;j<a[0].length;++j) {
				temp[i]+=a[i][j];
			}
			Kadane k= getMaxCoordinate(temp);
			if(k.max>maxSum) {
				maxup=k.maxstart;
				maxbottom=k.maxend;
				maxleft=i;
				maxright=j;
				maxSum=k.max;
			}
		}
		System.out.println("MaxSum"+maxSum);
		System.out.println("MaxUP"+maxup);
		System.out.println("Maxbottom"+maxbottom);
		System.out.println("Maxleft"+maxleft);
		System.out.println("Maxright"+maxright);
	}
	public static Kadane getMaxCoordinate(int []a) {
		int max=0;
		int maxEnd=0;
		int maxsofar=0;
		int currentStart=0;
		int maxStart=0;
		for(int i=0;i<a.length;++i) {
			
			maxsofar+=a[i];
			if(maxsofar<0) {
				currentStart=i+1;
				maxsofar=0;
			}
			if(max<maxsofar) {
				
				maxEnd=i;
				maxStart=currentStart;
				max=maxsofar;
			}
		}
		return (new Kadane(max,maxStart,maxEnd));
	}
}
