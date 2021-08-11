package set_buslist;

import java.util.Comparator;

public class BusComparator implements Comparator<Bus>{

	@Override
	public int compare(Bus o1, Bus o2) {
		
		Double d1 = o1.getCost();
		Double d2 = o2.getCost();
		
		int x = d1.compareTo(d2);
		
		if(x==0) {
			Float f1 = o1.getRating();
			Float f2 = o2.getRating();
			
			x=f2.compareTo(f1);
		}
		return x;
	}

}
