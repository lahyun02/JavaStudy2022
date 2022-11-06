package chapter08;

import java.io.*;
import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		//사용자가 키보드로 입력한 값이 들어간 in 버퍼의 내용을 읽어들일 reader
		BufferedReader reader = null;
		// 사용자가 입력한 값을 파일에 출력할 writer
		BufferedWriter writer = null; 
		Scanner scan = new Scanner(System.in);
		System.out.println("========= 메모장 프로그램 v1 =========");
		System.out.print("저장할 파일명 >>> ");
		String filename = scan.next();
		System.out.println("저장은 마지막 라인에 bye 입력해주세요. "); 
		
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new FileWriter("d:\\" + filename));
			String msg;
			// BufferedReader의 readLine()은 한줄 단위로 읽어들이는 게 가능! 
			while(!(msg = reader.readLine()).equals("bye")) 
				writer.write(msg + "\r\n"); 
			
			reader.close();
			writer.close();
		}
		catch(IOException e) {e.printStackTrace();}
	}
}
