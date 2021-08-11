package test1;

public class PngDecoder extends ImageDecoder{

	public PngDecoder(String filename) {
		super(filename);
	}

	@Override
	void displayImage() {
		System.out.println("Displaying Png image");
	}

}
