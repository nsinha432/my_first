package train_schedule;

import java.util.Arrays;

public class Train_schedule_main {
	public static void main(String[] args) {
		
		Train_schedule[] ts = {
				new Train_schedule(1, "YPR", "Yasvantpur Jn  ", "", "23.40"),
				new Train_schedule(2, "GTL", "Guntakal Jn    ", "03.45", "03.50"),
				new Train_schedule(3, "SC",  "Secunderabad Jn", "8.55", "9.10"),
				new Train_schedule(4, "BPQ", "Balharshah     ", "13.30", "13.35"),
				new Train_schedule(5, "HBJ", "Habibganj      ", "21.20", "21.25"),
				new Train_schedule(6, "JHS", "Jhansi Jn      ", "01.15", "01.20"),
				new Train_schedule(7, "DEE", "Delhi S Rohilla", "07.00","")
		};
		
		ts[0].setTrain_name("Yasvantpur Delhi Sarai Rohilla AC Duronto Express");
		ts[0].setTrain_number("(" + 12213 + ")");
		
		ts[0].print_schedule(ts);
		
	}
}
