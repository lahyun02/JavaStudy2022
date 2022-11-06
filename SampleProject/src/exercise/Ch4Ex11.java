package exercise;

import java.util.Scanner;

class Add {
	private int a, b;
	void setValue(int a, int b) { this.a = a; this.b = b; };
	int calculate() { return this.a + this.b; };
}

class Sub {
	private int a, b;
	void setValue(int a, int b) { this.a = a; this.b = b; };
	int calculate() { return this.a - this.b; };
}

class Mul {
	private int a, b;
	void setValue(int a, int b) { this.a = a; this.b = b; };
	int calculate() { return this.a * this.b; };
}

class Div {
	int a, b;
	void setValue(int a, int b) { this.a = a; this.b = b; };
	int calculate() {
		int result = 0;
		try {
			result = this.a / this.b; 
		}
		catch(ArithmeticException e) { 
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		finally { return result; }
	};
}

public class Ch4Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char operator = scan.next().charAt(0); 
		
		switch(operator) {
		case'+': 
			Add add = new Add();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
			break;
		
		case'-': 
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
			break;
		
		case '*': 
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
			break;
		
		case '/':
			Div div = new Div();
			div.setValue(num1, num2);
			System.out.println(div.calculate()); 
			break;
		default :
			System.out.println("잘못된 연산자입니다.");
			break;
		}
		
		scan.close();
	}

}
