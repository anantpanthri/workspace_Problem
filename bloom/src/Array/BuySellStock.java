package Array;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class BuySellStock {

	    static long stockmax(int[] prices) {
	       long profit = 0L;
	        int maxSoFar = 0;
	        for (int i = prices.length - 1; i > -1 ; i--) {
	            if (prices[i] >= maxSoFar) {
	                maxSoFar = prices[i];
	            }
	            profit += maxSoFar - prices[i];
	        }
	        return profit;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int[] prices = new int[n];
	            for(int prices_i = 0; prices_i < n; prices_i++){
	                prices[prices_i] = in.nextInt();
	            }
	            long result = stockmax(prices);
	            System.out.println(result);
	        }
	        in.close();
	    }
	}

