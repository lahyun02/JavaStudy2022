package chapter08;

import java.util.*;
import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileWriter fout;
		int c;
		try {
			fout = new FileWriter("d:\\test1.txt");
			while(true) {
				String line = scan.nextLine();
				if(line.length() == 0) break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			scan.close();
		}
		catch(IOException e) { }
	}

}
