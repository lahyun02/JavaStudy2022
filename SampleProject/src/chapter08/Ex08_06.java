package chapter08;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex08_06 {

	public static void main(String[] args) {
		byte b[] = new byte[6];
		FileInputStream fin;
		try {
			fin = new FileInputStream("d:\\test.out");
			int c, n=0;
			while((c = fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("내용을 출력합니다...");
			for(byte bb:b) System.out.print(bb + " ");
			fin.close();
		}
		catch(IOException e) {e.printStackTrace();} 
	}
}
