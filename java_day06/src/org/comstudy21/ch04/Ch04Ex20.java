package org.comstudy21.ch04;

import java.util.Random;
import java.util.Scanner;

public class Ch04Ex20 {
	// �߰� �ɰ���

	public static void test08(String[] args) {
		// ���� �߻���
		// Math.random()
		// Random Ŭ������ �̿��� ���� �߻���

		// �ּҰ�, �ִ밪 �Է��ϱ�
		// �����̸� ����!
		// Ʋ�ȴٸ� ū���� Ʋ�ȴ��� �������� Ʋ�ȴ��� ǥ���ϰ� ���� ���� �ٽ�.
		// 6�� �ݺ�
		// --------------------
		// ��õ� �Ͻðڽ��ϱ�?(y/n)
		// y�� n�̿� ������ y�� n�� �Է��ϼ���
		// �����̸�
		// -----�����ϼ̽��ϴ�-----

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		while (true) {
			int min = 1, max = 100;
			int number = min + rand.nextInt(max); // 0~�Է°�����
			int userNum = 0;
			int cnt = 6; // 6�� �Ѿ�� ����
			char yn = 0;

			System.out.println("hint: " + number);
			System.out.println("�ý����� ���ڸ� ��������ϴ�.");

			for (cnt = 1; cnt < 6; cnt++) {
				System.out.printf("���纸����(%d~%d): ", min, max);
				userNum = scan.nextInt();
				while (userNum < min || userNum > max) {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
					System.out.printf("�ٽ� �Է��ϼ���(%d~%d): ", min, max);
					userNum = scan.nextInt();
				}
				if (userNum < number) {
					min = userNum + 1;
					System.out.println("�ʹ� ���� ���ڸ� �Է��Ͽ����ϴ�.");
				} else if (userNum > number) {
					max = userNum - 1;
					System.out.println("�ʹ� ū ���ڸ� �Է��Ͽ����ϴ�.");
				} else {
					System.out.println(userNum + "�����Դϴ�!");
					System.out.println("-----�����ϼ̽��ϴ�.-----");
					break;
				}
				System.out.printf("%d���� ��ȸ�� ���ҽ��ϴ�.", 5 - cnt);
				System.out.println();
			}
			if (cnt >= 6) {
				System.out.println("��ȸ�� ��� �����Ǿ����ϴ�.");
			}
			do {
				System.out.println("��õ� �Ͻðڽ��ϱ�? (y / n)");
				System.out.println("�Է�: ");
				yn = scan.next().charAt(0);
			} while (!(yn == 'n' || yn == 'y'));

			if (yn == 'n') {
				break;
			}
		}
		System.out.println("������ ������~");

	} // end of main

	public static void test07(String[] args) {
		// ���� �߻���
		// Math.random()
		// Random Ŭ������ �̿��� ���� �߻���

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		while (true) {
			int min = 1, max = 100;
			int number = min + rand.nextInt(max); // 0~�Է°� ����
			int userNum = 0;
			int cnt = 6; // 6�� �Ѿ�� ����
			char yn = 0;

			System.out.println("hint: " + number);
			System.out.println("�ý����� ���ڸ� ��������ϴ�.");

			// �����̸� ����! �ϰ� ������
			// �����̸� ū ������ ���� ������ ǥ���ϰ� ������ �����ش�.
			// ---------------------
			// ��õ� �Ͻðڽ��ϱ�?(y/n)
			// -----�����ϼ̽��ϴ�------
			// y�� �ٽ� ����
			// n�� �����ϼ̽��ϴ�.
			// -y��n�̿� ������ y�� n�� �Է��ϼ���
		
			// �ּҰ�, �ִ밪 �Է��ϱ�
			// �����̸� ����!
			// Ʋ�ȴٸ� ū���� Ʋ�ȴ��� �������� Ʋ�ȴ��� ǥ���ϰ� ���� ���� �ٽ�.
			// 6�� �ݺ�
			// --------------------
			// ��õ� �Ͻðڽ��ϱ�?(y/n)
			// y�� n�̿� ������ y�� n�� �Է��ϼ���
			// �����̸�
			// -----�����ϼ̽��ϴ�-----

			for (cnt = 1; cnt < 6; cnt++) {
				System.out.printf("���纸����(%d~%d): ", min, max);
				userNum = scan.nextInt();
				while (userNum < min || userNum > max) {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
					System.out.printf("�ٽ� �Է��ϼ���(%d~%d): ", min, max);
					userNum = scan.nextInt();
				}
				if (userNum < number) {
					min = userNum + 1;
					System.out.println("�ʹ� �������ڸ� �Է��Ͽ����ϴ�.");
				} else if (userNum > number) {
					max = userNum - 1;
					System.out.println("�ʹ� ū���ڸ� �Է��Ͽ����ϴ�.");
				} else {
					System.out.println(userNum + "�����Դϴ�!");
					System.out.println("-----�����ϼ̽��ϴ�-----");
					break;
				}
				System.out.printf("%d���� ��ȸ�� ���ҽ��ϴ�.", 6 - cnt);
				System.out.println();
			} // end of for

			if (cnt >= 6) {
				System.out.print("��ȸ�� �� �Ҿ����ϴ�.");
			}
			do {
				System.out.println("��õ� �Ͻðڽ��ϱ�? (y / n)");
				System.out.print("�Է�: ");
				yn = scan.next().charAt(0);

			} while (!(yn == 'y' || yn == 'n'));

			if (yn == 'n') {
				break;
			}
		} // end of while
		System.out.println("������ ������~");
	} // end of main

