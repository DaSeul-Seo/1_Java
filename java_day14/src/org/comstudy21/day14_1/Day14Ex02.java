package org.comstudy21.day14_1;

public class Day14Ex02 {
	public static void main(String[] args) {
		// �ٷ��л� Ŭ������ �̿��� ��ü ����
		// ���� �ְ� ����ϴ�.
		Gstudent gst = new Gstudent(2020, "ȫ�浿", "ü����", 500000, "�ѱ�����Ʈ����");
// 		 ��Ű���� �ٸ��� Ŭ������ �ٸ��� ���� �Ұ�./ public�� �ٿ��ָ� ����
//		gst.num = 2020;
//		gst.name = "ȫ�浿";
//		gst.major = "ü����";
//		gst.pay = 500_000;
//		gst.team = "�ѱ�����Ʈ����";
		
		System.out.println(gst);
		
		Gstudent gst2 = new Gstudent(2030,"������","���ǰ�",500000,"�ѱ�����Ʈ����");
		System.out.println(gst2.toString());
//		System.out.println("=====�ٷ��л� ���=====");
//		System.out.println("�̸�: " + gst.name);
//		System.out.println("�й�: " + gst.num);
//		System.out.println("����: " + gst.major);
//		System.out.println("�޿�: " + gst.pay);
//		System.out.println("�Ҽ�: " + gst.team);
	}

}
