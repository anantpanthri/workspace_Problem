public class test {

	public static void main(String[] args) {
		final int arr[]= {1,2,3};
		changeArray(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

	private static void changeArray(int[] arr) {
		arr[0]=arr[2];
	}

}
