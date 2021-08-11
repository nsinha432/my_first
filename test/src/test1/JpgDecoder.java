package test1;

public class JpgDecoder extends ImageDecoder {

	public JpgDecoder(String filename) {
		super(filename);
	}

	@Override
	void displayImage() {
		System.out.println("Displaying jpg image");
	}
	
	
	
}
