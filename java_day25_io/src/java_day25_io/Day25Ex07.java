package java_day25_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Day25Ex07 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("test_io.txt");
		FileOutputStream out = new FileOutputStream("data.txt");
		int data = 0;
		while((data = in.read())!=-1) {
			out.write(data);
		}
		System.out.println("파일 복제 완료!");
		in.close();
		out.close();		
	}
}
