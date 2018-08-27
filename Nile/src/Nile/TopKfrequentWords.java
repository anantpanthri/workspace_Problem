package Nile;
import java.util.*;
public class TopKfrequentWords {

	public static void main(String[] args) {
		
		String words[]= {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		//nlognkapproach(words);
		String s="sj";
		String s2=(s.substring(0, 2));
		System.out.println(s2);
	}

	private static void nlognkapproach(String[] words) {
		int k=4;
		List<String>res= new ArrayList<>();
		HashMap<String,Integer>hm= new HashMap<String,Integer>();
		for(String s:words) {
			hm.put(s,hm.getOrDefault(s,0)+1);
		}
		
		PriorityQueue<String>pq= new PriorityQueue<String>(new Comparator<String>() {
			@Override
			public int compare(String s1,String s2) {
				if(s1.equals(s2))
					return s1.compareTo(s2);
				return hm.get(s2)-hm.get(s1);
			}
		});
		
		pq.addAll(hm.keySet()); 
		
		for(int i=0;i<k;++i) {
			if(!pq.isEmpty())
				res.add(pq.poll());
		}
		for(String s:res) {
			System.out.println(s);
		}
	}
		
}
