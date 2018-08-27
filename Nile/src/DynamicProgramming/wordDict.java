package DynamicProgramming;
import java.util.*;
public class wordDict {

	public static void main(String[] args) {
		
		String s="applepensseapple";
		List<String> wordDict= new ArrayList<String>();
		wordDict.add("apple");
		wordDict.add("pens");
		wordDict.add("s");
		boolean f[]= new boolean[s.length()+1];
		f[0]=true;
		for(int i=1;i<=s.length();++i) {
			for(int j=0;j<i;++j) {
				if(f[j]&&wordDict.contains(s.substring(j, i))) {
					f[i]=true;
					break;
				}
			}
		}
			System.out.println(f[s.length()]);

	}

}
