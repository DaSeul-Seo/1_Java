package org.comstudy21.mini_library_member.model;

public class MemberDto {
	int no;
	String name, gender, phone, birthday;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int no, String name, String gender, String phone, String birthday) {
		super();
		this.no = no;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.birthday = birthday;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "MemberDto [" + no + ", " + name + ", " + gender + ", " + phone + ", "
				+ birthday + "]";
	}
	
}
