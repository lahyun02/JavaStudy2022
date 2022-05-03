package chapter02;

import java.util.Scanner;

public class Prac2_5 {

	public static void main(String[] args) {
		
		//Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 
		//이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 
		//삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
		
		//길이가 가장 긴 변의 길이는 다른 두 변 길이의 합보다 작아야 삼각형이 될 수 있음.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		//a가 가장 큰 경우
		if (a > b && a > c) {
			if (a < b + c)
				System.out.println("삼각형이 됩니다.");
			else 
				System.out.println("삼각형이 안돼요~");
		}
		
		//b가 가장 큰 경우
		if (b > a && b > c) {
			if (b < a + c)
				System.out.println("삼각형이 됩니다.");
			else 
				System.out.println("삼각형이 안돼요~");
		}
		
		//c가 가장 큰 경우
		if (c > a && c > b) {
			if (c < a + b)
				System.out.println("삼각형이 됩니다.");
			else 
				System.out.println("삼각형이 안돼요~");
		}
		
		scan.close();
	}

}
