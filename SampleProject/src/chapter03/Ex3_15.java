package chapter03;

import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("분자: ");
			int dividend = scan.nextInt();
			System.out.println("분모: ");
			int divisor = scan.nextInt();
			try 
			{
				System.out.println("나눗셈결과 : " + dividend/divisor);
				break;
			}
			catch(ArithmeticException e) 
			{	
				System.out.println("분모가 0이라 나눌 수 없어요!");
	//			e.printStackTrace(); 	//에러가 들어가서 생기는 오류문을 그대로 찍어주는 것.
				//java.lang.ArithmeticException: / by zero
				//at chapter03.Ex3_15.main(Ex3_15.java:16)
			}
		}		
	}

}
