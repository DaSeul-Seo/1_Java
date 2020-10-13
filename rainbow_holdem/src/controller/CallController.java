package controller;

public class CallController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		int n = (int)request.get("n");
		
		switch(n) {
		case 1:
			board1.show();
			break;
		case 2:
			board2.show();
			break;
		case 3:
			board3.show();
			break;
		case 4:
			board4.show();
			break;
		default:
			bc.service();			
		}
	}
}
