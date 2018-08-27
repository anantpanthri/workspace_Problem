package bloom18;

public class ScrabbleTestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetThetiles gettiles= new GetThetiles();
		
		GetThetiles gettilesAgain= new GetThetiles();
		
		new Thread(gettiles).start();
		new Thread(gettilesAgain).start();
		

	}

}
