package Array;

import java.util.*;

public class ArrayIntersection {
//find distinct similar elements
	//TC-O(n) SC-o(n)
	public static void main(String[] args) {

		int nums1[]= {1,2,3,4,5};
		int nums2[]= {1,3,2,3,4,5};
		
		 Set<Integer> set = new HashSet<>();
	        Set<Integer> intersect = new HashSet<>();
	        for (int i = 0; i < nums1.length; i++) {
	            set.add(nums1[i]);
	        }
	        for (int i = 0; i < nums2.length; i++) {
	            if (set.contains(nums2[i])) {
	                intersect.add(nums2[i]);
	            }
	        }
	        int[] result = new int[intersect.size()];
	        int i = 0;
	        for (Integer num : intersect) {
	            result[i++] = num;
	        }
	        for(int k:result)
	        	System.out.print(k);
	}
		
	
	    public static void intersectionHelper(int[] nums2, int[] nums1,int [] inter){
	        int smIndex=nums1.length-1;
	        int interIndex=nums1.length-1;
	        for(int i=nums1.length-1;i>=0;--i){
	            if(smIndex<0||nums1[smIndex--]!=nums2[i])
	                break;
	            else{
	                inter[interIndex--]=nums1[i];
	            }
	        }
	        
	    }

	}

