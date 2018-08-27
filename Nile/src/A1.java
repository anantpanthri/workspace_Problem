
public abstract class A1 {
	private String name;
	public abstract void hello1() ;
	public A1(String name) {
		super();
		this.name = name;
		System.out.println("inside constructor A1");
		System.out.println(name);
	}
	public void hello() {
		System.out.println("A1");
	}
	
}
