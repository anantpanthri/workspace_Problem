package Array;

public class StringCompression {

	public static void main(String[] args) {

		int indexAns=0;
		int index=0;
		String ch="aaaabbccccccccccccccc";
		char [] ch1=ch.toCharArray();
		while(index<ch.length()) {
			int count=0;
			char currentchar=ch.charAt(index);
			while(index<ch.length()&&currentchar==ch.charAt(index)) {
				index++;
				count++;
			}
			ch1[indexAns++]=currentchar;//this step to be looked at carefully
			if(count!=1) {
				for(char ch2:Integer.toString(count).toCharArray())
					ch1[indexAns++]=ch2;
			}
		}
		
		for(char c:ch1) {
			System.out.print(c);
		}
		
		
		
	}

}
