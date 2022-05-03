package chapter02;

import java.util.Scanner;

public class Prac2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scan.nextInt();
		
		double dollor = won / 1100;
		
		System.out.println(won + "은 $" + dollor + "입니다.");
		
		scan.close();

	}

}
