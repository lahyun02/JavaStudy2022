package chapter02;

import java.util.Scanner;

public class Ex2_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("커피 메뉴 입력 : ");
		String menu = scan.next();

		
		switch(menu) {
		case "아메리카노" : 
		case "에스프레소" : 
			System.out.println("가격은 3500원 입니다."); break;
		case "카페라떼": 
		case "카푸치노": 
			System.out.println("가격은 3500원 입니다."); break;
		default : 
			System.out.println("메뉴에 없습니다"); 
			break;
		}
		
		
		scan.close();

	}

}
