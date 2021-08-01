package train_schedule;

import java.util.Arrays;
import java.util.Collections;

public class Train_schedule {
	
	private String train_name;
	private String train_number;
	
	private int number;
	private String code;
	private String station;
	private String arrival;
	private String departure;
	
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	
	public void setTrain_number(String train_number) {
		this.train_number = train_number;
	}
	
	public Train_schedule(int number, String code, String station, String arrival, String departure) {
		this.number = number;
		this.code = code;
		this.station = station;
		this.arrival = arrival;
		this.departure = departure;
	}
	
	public void print_schedule(Train_schedule[] ts) {
		
		System.out.println(train_name+" " + train_number);
		System.out.println("------------------------------------------------------------");
		System.out.println("#	Code	Station		 Arr.	Dep.");
		System.out.println("------------------------------------------------------------");
		
		//code:	%9s
		//number:	%1d
		//station: %19s
		//arrrival: %6s
		//departure %6s
		
		for(Train_schedule x:ts) {
			//System.out.print(x.code+" "+ x.number+" "+x.station+ " "+ x.arrival+"  "+ x.departure+"\n");
			//System.out.printf("%11s %1d %31s %37s %46s", x.code, x.number, x.station, x.arrival, x.departure);
			System.out.printf("%1d %9s %19s %6s %6s", x.number, x.code, x.station, x.arrival, x.departure);
			System.out.println();

		}
		
	}
	
	
	
}
