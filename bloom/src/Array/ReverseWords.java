package Array;
/*
 * Given s = "the sky is blue",
return "blue is sky the".
 */
public class ReverseWords {

	public static void main(String[] args) {
		String s="the sky is blue";
		char[] ch=s.toCharArray();
		int start=0;
		for(int i=0;i<s.length();++i) {
			if(s.charAt(i)==32) {
				reverse(ch,start,i-1);
				start=i+1;
			}
		}
		reverse(ch,start,s.length()-1);
		reverse(ch,0,s.length()-1);
		for(char c:ch) {
			System.out.print(c);
		}
	}

	private static void reverse(char[] s, int start, int end) {
		{
			while(start<=end) {
				char temp =s[start];
				s[start]=s[end];
				s[end]=temp;
				start++;
				end--;
			}
		}
		
		

		
	}

}
