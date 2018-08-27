package Array;
import java.util.*;
public class Thirdlargest {

	public static void main(String[] args) {
		int[]arr= {2,1,2,3,4,5,5,6};
		Integer m1=null;
		Integer m2=null;
		Integer m3=null;
		for(Integer i:arr) {
			if(i.equals(m1)||arr.equals(m2)||arr.equals(m3))continue;
			if(m1==null||i>m1) {
				m3=m2;
				m2=m1;
				m1=i;
			}
			else if(m2==null||i>m2)
			{
				m3=m2;
				m2=i;
			}
			else if(m3==null || i>m3)
			{
				m3=i;
			}
		}
		System.out.println(m3);
	
	}

}
