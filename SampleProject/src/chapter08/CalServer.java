package chapter08;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalServer {

	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		ServerSocket ss = null;
		Socket s = null;
		Scanner scan = new Scanner(System.in);
//		int sum = 0;
		
		try {
			ss = new ServerSocket(9000); // 서버 소켓 생성
			System.out.println("연결을 기다리고 있습니다...");
			s = ss.accept(); 	// 클라이언트로부터 연결 요청 대기
			System.out.println("연결 완료!"); 
			reader = new BufferedReader(new InputStreamReader(s.getInputStream()) );
			writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true) {
				String inputMessage = reader.readLine(); 	//클라이언트가 보낸 메시지 1줄단위로 받기
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결 종료했음!");
					break;
				}
				System.out.println("클라이언트가 보낸 수식: " + inputMessage);
				StringTokenizer st = new StringTokenizer(inputMessage, "+-*"); 
				int total = 0;
				int sub = 0;
//				int temp = 0;
				while(st.hasMoreTokens()) {
					
					
					
					int num = Integer.parseInt(st.nextToken().trim()); 
					int num2 = Integer.parseInt(st.nextToken().trim()); 
					if(inputMessage.contains("+")) {
						total = num + num2;
					}
					else if(inputMessage.contains("-")) {
						total = num - num2;
					}
					else if(inputMessage.contains("*")) {
						total = num * num2;
					}
					
					
					
				}
				
				
				
//				System.out.println(sum);
				String outMessage = Integer.toString(total);	//수식을 계산한 값을 문자열로 바꿈
//				String outMessage2 = Integer.toString(sub);
//				System.out.println(outMessage); 
				writer.write(outMessage + "\n"); 		// 문자열로 바꾼 계산값을 전송
				writer.flush();							// writer의 스트림 버퍼에 있는 모든 문자열 전송
				
			}
		}
		catch(IOException e) {e.printStackTrace();}
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
