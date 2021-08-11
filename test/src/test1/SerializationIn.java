package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SerializationIn {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\buslist.nik");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			List<Object> ls = (LinkedList<Object>)ois.readObject();
			ois.close();
			fis.close();
			
			//ls.forEach(System.out::println);
			ls.forEach(System.out::println);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
