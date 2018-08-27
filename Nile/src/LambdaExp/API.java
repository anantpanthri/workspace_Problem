package LambdaExp;

import java.util.*;
/*
 * Java 8 API's
 */
public class API {

	public static void main(String[] args) {
		//interfaceFormula();
	/*	List<String> ls = Arrays.asList("Z","D","B");
		nonLambdaSorting(ls);
		LambdaSorting(ls);
		for(String s:ls)System.out.println(s);
		lambdaSortingObj();*/
		useHashmap();
	}

	



	private static void useHashmap() {
		DummyObj a= new DummyObj("anant", 1, 8123);
		DummyObj b= new DummyObj("bnant", 9, 7123);
		DummyObj c= new DummyObj("cnant", 8, 6123);
		DummyObj d= new DummyObj("dnant", 7, 5123);
		DummyObj e= new DummyObj("enant", 6, 4123);
		Map<Integer,DummyObj> hm= new HashMap<>();
		hm.put(a.id,a);
		hm.put(b.id,b);
		hm.put(c.id,c);
		hm.put(d.id,d);
		hm.put(e.id,e);
		
		hm.forEach((id,obj)->System.out.println(id+":"+obj.name));
	
	}





	private static void lambdaSortingObj() {
		DummyObj a= new DummyObj("anant", 1, 8123);
		DummyObj b= new DummyObj("bnant", 9, 7123);
		DummyObj c= new DummyObj("cnant", 8, 6123);
		DummyObj d= new DummyObj("dnant", 7, 5123);
		DummyObj e= new DummyObj("enant", 6, 4123);
		List<DummyObj>ls= Arrays.asList(a,b,c,d,e);
		Collections.sort(ls, (x,y)->x.acc-y.acc);
		
		
		for(DummyObj s:ls) {
			System.out.println(s.toString());
		}
	}



	private static void LambdaSorting(List<String> ls) {
		Collections.sort(ls,(a,b)->b.compareTo(a));
	}

	
	private static void nonLambdaSorting(List<String> ls) {
		
		Collections.sort(ls,new Comparator<String>(){
			@Override
			public int compare(String a,String b) {
				return a.compareTo(b);
			}
		});
		
	}

	private static void interfaceFormula() {
		// TODO Auto-generated method stub
//		you can have a default function named in a java 8 API interface
			 Formula f= new Formula() {
				@Override
				public int test() {
					return 10;
				}
			};
			System.out.println(f.test());

	}

}
