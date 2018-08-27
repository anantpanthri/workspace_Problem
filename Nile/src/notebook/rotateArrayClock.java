package notebook;
import java.util.*;
public class rotateArrayClock {

	public static void main(String args[])
	{
		 String s="I am happy";
		 String a="I am old";
		 String s2[]=s.split(" ");
		 String a2[]=a.split(" ");
		 List<String>mp= new ArrayList<>();
		 for(int i=0;i<s2.length;++i) {
			 mp.add(s2[i]);

		}

		 for(int i=0;i<a2.length;++i) {
			 if(!mp.contains(a2[i]))
				 System.out.println(a2[i]);
		}
		 mp= new ArrayList<>();
		 for(int i=0;i<a2.length;++i) {
			 mp.add(a2[i]);

		}
		 for(int i=0;i<s2.length;++i) {
			 if(!mp.contains(s2[i]))
				 System.out.println(s2[i]);
		}
	}


}
