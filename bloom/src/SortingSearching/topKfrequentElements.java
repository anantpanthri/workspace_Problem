package SortingSearching;
import java.util.*;
public class topKfrequentElements {

	public static void main(String[] args) {
		int nums[]= {1,1,1,2,2,3};
		int k=2;
		HashMap<Integer,Integer>frequencyMap= new HashMap<>();
		for(int n:nums) {
			frequencyMap.put(n,frequencyMap.getOrDefault(n, 0)+1);
		}
		List<Integer>[] bucket= new List[nums.length+1];
		for(int key:frequencyMap.keySet()) {
			int frequency=frequencyMap.get(key);
			if(bucket[frequency]==null)
				bucket[frequency]= new ArrayList<>();
			bucket[frequency].add(key);
		}
		List<Integer> res = new ArrayList<>();
		
		for(int l=bucket.length-1; l>=0 && res.size()<k;--l) {
			if (bucket[l] != null) {
				res.addAll(bucket[l]);
			}
		}
		
	}
}
