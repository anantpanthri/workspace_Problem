package fedex;
import java.util.*;
public class JavaInterviewQuestions {
private static int count;
JavaInterviewQuestions(){
	++count;
}
	public static void main(String[] args) {

//		Integer ref1= new Integer("55");
//		Integer ref2= new Integer("55");
//		
//		System.out.println(ref1==ref2);
		JavaInterviewQuestions a= new JavaInterviewQuestions();
		JavaInterviewQuestions b= new JavaInterviewQuestions();
		JavaInterviewQuestions c= new JavaInterviewQuestions();
		System.out.println("-->"+JavaInterviewQuestions.count);
		 HashMap<String,Integer>hm= new HashMap<>();
		hm.put("1", 3);
		hm.put("2", 3);
		System.out.println((hm.keySet().hashCode()));
		System.out.println((hm.get("2").hashCode()));
		

		Dog l = (new JavaInterviewQuestions()).new labrador(2);
		l.shout();
		
	}
	
	class Dog extends animal{
		Dog(){
			System.out.println("inside dog");
		}
		public void shout() {
			System.out.println("dog");
		}
	}
	class animal{
		animal(){
			System.out.println("inside animal");
		}
		public void shout() {
			System.out.println("animal");
		}
	}
	class labrador extends Dog{
		
		labrador(int a){
			super();
			System.out.println("inside labrador");
		}
		public void shout() {
			System.out.println("lab");
		}
		public void hi() {
			System.out.println("Access");
		}

		 
	}
}
