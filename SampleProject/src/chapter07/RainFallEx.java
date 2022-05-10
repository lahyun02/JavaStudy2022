package chapter07;

import java.util.*;

public class RainFallEx {
	// Vector를 받아서 출력하는 메소드 
	public static void print(Vector<Integer> v) {
//		for(int i=0; i<v.size();i++)
//			System.out.print(v.get(i) + " ");
//			System.out.println();
		
//		for(Integer i : v) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) 
			System.out.print( it.next() + " ");
		System.out.println();
	}
		
	// Vector를 받아서 평균을 정수로 반환하는 메소드
	public static int average(Vector<Integer> v) {
//		int sum=0;
//		for(int i=0; i<v.size(); i++) {
//			sum += v.get(i);
//		}
//		return sum / v.size();
		
		Iterator<Integer> it = v.iterator();
		int sum = 0, cnt = 0;
		while(it.hasNext()) {
			sum += it.next();
			cnt++;
		}
		return sum/cnt;
	}
	
	// 0을 입력할 때까지 강수량과 평균을 출력하는 시나리오
	public static void main(String[] args) {
		//1. 필요한 객체를 선언한다.
		Scanner scan = new Scanner(System.in);
		Vector<Integer> vec = new Vector<>();
		
		//2. 0을 입력할 때까지 강수량목록(print)과 평균(average)을 출력한다.
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료) >> ");
			int num = scan.nextInt();
			if(num == 0) break;
			else 		 vec.add(num);
			print(vec);
			System.out.println("강수 평균 : " + average(vec));
		}
	}
}
