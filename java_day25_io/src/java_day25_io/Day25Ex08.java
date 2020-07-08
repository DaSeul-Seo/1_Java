package java_day25_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day25Ex08 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("data.txt")).useDelimiter(" 년 ");
		
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}

	}

}
