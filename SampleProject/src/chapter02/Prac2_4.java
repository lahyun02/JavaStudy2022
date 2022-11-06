package chapter02;

import java.util.Scanner;

public class Prac2_4 {

	public static void main(String[] args) {
		//Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
		//평균값을 구하는 것이 아님에 주의하라.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		//a가 가장 클 경우
		if (a > b && a > c) {
//			System.out.println("최고값 : " + a);
			
			if (b > c) {
				System.out.println("중간 값은 : " + b);
//				System.out.println("최소값 : " + c);
			}
			else {
				System.out.println("중간 값은 : " + c);
//				System.out.println("최소값 : " + b);
			}	
		}
		
		//b가 가장 클 경우
		if (b > a && b > c) {
//			System.out.println("최고값 : " + b);
			
			if (a > c) {
				System.out.println("중간 값은 : " + a);
//				System.out.println("최소값 : " + c);
			}
			else {
				System.out.println("중간 값은 : " + c);
//				System.out.println("최소값 : " + a);
			}	
		}
		
		//c가 가장 클 경우
		if (c > a && c > b) {
//			System.out.println("최고값 : " + c);
			
			if (a > b) {
				System.out.println("중간 값은 : " + a);
//				System.out.println("최소값 : " + b);
			}
			else {
				System.out.println("중간 값은 : " + b);
//				System.out.println("최소값 : " + a);
			}	
		}
		
		
		scan.close();
	}

}
