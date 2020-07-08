package java_day25_io;

import java.io.File;
import java.io.IOException;

public class Day25Ex06 {

	public static void main(String[] args) throws IOException {
		//String pathname = "data.txt";
		String pathname = "C:\\Users\\Kosmo_00\\Documents\\news2.txt";
		File file = new File(pathname);
		
		if(file.exists()) {
			System.out.println("파일이 재중합니다!");
			if(file.delete()) {
				System.out.println("파일 삭제 성공!");
			}
		} else {
			System.out.println("파일이 부재중입니다!");
			// 파이 없으면 파일 만들기
			if(file.createNewFile() ) {
				System.out.println("파일 생성 성공!");
			}
		}
	}
}
