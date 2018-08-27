package fedex;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class AbstractImplfinal extends AbstractImpl implements abstractinterface {
	private static final Logger log=Logger.getLogger(AbstractImplfinal.class.getName());
	public static void main(String[] args) {
		log.info("inside main");
		System.out.println("in Implemntation"); 
		AbstractImplfinal a= new AbstractImplfinal();
		a.testMe();
		a.testMe2();
		List<Manager> x= new ArrayList<>();
		Manager m= new Manager(1,"Anant");
		Manager m2= new Manager(2,"Amogh");
		x.add(m);
		x.add(m2);
		a.process(x);
	}
	
	@Override
	public void testMe() {
		System.out.println("impl testme");
	}
	
	public void process(Manager m)
	{
		log.info("Type Erasure");
	
	}
	public void process(List m)
	{
		for(Object x:m) {
		log.info(((Manager)x).getName());
		}
	}
	 
}
