package multithreading;

import java.util.*;

public class App<E> {

	public static void main(String[] args) {
		//new Worker().main();
		//type erasure
		List<Short>a= new ArrayList<>();
		a.add((short) 1);
		a.add((short) 2);
	}
	public void methodA(List<E> a) {
		 a.forEach(n->System.out.println(n));
	}
}
