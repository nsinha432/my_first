package test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("D:\\your_first\\revature_India_26th_July_13Week\\Week2(Java_Advanced)\\notes_images\\notes.txt");
			BufferedReader br = new BufferedReader(fr);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\notess.txt"));
			
			//int character = fr.read();
			
			//System.out.println(character);
			
			/*while(character != -1) {
				System.out.print((char)character);
				character = fr.read();	
				}*/
		
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
