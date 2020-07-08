package java_day25_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day25Ex03 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("test_io.txt");
		BufferedReader in = new BufferedReader(fileReader);

		String str = null;
		while((str = in.readLine())!= null) {
			System.out.println(str);
		}
	}

}
