package Array;

public class rainwater {

	public static void main(String[] args) {
		int height[]= {2,1,0,2,0,0,1,3};
		int leftHighest[]=new int[height.length+1];
		leftHighest[0]=height[0];
		for(int i=0;i<height.length;++i) {
			leftHighest[i+1]=Math.max(leftHighest[i],height[i]);
		}
		int rightHighest=0;
		int totalAmount=0;
		for(int i=height.length-1;i>=0;--i) {
			rightHighest=Math.max(height[i],rightHighest);
			totalAmount+=Math.min(leftHighest[i],rightHighest)>height[i]?Math.min(leftHighest[i],rightHighest)-height[i]:0;
		}
		System.out.println(totalAmount);
	
	
	}

}