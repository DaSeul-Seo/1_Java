package mini_library_view;

import javax.swing.JButton;

import mini_library_handler.BookButtonEventHandler;

public class BookButtonView extends BookView {
	public JButton listBtn = new JButton("전체보기");
	public JButton inputBtn = new JButton("추가");
	public JButton updateBtn = new JButton("수정");
	public JButton deleteBtn = new JButton("삭제");
	public JButton searchBtn = new JButton("검색");
	public JButton cancelBtn = new JButton("취소");
	
	public BookButtonView() {
	
		add(listBtn);
		add(inputBtn);
		add(updateBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);
		
		BookButtonEventHandler btnevtHandler = new BookButtonEventHandler(this);
		listBtn.addActionListener(btnevtHandler);
		inputBtn.addActionListener(btnevtHandler);
		updateBtn.addActionListener(btnevtHandler);
		deleteBtn.addActionListener(btnevtHandler);
		searchBtn.addActionListener(btnevtHandler);
		cancelBtn.addActionListener(btnevtHandler);
	}
}
