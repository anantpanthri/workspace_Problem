package Nile;

public class longestsubSequence {

	public static void main(String args[]) {
		smallesteSubstr_maxDistictChar("AABBBCBB");
	}
	public static int max_distinct_char(String s, int n){
		 
	    // Initialize all character's count with 0
	    int count[] = new int[256];
	     
	    // Increase the count in array if a character
	    // is found
	    for (int i = 0; i < n;  i++)
	        count[s.charAt(i)]++;
	     
	    int max_distinct = 0;
	    for (int i = 0; i < 256;  i++)
	        if (count[i] != 0)      
	            max_distinct++;     
	     
	    return max_distinct;
	}
	public static void smallesteSubstr_maxDistictChar(String str){
		 
	    int n = str.length();     // size of given string
	 
	    // Find maximum distinct characters in any string
	    int max_distinct = max_distinct_char(str, n);
	    int minl = n;   // result
	     
	    // Brute force approch to find all substrings
	    for (int i=0 ;i<n ;i++){
	        for (int j=i; j<n-1; j++){
	            String subs =  str.substring(i,j+1);
	            int subs_lenght = subs.length();
	            int sub_distinct_char = max_distinct_char(subs, subs_lenght); 
	             
	            // We have to check here both conditions together
	            // 1. substring's distinct characters is equal
	            //    to maximum distinct characters
	            // 2. substing's length should be minimum 
	            if (subs_lenght < minl && max_distinct == sub_distinct_char){
	                minl = subs_lenght;
	            }
	        }
	    }
	    System.out.println(minl);
	}
	
	
}
