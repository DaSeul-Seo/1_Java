package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strNow1 = now.toString(); // ���ڿ��� �ٲپ 
		System.out.println(strNow1);
		
		
		SimpleDateFormat format =
				new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		String formatStr = format.format(now);
		System.out.println(formatStr);
	}
}
