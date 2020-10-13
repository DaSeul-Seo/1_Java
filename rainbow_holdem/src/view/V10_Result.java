package view;

public class V10_Result extends MainView {
	@Override
	public void show() {
		// TODO Auto-generated method stub
		int Allresult = (int)request.get("result");
		
		if(Allresult>15) {
			System.out.println("Your score is " + Allresult);
			System.out.println("You Lose...");
		} else if(Allresult<=15 && Allresult>0){
			System.out.println("Your score is " + Allresult);
			System.out.println("You Win!!! Congratulation");
		} else {
			System.out.println("¢¼¢»¡ß¡Þ¢À¢¿¢¾¢½ Rainbow ¢¼¢»¡ß¡Þ¢À¢¿¢¾¢½");
		}
	}
}
