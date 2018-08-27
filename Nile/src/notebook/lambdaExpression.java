package notebook;

import java.util.Arrays;
import java.util.*;
public class lambdaExpression {

	public static void main(String[] args) {

		List<Integer>values= Arrays.asList(1,2,3,4,5,6,7);

		//internal iterator
		//values.forEach(i->System.out.println(i));
		values.parallelStream().forEach(System.out::println);
		values.parallelStream().forEach(System.out::println);
	}

}
