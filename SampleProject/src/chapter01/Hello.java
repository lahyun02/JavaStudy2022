//성적 처리 프로그램 (국어, 영어, 수학)

package chapter01;

import java.util.Scanner;
//import java.util.*; -> 

public class Hello { //
	
	//합산하는 메소드
	public static int sum(int n, int m){
		return n + m;
	}
	
	
	
	public static void main(String[] args) {
		
		String msg = "합산결과는 ";
		System.out.println(msg + sum(300, 500));
		
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14; //파이값 상수
		
		System.out.print("원의 반지름은?");
		
		double radius = sc.nextDouble();
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적은 " + circleArea + "입니다.");
		sc.close();
		
		
		
		
//		//객체 선언 및 생성	
//		Scanner scanner = new Scanner(System.in); //클래스 명과 생성자 명은 같게 함. 
//		int kor = scanner.nextInt();
//		int eng = scanner.nextInt();
//		int math = scanner.nextInt();
//		int total = kor + eng + math;
//		System.out.println("Hello World!!!");
//		System.out.println("총점은 " + total + "점 입니다.");

	}

}
