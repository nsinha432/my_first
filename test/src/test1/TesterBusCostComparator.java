package test1;
import java.util.Comparator;

public class TesterBusCostComparator implements Comparator<TesterBus>{

	@Override
	public int compare(TesterBus o1, TesterBus o2) {
		
		if(o1.getCost()>o2.getCost()) {
			return 1;
		}
		else if(o2.getCost()==o1.getCost()) {
			return 0;
		}
		else return -1;
	}
	
}
