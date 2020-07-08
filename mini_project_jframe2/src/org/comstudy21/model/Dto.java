package org.comstudy21.model;

public class Dto {
	private int no;
	private String name, email, phone, gender, hobby;
	
	public Dto() {}

	public Dto(int no, String name, String email, String phone, String gender, String hobby) {
		this.no = no;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.hobby = hobby;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Dto [" + no + ", " + name + ", " + email + ", " + phone + ", " + gender
				+ ", " + hobby + "]";
	}
	
}
