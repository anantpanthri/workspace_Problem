
public class Main {
	public static void doPrint() {
		System.out.println();
	}
	public static void main(String [] args) {
	 String s="MaM";
	 s=s.toLowerCase();
	 char[] ch= s.toCharArray();
	 int [] freq= new int[26];
	 for(int i=0;i<26;++i) {
		 if(i<ch.length &&ch[i]!=32 ) {
		 System.out.println(ch[i]);
		 freq[ch[i]-'a']++;
		 }
	 }
	 for(int i=0;i<26;++i) {
		 if(freq[i]==1)
			 System.out.println("not pallindrome");
	 }	 
	}
	}
