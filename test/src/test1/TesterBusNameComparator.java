package test1;

import java.util.Comparator;

public class TesterBusNameComparator implements Comparator<TesterBus> {

	@Override
	public int compare(TesterBus o1, TesterBus o2) {
		
		return o2.getProviderName().compareTo(o1.getProviderName());
	}

}
