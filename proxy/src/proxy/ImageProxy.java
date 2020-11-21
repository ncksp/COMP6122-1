package proxy;

public class ImageProxy implements Displayable {
	private SocialMediaImage realImage;

	@Override
	public void display() {
		if (!realImage.isLoaded()) {
			realImage.load();
			System.out.println("placeholder image");
			return;
		}

		realImage.display();
	}

}