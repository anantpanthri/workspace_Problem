package bloom18;

public class trailiingZeros {

	public static void main(String[] args) {
		int n=10;
		int result=0;
		for(;n>0;n/=5) {
			result+=n/5;
		}
			System.out.println(result);

	}

}
