package design;

import java.io.Serializable;

public class B extends A implements Serializable {

	public static void main(String[] args) {
		A m= new A();
		m.hi();


	}
	public void hi() {
		System.out.println("jijo");
	}

}
