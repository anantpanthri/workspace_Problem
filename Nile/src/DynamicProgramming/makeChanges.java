package DynamicProgramming;

public class makeChanges {

	private static int coins[]= {10,6,1};
	public static void main(String[] args) {
		System.out.println("Ans-->"+makeChange(12));
	}
	
	public static int makeChange(int c) {
		
		if(c<=0)return 0;
		int miniCoins=Integer.MAX_VALUE;
		for(int coin:coins) {
			if(coin<=c) {
				int current_min_coin=makeChange(c-coin);
				System.out.println("coin iterating on "+coin+" disintegrating on "+current_min_coin);
				if(current_min_coin<miniCoins) {
					miniCoins=current_min_coin;
				}
			}
		}
		return miniCoins+1;
		
	}

}
