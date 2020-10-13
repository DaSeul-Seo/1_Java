package resource;

import java.util.Hashtable;
import java.util.Scanner;

import controller.AdminController;
import controller.BetController;
import controller.BoardController;
import controller.CallController;
import controller.InfoController;
import controller.LoginController;
import controller.MainController;
import controller.MoneyController;
import controller.RaiseController;
import controller.ResultController;
import controller.SignoutController;
import controller.SignupController;
import controller.UserController;
import gamestart.AppMain;
import model.Dao;
import view.V0_MainMenu;
import view.V10_Result;
import view.V1_Login;
import view.V2_Play;
import view.V3_SignUp;
import view.V4_1_Board1;
import view.V4_2_Board2;
import view.V4_3_Board3;
import view.V4_4_Board4;
import view.V4_Board;
import view.V5_Bet;
import view.V6_1_Money;
import view.V6_Admin;
import view.V7_User;
import view.V8_Info;
import view.V9_SignOut;

public interface Res { // ¿ä¼Òµé
	AppMain appmain = new AppMain();
	MainController mc = new MainController();
	LoginController lc = new LoginController();
	AdminController ac = new AdminController();
	SignupController suc = new SignupController();
	MoneyController monc = new MoneyController();
	InfoController ic = new InfoController();
	BoardController bc = new BoardController();
	UserController uc = new UserController();
	BetController betc = new BetController();
	SignoutController soc = new SignoutController();
	CallController cc = new CallController();
	RaiseController rc = new RaiseController();
	ResultController resultc = new ResultController();
	
	V0_MainMenu menu = new V0_MainMenu();
	V1_Login log = new V1_Login();
	V2_Play play = new V2_Play();
	V3_SignUp signup = new V3_SignUp();
	V4_Board board = new V4_Board();
	V4_1_Board1 board1 = new V4_1_Board1();
	V4_2_Board2 board2 = new V4_2_Board2();
	V4_3_Board3 board3 = new V4_3_Board3();
	V4_4_Board4 board4 = new V4_4_Board4();
	V5_Bet bet = new V5_Bet();
	V6_Admin admin = new V6_Admin();
	V6_1_Money money = new V6_1_Money();
	V7_User user = new V7_User();
	V8_Info info = new V8_Info();
	V9_SignOut signout = new V9_SignOut();
	V10_Result score = new V10_Result();
	
	Dao dao = new Dao();
	
	Scanner sc = new Scanner(System.in);
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	
	int[] card = {
			1,
			2,2,
			3,3,3,
			4,4,4,4,
			5,5,5,5,5,
			6,6,6,6,6,6,
			7,7,7,7,7,7,7,
			8,8,8,8,8,8,8,8,
			9,9,9,9,9,9,9,9,9,
			10,10,10,10,10,10,10,10,10,10};
}
