package mini_library_view;

import javax.swing.JButton;

import mini_library_handler.MemberButtonEventHandler;

public class MemberButtonView extends MemberView {
	public JButton listBtn = new JButton("전체보기");
	public JButton inputBtn = new JButton("추가");
	public JButton updateBtn = new JButton("수정");
	public JButton deleteBtn = new JButton("삭제");
	public JButton searchBtn = new JButton("검색");
	public JButton cancelBtn = new JButton("취소");
	
	public MemberButtonView() {
		// TODO Auto-generated constructor stub
		add(listBtn);
		add(inputBtn);
		add(updateBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);
		
		MemberButtonEventHandler btneventHandler = new MemberButtonEventHandler(this);
		listBtn.addActionListener(btneventHandler);
		inputBtn.addActionListener(btneventHandler);
		updateBtn.addActionListener(btneventHandler);
		deleteBtn.addActionListener(btneventHandler);
		searchBtn.addActionListener(btneventHandler);
		cancelBtn.addActionListener(btneventHandler);
	}
}
