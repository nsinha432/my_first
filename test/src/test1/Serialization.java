package test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class Serialization {
	public static void main(String[] args) {
		
		List<TesterBus> li = new LinkedList<TesterBus>();
		
		li.add(new TesterBus(100, "abc travels", 1100.0, 3.4f));
		li.add(new TesterBus(102, "xyz travels", 1250.0, 2.4f));
		li.add(new TesterBus(101, "mno travels", 570.0, 2.7f));
		li.add(new TesterBus(105, "abc travels", 1500.0, 4.1f));
		li.add(new TesterBus(104, "rut travels", 600.0, 3.0f));
		li.add(new TesterBus(103, "xyz travels", 1100.0, 2.7f));
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\buslist.nik");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(li);
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
