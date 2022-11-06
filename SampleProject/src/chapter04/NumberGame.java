package chapter04;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
//		System.out.println("1~100사이의 숫자 입력 : ");
		int com = rand.nextInt(100) + 1; //rand.nextInt(100) : 0~99까지 만들어줌.
//		int com1 = (int) Math.random()*100+1;
		
		
		boolean success = false;	//성공여부
		int tries = 1;
		//do-while문으로 교체해보세요.
		System.out.println("############# 숫자 맞추기 게임 #############");
		//do-while문
		do {
			if(tries > 7) break;
			System.out.print("1~100사이의 숫자 입력 : ");
			int user = scan.nextInt();
			if(user == com) {System.out.println("맞췄습니다!");}
			else if(user > com) {System.out.println("숫자를 높여보세요.");}
			else if(user < com){System.out.println("숫자를 낮춰보세요.");}
			tries++;
		}
		while(true);
		
		
		
		
		
		//while문
//		while(true) {
//			if(tries > 7) 	break;
//			System.out.print("1~100사이의 숫자 입력 : ");
//			int user = scan.nextInt();			//사용자입력한값
//			if(user == com) {		
//				success = true;
//				break;		//성공시 성공여부를 변경시킨다.
//			}
//			else if(user > com) {
//				System.out.println("숫자를 좀 더 낮춰보세요.");
//			}
//			else {
//				System.out.println("숫자를 좀 더 높여보세요.");
//			}
//			tries++;
//		}
		
		
		
		
		
		
		//성공여부에 따른 처리
		if(success == true)
			System.out.println("맞췄습니다!");
		else {
			System.out.println("컴퓨터 입력숫자 :" + com);
			System.out.println("아쉽지만 다음기회에..");
		}
		 
		scan.close();
	}

}
