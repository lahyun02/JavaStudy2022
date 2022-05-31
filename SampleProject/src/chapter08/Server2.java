package chapter08;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		ServerSocket ss = null;
		Socket s = null;
		Scanner scan = new Scanner(System.in); 
		
		try {
			ss = new ServerSocket(9000);	//서버소켓준비
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			s = ss.accept();				//소켓연결 
			System.out.println("연결 완료 "); 
			reader = new BufferedReader(new InputStreamReader(s.getInputStream())); 
			writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())); 
			while(true) {
				String inputMessage = reader.readLine(); 	//클라이언트가 보낸 메시지 1줄단위로 받기
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결 종료 ");
//					writer.flush();
					break;
				}
				System.out.println("클라이언트 :" + inputMessage); 
				
				System.out.println("클라이언트로 보내기 ===========");
				String outputMessage = scan.nextLine();
				writer.write(outputMessage + "\n");			//키보드에서 입력받은 문자열 전송
				writer.flush();								//writer에 남은 모든 문자열을 전송 
				
			}
		}
		catch(IOException e) {}
		finally {
			try {
				scan.close();
				s.close();
				reader.close();
				writer.close();
			}
			catch(IOException e) {e.printStackTrace();}
		}
		
		
	}

}
