package chapter03;

import java.util.Scanner;

public class Ex3_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) 	//무한루프, for(;;). 무한루프를 빠져나올 수 있는 조건을 만들어주어야 함.
		{
			System.out.print(">> ");
			String text = scan.nextLine();
			if(text.equals("exit")) break;
		}
		
	
		System.out.println("종료합니다.");
		
		scan.close();
	}

}
