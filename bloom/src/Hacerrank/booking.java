package Hacerrank;

public class booking {
	   static int[] delta_encode(int[] arr) {
	       
	        int brr[]=new int[arr.length+1];
	        brr[0]=0;
	        for(int i=1;i<arr.length+1;++i){
	            brr[i]=arr[i-1];
	        }
	        int count=0;
	         for(int i=0;i<arr.length;++i){
	            if(arr[i]-brr[i]<-127||arr[i]-brr[i]>127)
	                ++count;
	             }
	        int crr[]=new int[count+arr.length];
	        int k=0;
	         for(int i=0;i<arr.length;++i){
	            if(arr[i]-brr[i]<-127||arr[i]-brr[i]>127)
	                crr[k++]=-128;
	             crr[k++]=arr[i]-brr[i];
	             }
	return crr;
	    }
	   public static void main(String args[]) {
		   int []arr= {25626,25757,0};
		   int []crr=delta_encode(arr);
		   for(int i:crr)
			   System.out.println(i);
	   }
}
