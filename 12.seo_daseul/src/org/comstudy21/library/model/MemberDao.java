package org.comstudy21.library.model;

import java.util.ArrayList;

public class MemberDao {
	private ArrayList<MemberDto> memberdtoList;
	private static int mseq = 100;
	
	public MemberDao(ArrayList<MemberDto> memberdtoList) {
		this.memberdtoList = memberdtoList;
		this.memberdtoList.add(new MemberDto("1111","1111",mseq++,"kim","010-1234-1234","85.12.22"));
		this.memberdtoList.add(new MemberDto("2222","2222",mseq++,"lee","010-5666-6666","92.05.30"));
		this.memberdtoList.add(new MemberDto("3333","3333",mseq++,"park","010-9999-9999","01.09.11"));
		this.memberdtoList.add(new MemberDto("4444","4444",mseq++,"jang","010-8888-8888","94.10.01"));
	}

	public ArrayList<MemberDto> selectAll() {
		ArrayList<MemberDto> mlist = new ArrayList<MemberDto>();
		for(int i = 0; i<memberdtoList.size(); i++) {
			MemberDto memberdto = memberdtoList.get(i);
			String id = memberdto.getId();
			String password = memberdto.getPassword();
			int memberidx = memberdto.getMemberidx();
			String name = memberdto.getName();
			String phone = memberdto.getPhone();
			String birthday = memberdto.getBirthday();
			
			MemberDto newmemberdto = new MemberDto(memberidx, name, phone, birthday);
			mlist.add(memberdto);
		}
		return mlist;
	}

	public void update(MemberDto memberdto) {
		for(int i = 0; i<memberdtoList.size(); i++) {
			int updateidx = memberdto.getMemberidx();
			if(memberdtoList.get(i).getMemberidx() == updateidx) {
				memberdtoList.set(i, memberdto);
				System.out.println("----- 회원정보가 수정되었습니다. -----");
				return;
			} 
		}
	}

//	public void updateNo(MemberDto memberdto) {
//		for(int i = 0; i<memberdtoList.size(); i++) {
//			int updateidx = memberdto.getMemberidx();
//			if(memberdtoList.get(i).getMemberidx() == updateidx) {
//				memberdtoList.get(i).(new MemberDto(updateidx,null,null,null)));
//				return;
//			}
//		}
//	}
	
	public void delete(MemberDto memberdto) {
		String updateName = memberdto.getName();
		for(int i = 0; i<memberdtoList.size(); i++) {
			if(memberdtoList.get(i).getName().equals(updateName)) {
				memberdtoList.remove(i);
				System.out.println("----- 회원삭제가 완료되었습니다. -----");
				return;
			}
		}
		if(!memberdtoList.equals(updateName)) {
			System.out.println("----- 회원이 존재하지 않습니다. -----");
		}
	}

}
