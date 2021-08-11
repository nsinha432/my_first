package test1;

public class ImageMain {
	public static void main(String[] args) {
		ImageDecoder jpg = ImageDecoderFactory.getInstance("logo.jpg");
		jpg.displayImage();
		
		ImageDecoder png = ImageDecoderFactory.getInstance("lobo.png");
		png.displayImage();
	}
}
