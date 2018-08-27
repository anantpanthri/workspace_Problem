package Nile;

import java.util.*;

public class GroupAnagram {

	public static void main(String[] args) {
		String[] str= {"eat", "tea", "tan", "ate", "nat", "bat"};
		HashMap <String,ArrayList<String>>hm= new HashMap<>();
		for(String s:str) {
		char [] ca=s.toCharArray();
		Arrays.sort(ca);
		String key=String.valueOf(ca);
		if(!hm.containsKey(key)) {
			ArrayList<String>ls= new ArrayList<>();
			ls.add(s);
			hm.put(key,ls);
			}
		else {
			hm.get(key).add(s);
		}
	}
	for(ArrayList ls:hm.values()) {
		System.out.println(ls);
	}
		
		
	}

}
