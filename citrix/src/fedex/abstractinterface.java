package fedex;

public interface abstractinterface {
	public abstract void testMe();
	default void testMe2() {
		System.out.println("in test me 2 interface");
	}
}
