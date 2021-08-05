package test1;

import java.io.FileNotFoundException;

public class TesterPresenter {
	public static void main(String[] args) {
		
		TesterBussiness t = new TesterBussiness();
		try{
			t.openFile("abc.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
