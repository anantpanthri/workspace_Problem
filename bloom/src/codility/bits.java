package codility;

import java.util.BitSet;

import javax.print.DocFlavor.BYTE_ARRAY;

public class bits {

	public static void main(String args[]) {
		int a=2;
		int b=3;
		int x=a*b;
		 String s=Integer.toBinaryString(x);
		 int count=0;
		 for(char ch:s.toCharArray()) {
			 if(ch=='1')
				 count++;
		 }
		 System.out.println(count);
		
	}
	
}
