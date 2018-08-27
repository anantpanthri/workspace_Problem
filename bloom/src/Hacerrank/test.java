package Hacerrank;

public class test {

	public static void main(String[] args) {
		String[]arr= {"this","that"};
		int score[]= new int[arr.length];
		score=calculateScore(arr);
		
		for(String s:arr) {
			System.out.println(s);
		}
		for(int i:score) {
			System.out.println(i);
		}
		sortArrays(score,arr);
		for(int i=1;i<score.length;++i) {
			if(score[i-1]==score[i]) {
				checkStrings(score,i,arr);
			}
		}
		System.out.println("change begins");
		for(String s:arr) {
			System.out.println(s);
		}
		for(int i:score) {
			System.out.println(i);
		}
		
	}

	private static void checkStrings(int[] score, int index, String[] arr) {
		int a=0;
		int b=0;
			if(arr[index].charAt(0)>=65 &&  arr[index].charAt(0)<=90) {
				a=arr[index].charAt(0)-'A'+1;
			}
			else if(arr[index].charAt(0)>=97 &&  arr[index].charAt(0)<=122) {
				a=arr[index].charAt(0)-'a'+1;
			}
			if(arr[index-1].charAt(0)>=65 &&  arr[index-1].charAt(0)<=90) {
				b=arr[index-1].charAt(0)-'A'+1;
			}
			else if(arr[index-1].charAt(0)>=97 &&  arr[index-1].charAt(0)<=122) {
				b=arr[index-1].charAt(0)-'a'+1;
			}
			if(a>b)
			{
				String temp=arr[index];
				arr[index]=arr[index-1];
				arr[index-1]=temp;
			}
	}

	private static void sortArrays(int[] score, String[] arr) {
		boolean swapped=true;
		for(int i=score.length-1;i>=0&&swapped;--i) 
		{
			swapped=false;
			for(int j=0;j<=i-1;++j ) {
				if(score[j]>score[j+1]) {
					int temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
					
					String word=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=word;
					swapped=true;
				}
			}
		}
	}

	private static int[] calculateScore(String[] arr) {
		int score[]= new int[arr.length];
		for(int i=0;i<arr.length;++i) {
			
			score[i]=getScore(arr[i]);
		}
		return score;
		
	}

	private static int getScore(String arr) {
		int score=0;
		for(int i=0;i<arr.length();++i) {
			if(arr.charAt(i)>=65&&arr.charAt(i)<=90)
				score+=arr.charAt(i)-'A'+1;
			else if(arr.charAt(i)>=97&&arr.charAt(i)<=122)
					score+=arr.charAt(i)-'a'+1;
		}

		return score;
	}

}
