package test1;

public class ImageDecoderFactory {
	
	public static ImageDecoder getInstance(String filename) {
		if(filename.endsWith(".jpg")) return new JpgDecoder(filename);
		if(filename.endsWith(".png")) return new PngDecoder(filename);
		else return null;
	}
	
}
