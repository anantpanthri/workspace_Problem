package revisE;

public class words {

	public static void main(String[] args) {

		String w="ZA";
		int r=0;
		for(int i=0;i<w.length();++i) {
			int	d=(w.charAt(i)-'A')+1;
			r+=d;
			
		}
		System.out.println(r);
	}

}
