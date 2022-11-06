package chapter08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prac8_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");
		FileWriter phone;
		try {
			phone = new FileWriter("c:\\Temp\\phone.txt");
			while(true) {
				System.out.print("이름 전화번호 >> "); 
				String line = scan.nextLine();
//				if(line.length() == 0) break;			// enter을 치면 반복문을 빠져나감
				phone.write(line, 0, line.length()); 	// 입력을 파일에 저장
				phone.write("\r\n", 0, 2);	// 줄 바꿈.
				if(line.equals("그만")) { 
					System.out.println("c:\\Temp\\phone.txt에 저장하였습니다."); 
					break;
				}
				
			}
			phone.close();
			scan.close();
			
		}
		catch (IOException e) {System.out.println("입출력오류!!!");}
	}

}
