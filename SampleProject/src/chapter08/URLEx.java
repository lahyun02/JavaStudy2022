package chapter08;

import java.io.*;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://n.news.naver.com/mnews/article/001/0013215582?rc=N&ntype=RANKING");
			System.out.println("프로토콜 : " + url.getProtocol()); 
			System.out.println("호스트 : " + url.getHost());
			System.out.println("포트 : " + url.getPort()); 
			
			System.out.println(">> HTML 전송 시작"); 
			InputStream is = url.openStream(); //html정보를 가져와서 inputstream(추상클래스-객체생성x)에 담아놓는다. openStream()메소드의 리턴타입: InputStream. 
			BufferedReader reader = new BufferedReader(new InputStreamReader(is)); // 1바이트 단위 정보를 2바이트로 묶어서 버퍼드 리더에 넣음..
			String msg;
			//밑의 코드 외우기(10번쓰기)
			while((msg=reader.readLine()) != null) {		// 한줄씩 읽어서 널이 아닐때까지 
				System.out.println(msg);
			}
			is.close();
			reader.close();
		}
		catch(IOException e) {e.printStackTrace();}
		
		
	}

}
