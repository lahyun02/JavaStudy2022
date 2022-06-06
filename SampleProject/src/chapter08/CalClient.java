package chapter08;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CalClient {

	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		Socket s = null;
		Scanner scan = new Scanner(System.in);
		try {
			s = new Socket("localhost", 9000);
			reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())); 
			while(true) {
				System.out.print("수식을 입력해주세요(+,-,*중 하나, 정수)>> ");
				String outMessage = scan.nextLine();
				if(outMessage.equalsIgnoreCase("bye")) {
					writer.write(outMessage + "\n"); 
					writer.flush();
					System.out.println("클라이언트에서 bye로 연결 종료했음!");
					break;
				}
				writer.write(outMessage + "\n");	//키보드에서 읽은 문자열 전송
				writer.flush();						// out의 스트림 버퍼에 있는 모든 문자열 전송 
				
				String inMessage = reader.readLine(); 	//서버로부터 한 행 수신
				System.out.println("서버: " + inMessage); //서버로부터 받은 메시지를 화면에 출력 
			}
		}
		catch(IOException e) {e.printStackTrace();}
		finally {
			try {
				scan.close();
				if(s != null) s.close();
				reader.close();
				writer.close();
			}
			catch(IOException e) {e.printStackTrace();}
		}
		
	}

}
