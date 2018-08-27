package Array;

import java.util.Arrays;

/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
public class mergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {1,3,5,7,0,0,0,0,0,0};
		int nums2[]= {2,4,6};
		int index=0;
		for(int i=4;i<7;++i) {
			nums1[i]=nums2[index++];
		}
		Arrays.sort(nums1);
		for(int i:nums1)
			System.out.println(i);

	}

}
