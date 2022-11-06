package chapter08;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
//		FileReader fin = null; 	// try문 안에 쓰면 밖에선 못쓰니까 밖에 선언.
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
//			in = new InputStreamReader(new FileInputStream("d:\\test.txt"), "MS949");
			fin = new FileInputStream("d:\\test.txt");
			in = new InputStreamReader(fin, "MS949");
			int c;
			while((c = in.read()) != -1)
				System.out.print((char)c);
			in.close();
			fin.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("입출력오류!");
		}
	}
}
