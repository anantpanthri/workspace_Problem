package LambdaExp;

public interface Formula {

	public int test();
	
	public default void square(int x) {
		System.out.println(x*x);
	}
}
