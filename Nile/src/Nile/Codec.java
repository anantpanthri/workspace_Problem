package Nile;
import java.util.*;
public class Codec {

	static List<String> urls = new ArrayList<String>();
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        urls.add(longUrl);
        return String.valueOf(urls.size()-1);
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        int index = Integer.valueOf(shortUrl);
        return (index<urls.size())?urls.get(index):"";
    }
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		String longUrl="https://leetcode.com/problems/design-tinyurl";
		String shortUrl="http://tinyurl.com/4e9iAk";
		System.out.println(encode(longUrl));
		System.out.println(decode(shortUrl));
	}

}
