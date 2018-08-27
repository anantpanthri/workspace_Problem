package SortingSearching;
import java.util.*;
public class frequencyString {

	public static void main(String[] args) {
		String s="tree";
		 Map<Character, Integer> map = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            if (map.containsKey(c)) {
	                map.put(c, map.get(c) + 1);
	            } else {
	                map.put(c, 1);
	            }
	        }
	        List<Character> [] bucket = new List[s.length() + 1];
	        for (char key : map.keySet()) {
	            int frequency = map.get(key);
	            if (bucket[frequency] == null) {
	                bucket[frequency] = new ArrayList<>();
	            }
	            bucket[frequency].add(key);
	        }
	        StringBuilder sb = new StringBuilder();
	        for (int pos = bucket.length - 1; pos >=0; pos--) {
	            if (bucket[pos] != null) {
	                for (char num : bucket[pos]) {
	                    for (int i = 0; i < map.get(num); i++) {
	                        sb.append(num);
	                    }
	                }
	            }
	        }
	        System.out.println(sb.toString());

	}

}