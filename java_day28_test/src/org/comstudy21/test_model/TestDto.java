package org.comstudy21.test_model;

public class TestDto {
	String name, phone, birthday;
	int no;
	
	public TestDto() {}

	public TestDto(int no, String name, String phone, String birthday) {
		this.name = name;
		this.phone = phone;
		this.birthday = birthday;
		this.no = no;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "TestDto [name=" + name + ", phone=" + phone + ", birthday=" + birthday + ", no=" + no + "]";
	}
	
}
