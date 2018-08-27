package codility;

public class factorial {

	public static void main(String[] args) {

		int n=14;
		 int result[] = new int[500];
		 
	        // Initialize result
	        result[0] = 1;
	        int result_size = 1;
	 
	        for (int x = 2; x <= n; x++)
	            result_size = multiply(x, result, result_size);
	       int sum=0;
	        for (int i = result_size - 1; i >= 0; i--)
	           sum+=(result[i]);
	        System.out.print(sum);  
	}
	 static int multiply(int x, int res[], int res_size)
	    {
	        int carry = 0;  
	        for (int i = 0; i < res_size; i++)
	        {
	            int product = res[i] * x + carry;
	            res[i] = product % 10;  
	            carry = product/10;  
	        }
	        while (carry!=0)
	        {
	            res[res_size] = carry % 10;
	            carry = carry / 10;
	            res_size++;
	        }
	        return res_size;
	    }

}
