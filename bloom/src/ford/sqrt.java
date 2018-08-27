package ford;

public class sqrt {

	public static void main(String[] args) {
		int x=9;
		long r = x;
	    while (r*r > x)
	        r = (r + x/r) / 2;
	   System.out.println((int) r);

	}

}
