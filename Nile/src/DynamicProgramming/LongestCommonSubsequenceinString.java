package DynamicProgramming;
/*
 * Nice dp questions with best explanations
 */
public class LongestCommonSubsequenceinString {

	public static void main(String[] args) {
		 
		longestCommonSubsequence();
		//recursiveLongestCommonSubsequence();
	}
	
	
	 private static void recursiveLongestCommonSubsequence() {
		 String str1 = "ABCDGHLQR";
	        String str2 = "AEDPHR";
	        
		System.out.println(lcs(str1.toCharArray(),str2.toCharArray(),0,0));
	}
	  public static int lcs(char str1[],char str2[],int len1, int len2){
	        
	        if(len1 == str1.length || len2 == str2.length){
	            return 0;
	        }
	        if(str1[len1] == str2[len2]){
	            return 1 + lcs(str1,str2,len1+1,len2+1);
	        }
	        else{
	            return Math.max(lcs(str1,str2,len1+1,len2),lcs(str1,str2,len1,len2+1));
	        }
	    }

	private static void longestCommonSubsequence() {

	        String str2 = "abcdaf";
	        String str1 = "acbcf";
	        
	        lcsDynamic(str1.toCharArray(), str2.toCharArray());

	}

	//TimeComplexity(m*n)
	public static void lcsDynamic(char str1[],char str2[]){
		    
	        int temp[][] = new int[str1.length + 1][str2.length + 1];
	        int max = 0;
	        for(int i=1; i < temp.length; i++){
	            for(int j=1; j < temp[i].length; j++){
	                if(str1[i-1] == str2[j-1]) {
	                    temp[i][j] = temp[i - 1][j - 1] + 1;
	                }
	                else
	                {
	                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
	                }
	                if(temp[i][j] > max){
	                    max = temp[i][j];
	                }
	            }
	        }
	        System.out.println("NUMBER OF ELEMENTS THAT HAVE SAME ELEMENTS-->"+max);
	    //the reason for taking fake variables is that because while taking good variables 
	    //they were getting reseted. i needed a dynamic approach I rock 
	      
	        int fi=temp.length-1;
	        int fj=temp[0].length-1;
	        for(int i=fi;i>0;--i) {
	        	for(int j=fj;j>0;--j) {
	        		if(temp[i][j]!=temp[i][j-1]&&temp[i][j]!=temp[i-1][j]) {
	        		//	System.out.print(temp[i][j]+",");
	        			System.out.print(str1[i-1]);
	        			
	        		fi=fi-1;
	        		fj=fj-1;
	        		}
	        		else if(temp[i][j]==temp[i][j-1]){
	        			
	        			fj=fj-1;
	        		//System.out.print(temp[i][j]+",");
	        			
	        		}
	        		
	        	}
	        }
	        
	        
	        
	    }

}
