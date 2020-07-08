package org.comstudy21.library.model;

public class MemberDto {
	int memberidx;
	String name, phone, birthday;
	String id,password;
	
	public MemberDto() {
		this(0,"","","");
	}
	
	public MemberDto(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public MemberDto(int memberidx, String name, String phone, String birthday) {
		this.memberidx = memberidx;
		this.name = name;
		this.phone = phone;
		this.birthday = birthday;
	}

	public int getMemberidx() {
		return memberidx;
	}

	public void setMemberidx(int memberidx) {
		this.memberidx = memberidx;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "[" + memberidx + " | " + name + " | " + phone
				+ " | " + birthday + "]";
	}
	
}
