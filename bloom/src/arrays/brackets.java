package arrays;
import java.util.*;
/*abc(hdh)hshs(udus ==> abc(hdh)hshsudu*/
public class brackets {
	
	public static void main(String args[]) {
		String s="a(b)c)d";
		StringBuilder s2= new StringBuilder();
		Stack <Character>st= new Stack<>();
		char[] ch=s.toCharArray();
		int i=0;
		for(;i<ch.length;++i) {
			if(ch[i]=='(') {
				st.push(')');
			s2.append(ch[i]);	
			}
			
			else if(!st.isEmpty()&&ch[i]==')'&&ch[i]==st.pop())
				s2.append(ch[i]);
			else if(ch[i]!=')'||ch[i]!='(')
				s2.append(ch[i]);
		}
		 
			System.out.println(s2.toString());
		
		
	}
}
