package SortingSearching;

public class SortLargeArrayMergeSmall {

	public static void main(String[] args) {
		int l[]= {2,4,5,0,0,0};
		int s[]= {0,1,3};
		 int aindex=2;
		 int bindex=2;
		 int mergeindex=5;
		
		 while(aindex>=0&&bindex>=0) {
			 if(l[aindex]>s[bindex])
			 {
				 l[mergeindex]=l[aindex];
				 aindex--;
			 }
			 else {
				 l[mergeindex]=s[bindex];
				 bindex--;
			 }
			 mergeindex--;
		 }
		 while(bindex>=0) {
			 l[mergeindex]=s[bindex];
			 bindex--;
			 mergeindex--;
		 }
		 for(int i:l)
			 System.out.println(i);
		 
		 
	}
		
	}

 