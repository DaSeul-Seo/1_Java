package java_day25_io;

import java.io.FileInputStream;
import java.io.IOException;

public class Day25Ex05 {
	public static void main(String[] args) throws IOException {
		// 파일의 내용을 읽어와서 화면에 출력 한다.
		FileInputStream input = new FileInputStream("C:\\Users\\Kosmo_00\\Documents\\news.txt");
		
		int data = 0;
		while((data=input.read())!=-1) {
			System.out.write(data);
		}
		
		// 파일 입출력 마무리
		input.close();
	}
}
