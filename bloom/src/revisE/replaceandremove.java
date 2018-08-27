package revisE;

import java.util.Arrays;

public class replaceandremove {

	public static void main(String[] args) {
		int wi=0;
		String s="aaaaabaaaaac";

		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		Integer aCount=0;
		//output a10c

		int l=s.length();
		for(int i=0;i<l;++i) {
			if(s.charAt(i)!='b') {
				ch[wi++]=s.charAt(i);
			}
			if(ch[i]=='a') {
				
			while(ch[i]=='a') {
				++aCount;
				++i;
			}
			for(int k=0;k<aCount.toString().length();++k) {
				ch[wi++]=(aCount.toString().charAt(k));
			}
		}
		}
		
		for(int i=0;i<wi;++i) {
			System.out.print(ch[i]);
		}
	}
}
