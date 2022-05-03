package chapter04;

import java.util.Scanner;

//원화 변환 클래스
class CurrencyConverter {
	//속성
	private static double rate;		//클래스 변수
	//메소드 (기능)/ 어떤 목적으로 이 메소드를 만들 것인가. 입력값은 뭘 줄 건가 부터 생각. (메소드의 프로토콜)
	public static void setRate(double r) {rate = r;}
	public static double getRate() {return rate;}
	public static double toDollor(double won) 
	{return won / rate;}
	public static double toKWR(double dollar) 
	{return dollar * rate;}
	
}

public class StaticMember {
	public static void main(String[] args) {
		//로직 작성
		Scanner scan = new Scanner(System.in);
		//1. 원화를 입력받는다. 
		System.out.print("환율(1달러) >>> ");
		double rate = scan.nextDouble();
		CurrencyConverter.setRate(rate);
		
		System.out.println("백만원은 달러로 " + CurrencyConverter.toDollor(1000000.0));
		System.out.println("백달러는 원화로 " + CurrencyConverter.toKWR(100.0));
		Math.random();
	}
}



