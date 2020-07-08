package org.comstudy21.homework;
// ���� ���� �ý���
/*������ �Ϸ翡 �� ���ִ�.
 * �¼��� S��, A��, B�� Ÿ���� ������ ��� 10���� �¼��� �ִ�.
 * ���� ���� �ý����� �޴��� "����","��ȸ","���","������"�� �ִ�.
 * ������ �� �ڸ��� ������ �� �ְ� �¼�Ÿ��, �������̸�, �¼���ȣ�� ������� �Է¹޾� �����Ѵ�.
 * ��ȸ�� ��� ������ �¼��� ǥ���Ѵ�.
 * ��Ҵ� �������� �̸��� �Է��Ͽ� ����Ѵ�.
 * ���� �̸�,���� ��ȣ,���¸޴�,�߸��� ��� � ���ؼ� ���� �޽����� ����ϰ� ����ڰ� �ٽ� �õ��ϵ��� �Ѵ�.*/
import java.util.Scanner;

public class Training06_1 {
	static Scanner scan = new Scanner(System.in);
	static String[] menu = {"����<1> ", " ��ȸ<2> ", " ���<3> ", " ������<4>"}; // �޴� �迭�� ����
	static int MAX = 10;
	static int top = 0;
	static String[][] seat = new String[3][10]; // �¼��� ������ �迭�� ����
	
	public static void main(String[] args) {
		while(true) { // set�� ������ �����ϸ� ��� ����
			set();
		}
		
	}
	public static void set() {
		switch(menu()) { // menu �ҷ�����
		case 1: input(); break;
		case 2: output(); break;
		case 3: delete(); break;
		case 4: end(); break;
		default : System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");	
		}
	}
	public static int menu() {
		for(int i = 0; i<menu.length; i++) {
			System.out.print(menu[i]);
		}
		System.out.print(" >> ");
		int no = scan.nextInt();
		return no;
	}
	public static void input() {
		System.out.print("�¼�����  S<1>, A<2>, B<3> >>");
		int no = scan.nextInt();
		
		switch(no) {
		case 1:
			System.out.print("S >> ");
			for(int i  = 0; i<10; i++) {
				System.out.print(seat[0][i] == null? "--- ": seat[0][i] + " ");
				// 0 = S�¼�, ���� �ƹ��� ���� ������ "---", ������ ��+ " " ���
			}
			System.out.println();
			System.out.print("��ȣ >> ");
			int snum = scan.nextInt();
			System.out.print("�̸� >> ");
			seat[0][snum-1] = scan.next();
			// ��ǻ�ʹ� 0���� �����ϱ� ������ 1�� ���ش�.
			break;
			
		case 2:
			System.out.print("A >> ");
			for(int i  = 0; i<10; i++) {
				System.out.print(seat[1][i] == null? "--- ": seat[1][i] + " ");
				// 1 = A�¼�, ���� �ƹ��� ���� ������ "---", ������ ��+" " ���
			}
			System.out.println();
			System.out.print("��ȣ >> ");
			int anum = scan.nextInt();
			System.out.print("�̸� >> ");
			seat[1][anum-1] = scan.next();
			// ��ǻ�ʹ� 0���� �����ϱ� ������ 1�� ���ش�.
			break;
			
		case 3:
			System.out.print("B >> ");
			for(int i  = 0; i<10; i++) {
				System.out.print(seat[2][i] == null? "--- ": seat[2][i] + " ");
				// 2 = B�¼�, ���� �ƹ��� ���� ������ "---", ������ ��+" " ���
			}
			System.out.println();
			System.out.print("��ȣ >> ");
			int bnum = scan.nextInt();
			System.out.print("�̸� >> ");
			seat[2][bnum-1] = scan.next();
			// ��ǻ�ʹ� 0���� �����ϱ� ������ 1�� ���ش�.
			break;
		default : System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
		}
		
	}
	public static void output() {
		System.out.print("S >> ");
		for(int i  = 0; i<10; i++) {
			System.out.print(seat[0][i] == null? "--- ": seat[0][i] + " ");
		}
		System.out.println();
		System.out.print("A >> ");
		for(int i  = 0; i<10; i++) {
			System.out.print(seat[1][i] == null? "--- ": seat[1][i] + " ");
		}
		System.out.println();
		System.out.print("B >> ");
		for(int i  = 0; i<10; i++) {
			System.out.print(seat[2][i] == null? "--- ": seat[2][i] + " ");
		}
		System.out.println();
	}
	
	public static void delete() {
		System.out.print("�¼�����  S<1>, A<2>, B<3> >>");
		int no2 = scan.nextInt();
		switch(no2) {
		case 1: 
			System.out.print("����� �̸� �Է�: ");
			String name0 = scan.next();
			for(int i = 0; i<10; i++) {
				if(name0.equals(seat[0][i])) { 
					seat[0][i] = "---";
					// �Է��� ���� �� �ڸ��� ���� ��ġ�ϸ�  "---"���� �ٲ�.
				}
			}
			break;
		case 2:
			System.out.print("����� �̸� �Է�: ");
			String name1 = scan.next();
			for(int i = 0; i<10; i++) {
				if(name1.equals(seat[0][i])) {
					seat[1][i] = "---";
					// �Է��� ���� �� �ڸ��� ���� ��ġ�ϸ�  "---"���� �ٲ�.
				}
			}
			break;
		case 3: 
			System.out.print("����� �̸� �Է�: ");
			String name2 = scan.next();
			for(int i = 0; i<10; i++) {
				if(name2.equals(seat[0][i])) {
					seat[20][i] = "---";
					// �Է��� ���� �� �ڸ��� ���� ��ġ�ϸ�  "---"���� �ٲ�.
				}
			}
			break;
		default: System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ��Է��ϼ���");
		return;
		}
	}
	
	public static void end() {
		System.out.println("�����մϴ�.");
		System.exit(0);
		
	}

}
