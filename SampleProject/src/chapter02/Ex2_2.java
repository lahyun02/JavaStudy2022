package chapter02;

import java.util.Scanner; //ctrl + shift + O (임포트 자동 작성)

/*스캐너로 10~99 사이의 숫자를 입력받아, 십의 자리와 일의 자리가 같은지 판별하는 프로그램*/
public class Ex2_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //객체 선언 및 생성
		System.out.println("2자리수 정수입력(10~99) >> ");
		int num = scan.nextInt();	//입력받은 수
		int ten = num / 10; 		//십의 자리
		int one = num % 10;			//일의 자리
		if(ten == one)				//십의 자리와 일의 자리가 같다면 	
			System.out.println("십의 자리와 일의 자리가 일치합니다.");
		else		
			System.out.println("십의 자리와 일의 자리가 일치하지 않습니다.");

		
		
//		if(조건식) 	{실행할 문장}
//		else		{실행할 문장}
		
		num = scan.nextInt(); //한번 선언한 변수를 호출함으로써 재활용 가능. //이때 위에 입력한 값은 사라짐.
		
 		int a = num / 10; 
 		
 		int b = num % 10;
 		
 		if(a==b) {
 			System.out.println("같아요");
		}
 		else {
 			System.out.println("달라요");
 		}
 		
		
		scan.close();

	}

}
