package chapter08;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalServer {

	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		ServerSocket ss = null;
		Socket s = null;
		Scanner scan = new Scanner(System.in);
		
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
					break;			// "bye"를 받으면 연결 종료
				}
				System.out.println("클라이언트가 보낸 수식: " + inputMessage);
				StringTokenizer st = new StringTokenizer(inputMessage, "+-*"); //문자열을 +,-,*로 구분해서 토큰만들기
				int total = 0;
				ArrayList<Integer> num = new ArrayList<Integer>();		//ArrayList 생성
				int i = 0;												// 인덱스
				while(st.hasMoreTokens()) {								// 다음 토큰이 있을때까지 반복
									
					num.add(Integer.parseInt(st.nextToken().trim()));	//ArrayList에 토큰 추가
					if(i==0) { total += num.get(0); }					//total에 0번째 num 추가 
					
					else if(inputMessage.contains("+")) {
						total += num.get(i);
					}
					else if(inputMessage.contains("-")) {
						total -= num.get(i);
					}
					else if(inputMessage.contains("*")) {
						total = total * num.get(i);
					}
					i++;
					
				}
				
				
				String outMessage = Integer.toString(total);	//수식을 계산한 값을 문자열로 바꿈
				writer.write(outMessage + "\n"); 				// 문자열로 바꾼 계산값을 전송
				writer.flush();									// writer의 스트림 버퍼에 있는 모든 문자열 전송
				
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
