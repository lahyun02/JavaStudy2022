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
			s = new Socket("localhost", 9000);		// 클라이언트 소켓 생성. 서버에 연결
			reader = new BufferedReader(new InputStreamReader(s.getInputStream()));	//소켓입력스트림
			writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())); //소켓출력스트림
			while(true) {
				System.out.print("수식을 입력해주세요(+,-,*중 하나, 정수)>> ");
				String outMessage = scan.nextLine();	//키보드에서 한 행 일기
				if(outMessage.equalsIgnoreCase("bye")) {		//"bye"면
					writer.write(outMessage + "\n"); 			//"bye" 문자열 전송
					writer.flush();								//writer의 스트림 버퍼에 있는 모든 문자열 전송
					System.out.println("클라이언트에서 bye로 연결 종료했음!");
					break;										//사용자가 "bye"를 입력한 경우 서버로 전송 후 실행 종료
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
				if(s != null) s.close();			// 클라이언트 소켓 닫기
				reader.close();
				writer.close();
			}
			catch(IOException e) {e.printStackTrace();}
		}
		
	}

}
