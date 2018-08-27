package bloom18;
//eliminates the possibility of instantiating more than one object
import java.util.*;
public class Singleton {

	private static Singleton firstInstance = null;
	
	String [] scrabble= {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",}; 
	private LinkedList<String> letterlist= new LinkedList<String>(Arrays.asList(scrabble));
	static boolean firstThread=true;
	
	private Singleton() {
	}
//Lazy instantiation means that it will only 
	//be created only if we need it.
	public static Singleton getInstance() {
		if(firstInstance ==null) {
			if(firstThread) {
				firstThread=false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			synchronized (Singleton.class) {
				if(firstInstance ==null) {	
			
			firstInstance=new Singleton();
			}
			}
		}
		return firstInstance;
	}
	public LinkedList<String> getLetterList(){
		Collections.shuffle(firstInstance.letterlist);
		return firstInstance.letterlist;
	}
	
	public LinkedList<String> getTiles(int howmanytiles){
		
		LinkedList<String>tilestosend= new LinkedList<>();
		for(int i=0;i<=howmanytiles;++i) {
			tilestosend.add(firstInstance.letterlist.remove(0));
		}
		return tilestosend;
	}
}
