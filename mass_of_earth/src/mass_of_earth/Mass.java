package mass_of_earth;
import java.text.DecimalFormat;

public class Mass {
	public static void main(String args[]) {
		
		String pattern = "########################";
		
		double m = 5.972*Math.pow(10, 24);
		
		DecimalFormat dc = new DecimalFormat(pattern);
		
		System.out.println(m);
		System.out.println(dc.format(m));
	}
}
