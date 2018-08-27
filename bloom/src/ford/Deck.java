package ford;

import java.util.*;

public class Deck {

	public static void main(String[] args) {
		generateDeck();
	}

	private static void generateDeck() {
		
		String[] cards= { "2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suits= {"Spade","Diamond","Club","Hearts"};
		String deck[]=new String[52];
		for(int i=0;i<52;++i) {
			deck[i]=cards[i%13]+"~"+suits[i/13];
		}
		shuffleDeck(deck);
		for(int i=0;i<52;++i) {
			System.out.println(deck[i]);
		}
	}

	private static void shuffleDeck(String[] deck) {
		for(int i=0;i<52;++i) {
			int temp = (int)Math.random()*deck.length;
			String s;
			s=deck[i];
			deck[i]=deck[temp];
			deck[temp]=s;
			
			
		}

		
	}

}
