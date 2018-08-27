package SortingSearching;
import java.util.*;
public class Endpoints implements Comparable<Endpoints>{
	boolean isStart;
	int time;
	@Override
	public int compareTo(Endpoints e) {
		if(time!=e.time)
			return Integer.compare(time, e.time);
		return isStart&&!e.isStart?-1:!isStart&&e.isStart?1:0;
	}

	public Endpoints( int time,boolean isStart) {
		super();
		this.isStart = isStart;
		this.time = time;
	}

	public static void main(String[] args) {
		List<Event>A= new ArrayList<Event>();
		A.add(new Event(1,5));
		A.add(new Event(2,7));
		A.add(new Event(4,5));
		A.add(new Event(6,10));
		A.add(new Event(8,9));
		A.add(new Event(9,17));
		A.add(new Event(11,13));
		A.add(new Event(12,15));
		A.add(new Event(14,15));
		List<Endpoints>E=new ArrayList<>();
		for(Event e:A) {
			E.add(new Endpoints(e.start,true));
			E.add(new Endpoints(e.finish,false));
		}
		Collections.sort(E);

		int simMax=0,simEvents=0;
		for(Endpoints e:E)
		{
			if(e.isStart) {
				++simEvents;
				simMax=Math.max(simMax,simEvents);
			}
			else {
				--simEvents;
			}
		}
		System.out.println(simMax);


	}


}
