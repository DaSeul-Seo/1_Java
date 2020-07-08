package org.comstudy21.sb_phonebook.model;

public class PbDto {
	int idx;
	String name, phone, email;
	
	public PbDto() {
		this(0,"","","");
	}

	public PbDto(int idx, String name, String phone, String email) {
		this.idx = idx;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "[" + idx + " | " + name + " | " + phone + " | " + email + "]";
	}
	
}
