package dematic;

public class LRUCacheImpl {

	public static void main(String[] args) {
		LRUCache lc= new LRUCache(5);
		lc.set(1,1);
		lc.set(2,2);
		lc.set(3,3);
		lc.set(5,5);
		lc.set(2,4);
		lc.set(6,6);
		lc.set(7,7);
		lc.print();
		
		
		
		
		
		
	}

}
