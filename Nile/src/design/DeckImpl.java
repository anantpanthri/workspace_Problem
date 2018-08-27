package design;

public class DeckImpl {

	public static void main(String[] args) {
		 Deck d= new Deck();
		 d.shuffle(900);
		// d.printStack();
		 for(int i=0;i<50;++i)
			 d.deal();
		 System.out.println("after sorting mf");
		 d.sort();
		 System.out.println(d.toString());
	}

}
