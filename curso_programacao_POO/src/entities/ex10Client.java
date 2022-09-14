package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex10Client {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birthDate;
	
	//Constructor
	public ex10Client() {
	}

	public ex10Client(String name, String email, Date bithDate) {
		this.name = name;
		this.email = email;
		this.birthDate = bithDate;
	}

	//Get and Set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBithDate() {
		return birthDate;
	}

	public void setBithDate(Date bithDate) {
		this.birthDate = bithDate;
	}

	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}
	
}
