package chapter03;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int num = scan.nextInt();	//정수1개 입력
		int sum = 0;				//누적합 초기화
		int count = 0;				//갯수 초기화
		while(num != -1) {
			sum += num;	//누적합 계산 sum. sum = sum + num;
			count++; 	//갯수 카운팅 count
			num = scan.nextInt();	//정수 1개 입력
		}
		if(count ==0) {System.out.println("평균계산불가");}
		else {
			double average = (double)sum / count; //sum이 큰형님인 더블이라서 count는 자동 형변환으로 double이 됨.
			System.out.print("갯수는 " + count + "이며, ");
			System.out.print("평균은 " + average + "입니다.");
		}
		
		//합산할 때 자료형 맞춰주는 게 좋음. 컴퓨터는 정수와 실수를 계산할 때 복잡한 연산처리를 하기 때문.
		
//		int sum = 0;
//		int count = 0;
//		double avr;
//		int num = scan.nextInt();
//		
//		while(num != -1) {
//			sum += num;
//			count ++;
////			count = count+1;
//			//count = count++; 에서 count가 0이 계속 나오는 이유:
//			//count(저장공간)에 count++을 계산하면 후위계산이기 때문에 대입을 먼저 하니까 현 count값 0이
			//count(저장공간)에 저장되고, 대입 후 기존 count에서 ++된 1값은 대기중. 
			//그러다가 while조건문으로 루프되면 기존에서 +1된 1값은 날라감.
//			num = scan.nextInt();
//			System.out.println(count);
//		}
//		
//		avr = sum / (double) count;
//		System.out.println(count);
//		System.out.println("정수의 개수는 " + count +"이며 평균은 "+ avr + "입니다.");
		
	}

}
