package proxy;

public class SocialMediaImage implements Displayable {
	private String image;
	private boolean isLoaded;

	SocialMediaImage() {
		image = "";
		isLoaded = false;
	}

	@Override
	public void display() {
		System.out.println(image);
	}

	public void load() {
		// anggap ini menggunakan thread dan memakan waktu lama
		System.out.println("load image ...");

		this.image = "the image";
		this.isLoaded = true;
	}

	public boolean isLoaded() {
		return isLoaded;
	}
}