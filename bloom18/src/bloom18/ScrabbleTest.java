package bloom18;
import java.util.*;
public class ScrabbleTest {

	public static void main(String[] args) {
		Singleton newInstance= Singleton.getInstance();
		System.out.println("ID-->"+System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles= newInstance.getTiles(7);
		System.out.println("p1-->"+playerOneTiles);
		System.out.println(newInstance.getLetterList());
		Singleton instance2= Singleton.getInstance();
		
System.out.println("ID2-->"+System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playertwoTiles= newInstance.getTiles(7);
		System.out.println("p2-->"+playertwoTiles);
		System.out.println(newInstance.getLetterList());
	}

}
