package multithreading;

import java.util.ArrayList;
import java.util.List;

public class X {

	public static void main(String[] args) {
		App<Short> d= new App<Short>();
		
		List<Short>a= new ArrayList<>();
		a.add((short) 1);
		a.add((short) 2);
		d.methodA(a);
	}

}
