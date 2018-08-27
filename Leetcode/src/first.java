
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Leetcode";
		s=s.toLowerCase();
		 int freq [] = new int[26];
	        for(int i = 0; i < s.length(); i ++)
	            freq [s.charAt(i) - 'a'] ++;
	        int i = 0;
	        for(; i < s.length(); i ++)
	            if(freq [s.charAt(i) - 'a'] == 1)
	        		break;
	        System.out.println(freq[i]);
	}

}
