package chapter02;

import java.util.Scanner;

public class Prac2_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요(단위 원)>>");
		int won = scan.nextInt();
		
		int oman = won / 50000; //오만원권
		int omanM = won % 50000; //입력금액에서 오만원을 나눈 나머지
		
		if (won >= 0) 
			System.out.println("오만원권 " + oman + "매");
		
		int man = omanM / 10000; //만원권
		int manM = omanM % 10000; //나머지
		
		if (won >= 0) 
			System.out.println("만원권 " + man + "매");
		
		int cheon = manM / 1000; //천원권
		int cheonM = manM % 1000; //나머지		
		
		if (won >= 0) 
			System.out.println("천원권 " + cheon + "매");
		
		int back = cheonM / 100; //백원
		int backM = cheonM % 100; //나머지
		
		if (won >= 0) 
			System.out.println("백원 " + back + "개");
		
		int oship = backM / 50; //오십원
		int oshipM = backM % 50; //나머지
		
		if (won >= 0) 
			System.out.println("오십원 " + oship + "개");
		
		int ship = oshipM / 10; //십원
		int shipM = oshipM % 10;
		
		if (won >= 0) 
			System.out.println("십원 " + ship + "개");
		
		int il = shipM / 1; //일원
		int ilM = shipM % 1; //나머지
		
		if (won >= 0) 
			System.out.println("일원 " + il + "개");
		
		
		
//		int a = won / 50000; //오만원권
//		int b = won % 50000; //입력금액에서 오만원을 나눈 나머지
//		
//		if (won >= 0) 
//			System.out.println("오만원권" + a + " 매");
//		
//		a = b / 10000; //만원권
//		b = b % 10000; //나머지
//		
//		if (won >= 0) 
//			System.out.println("만원권" + a + " 매");
//		
//		a = b / 1000; //천원권
//		b = b % 1000; //나머지		
//		
//		if (won >= 0) 
//			System.out.println("천원권" + a + " 매");
//		
//		a = b / 100; //백원
//		b = b % 100; //나머지
//		
//		if (won >= 0) 
//			System.out.println("백원" + a + " 매");
//		
//		a = b / 50; //오십원
//		b = b % 50; //나머지
//		
//		if (won >= 0) 
//			System.out.println("오십원" + a + " 매");
//		
//		a = b / 10; //십원
//		b = b % 10;
//		
//		if (won >= 0) 
//			System.out.println("십원" + a + " 매");
//		
//		a = b / 1; //일원
//		b = b % 1; //나머지
//		
//		if (won >= 0) 
//			System.out.println("일원" + a + " 매");
		
		
		scan.close();
	}

}
