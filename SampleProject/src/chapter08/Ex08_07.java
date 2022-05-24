package chapter08;

import java.io.*;
import java.util.Scanner;

public class Ex08_07 {

	public static void main(String[] args) {
		FileReader fin = null; 		// null로 초기화
		BufferedOutputStream out = null;
		try {
			fin = new FileReader("d:\\test2.txt");
			out = new BufferedOutputStream(System.out, 5); 
			int c;
			while((c = fin.read()) != -1)
				out.write(c); 
			
//			Scanner scan = new Scanner(System.in);
//			scan.nextLine();
//			new Scanner(System.in).nextLine();
//			out.flush();
			
			fin.close();
//			out.close(); 		// 여기서 out을 close하면 close하면서 남아있는 아이들을 다 화면에 찍어버림! close()와 flush()가 비슷한 기능을 하고 있음!
		}
		catch(IOException e) {e.printStackTrace();}
		
	}

}
