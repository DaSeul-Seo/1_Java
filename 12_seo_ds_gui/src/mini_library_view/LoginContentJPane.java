package mini_library_view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginContentJPane extends JPanel implements ActionListener{
	BookContentJPane book;
	MemberContentJPane member;
	private static String aid = "qwer";
	private static String apw = "1234";
	JLabel title = new JLabel("********* 도서관 *********");
//	JLabel id = new JLabel("id : ");
//	JLabel pw = new JLabel("pw : ");
	JPanel ap = new JPanel(new GridLayout(2,1));
	JPanel pane = new JPanel(new GridBagLayout());
	JPanel p1 = new JPanel(new GridBagLayout());
	JPanel p2 = new JPanel(new GridBagLayout());
	
	public JButton btnbook = new JButton("도서관리");
	public JButton btnmember = new JButton("회원관리");
//	JPanel p2 = new JPanel();
//	JPanel p3 = new JPanel();
//	JPanel p4 = new JPanel();
	
//	JTextField idtf = new JTextField(15);
//	JTextField pwtf = new JTextField(15);
//	
//	JButton btnlog = new JButton("로그인");
//	JButton btnsign = new JButton("회원가입");
	
	public LoginContentJPane() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		
		p1.add(title);
		title.setFont(new Font("굴림체", Font.BOLD, 27));
		add(BorderLayout.NORTH, p1);
		
		p2.add(btnbook);
		p2.add(btnmember);
		add(BorderLayout.CENTER, p2);
		
		ap.add(p1);
		ap.add(p2);
		
		pane.add(ap);
		
		add(pane);
		
		btnbook.addActionListener(this);
		btnmember.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			if(btn==btnbook) {
				new BookJFrame().setVisible(true);
			}
			if(btn==btnmember) {
				new MemberJFrame().setVisible(true);
			}
		}
	}
}