package bloom18;
import java.util.*;
public class GetThetiles implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singleton newInstance = Singleton.getInstance();
		System.out.println("ID-->"+System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String>playerOneTiles= newInstance.getTiles(7);
		System.out.println("Player: "+ playerOneTiles);
		System.out.println("Got Tiles");
		
		
	}

}
