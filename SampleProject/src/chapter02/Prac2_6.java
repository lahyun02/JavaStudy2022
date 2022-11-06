package chapter02;

import java.util.Scanner;

public class Prac2_6 {

	public static void main(String[] args) {
		//369 게임을 간단히 작성해보자. 
		//1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고 
		//두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라. 
		//예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		
		int num = scan.nextInt();
		int count = 0;	//3,6,9의 갯수를 카운팅
		
		if(num>=1 && num <=99)  
		{
			int ten = num / 10;	//십의 자리 분류
			int one = num % 10;	//일의 자리 분류
			if(ten!=0 && ten%3==0) count++;
			if(one!=0 && one%3==0) count++;
			
			if(count == 1) 		System.out.println("박수짝");
			else if(count == 2) System.out.println("박수짝짝");
			else				System.out.println("박수 없어!");
		}
		else					
		{System.out.println("입력범위오류!");}
		
		
		
		
		scan.close();
	}

}