	public static void test06(String[] args) {
		// ���� :
		// (0+)1+1-2+3-5+8-13+21 = 14
		int p = 0; // ������
		int c = 1; // ������
		int n = 0; // ������
		int total = 0; // ��ü ��
		int i = 1; // �ڸ���
		
		while (c <= 21) {
			System.out.print(c);
			if (i % 2 == 1) {
				if (i == 1) {
					total += c;
					System.out.print("+");
				} else {
					total -= c;
					System.out.print("-");
				}
			} else {
				total += c;
				System.out.print(c!=21? "+": "");
			}
			n = p + c;
			p = c;
			c = n;
			
			i++;
		}
		System.out.print("=" + total);
	}
	

	public static void test05(String[] args) {
		// ���� :
		// (0+)1+1-2+3-5+8-13+21 = 14
		int p = 0; // ������
		int c = 1; // ������
		int n = 0; // ������
		int total = 0; // ��ü ��
		int i = 1; // �ڸ���

		while (c <= 21) {
			if (i % 2 == 0) {
				total += c;
				System.out.print("+" + c); 
			} else {
				if(c == 1) {
					total += c;
					System.out.print("+" + c);
				}else {
					total -= c;
					System.out.print("-" + c);
			}
			}
			n = p + c;
			p = c;
			c = n;

			i++;

		} // while
		System.out.print("=" + total);

	} // main
	

	public static void test04_2(String[] args) {
		// (0+)1+1+2+3+5+8+13+21 = 54
		// ������ + ������ = ������
		// ������ => ������, ������ => ������
		// ���� �߿�!

		int total = 0;

		// for���� �̿��ؼ� �Ǻ���ġ ���� ����.(hint = ���� �˰���)
		for (int p = 0, c = 1, n; c <= 21; n = p + c, p = c, c = n) {
			System.out.print(c);
			System.out.print(c != 21 ? "+" : "");
			total += c;
		}
		System.out.println("=" + total);
	}
	

	public static void test04_1(String[] args) {
		// (0+)1+1+2+3+5+8+13+21 = 54
		// ������ + ������ = ������
		// ������ => ������, ������ => ������
		// ���� �߿�!

		int prev = 0;
		int cur = 1;
		int next = 0;
		int total = 0;

		// while���� �̿��ؼ� �Ǻ���ġ ���� ����.(hint = ���� �˰���)
		while (cur <= 21) {
			System.out.print(cur);
			System.out.print(cur != 21 ? "+" : "");
			total += cur;
			next = prev + cur;
			prev = cur;
			cur = next;

		}
		System.out.println("=" + total);

	}
	

	public static void test03(String[] args) {
		// (0-)1+2-3+4-5+6-7+8-9+10 = 7
		// total += 1
		// total -= 2
		// total += 3
		int total = 0;
		int num = 1;
		final int MAX = 10;

		while (num <= MAX) {
			System.out.print(num);

			if (num % 2 == 1) {
				total = num == 1 ? num : total - num;
				// int total =2; �϶�
				// total -= num;
				System.out.print("+");
			} else {
				System.out.print(num == MAX ? "=" : "-"); // ��ȣ�� �ڿ� �ٿ��ִ� ��.
				total += num; // ��Ģ����
			}
			num += 1;
		} // end of while
		System.out.print(total);

		/*
		 * Me int total = 0; int num = 1;
		 * 
		 * while(num<11) { if(num == 1 || num%2 == 0) { total = total + num; } else {
		 * total = total - num; } if(num%2 == 1) { System.out.print(num + "+"); } else
		 * if(num == 10){ System.out.print(num + " "); } else { System.out.print(num +
		 * "-"); } num++; } System.out.println("= " + total);
		 */
	}
	

	public static void test02(String[] args) {
		// 30 + 40 + 50 + 60 + 70 = 250
		// while���� �̿��ؼ� �����Ͻÿ�.

		// ���� ����
		// (T)
		int total = 0;
		int number = 30;
		final int MAX = 70;

		while (number <= MAX) {
			System.out.print(number + " ");
			total += number;
			if (number != MAX) {
				System.out.print("+ ");
			} // end of if
			number += 10;
		} // end of while
		System.out.println("= " + total);

		/*
		 * int total = 0;
		 * 
		 * int i = 3; while (i < 8) { total += i; System.out.print(i * 10 + " "); if (i
		 * !=7) { System.out.print("+ "); } i++; } System.out.println("=" + total*10);
		 */
	}
	

	public static void test01_2(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		int total = 0;

		int i = 1;
		while (i < 11) {
			total += i;
			System.out.print(i + " ");
			if (i != 10) {
				System.out.print("+");
			}
			i++;
		}
		System.out.print("=" + total);
	}
	

	public static void test01_1(String[] args) {
		int total = 0;

		int i = 1;
		while (i < 11) {
			total += i;
			System.out.print(i + " ");
			if (i != 10) {
				System.out.print("+ ");
			}
			i++;
		}
		System.out.println("=" + total);

	}
	

	public static void test01(String[] args) {
		// 1~10������ ���� total�� �����ϴ� ���α׷�
		// while���� ���ѷ����� ���ȴ�.
		final int MAX = 10;
		int total = 0;

		int i = 1;
		while (i <= MAX) {
			total += i;
			System.out.print(i + " ");
			if (i != MAX)
				System.out.print("+ ");
			i++;
		}
		System.out.println("= " + total);

	}

}
