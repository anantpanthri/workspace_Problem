package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntersection2 {

	public static void main(String[] args) {
		int [] nums1= {4,1,4};
		int [] nums2= {44,33,45,4};
		//by using nums1 the code complexity has increased to o(nlog(n))
		//if the arrays are already in sorted order then this has a complexity of o(n)
		Arrays.sort(nums1);
		Arrays.sort(nums2);
  		ArrayList<Integer> arr= new ArrayList();
  		arr.add(1);
  		arr.add(2);
  		for(Integer i:arr) {
  			System.out.println(i);
  		}
  		int res []= new int [34];
  		System.out.println(arr.size());
		//1122
		//22
		int i=0;
		int j=0;
		int counter=1;
		while( i <nums1.length &&  j<nums2.length)
		{
			if(nums1[i]==nums2[j]) {
				//System.out.print(nums1[i]);
				i++;j++;
				
			}
			else if(nums1[i]>nums2[j])
				j++;
			else if(nums1[i]<nums2[j])
				i++;
			//System.out.println(counter++);
		}
		
		
		
	}

}
