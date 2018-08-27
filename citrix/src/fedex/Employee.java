package fedex;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Employee extends RuntimeException  {

private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static void error() {
	int x=8/0;
	System.out.println(x);
}

public static void main(String args[]) {
	 error();
	 Set s= new TreeSet();
	 Map m= new LinkedHashMap<>();
	 Lock l= new ReentrantLock();
}

}
