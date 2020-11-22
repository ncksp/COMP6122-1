package model;

public class PersonalData {
	private String email;
	private String phone;
	private String name;

	public PersonalData(String email, String phone, String name) {
		super();
		this.email = email;
		this.phone = phone;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}
}
