package revision;

public class uniqueCharacter {

	public static void main(String[] args) {
		String s="leetcodde";
		String s1="loveleetcode";
		int f[]= new int[26];
		for(int i=0;i<s.length();++i) {
			f[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s.length();++i) {
			if(f[s.charAt(i)-'a']==1)
			System.out.println(s.charAt(i));
		}
	}

}
