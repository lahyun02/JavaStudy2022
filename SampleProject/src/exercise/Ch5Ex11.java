package exercise;

import java.util.Scanner;

//추상클래스 정의 
abstract class Calc {
	protected int a, b;
	void setValue(int a, int b) { this.a = a; this.b = b; }
	abstract int calculate();
}

class Add2 extends Calc {
	@Override
	int calculate() { return super.a + super.b; }
}

class Sub2 extends Calc {
	@Override
	int calculate() { return super.a - super.b; }
}

class Mul2 extends Calc {
	@Override
	int calculate() { return super.a * super.b; }
}

class Div2 extends Calc {
	@Override
	int calculate() {
		int result = 0;
		try {
			result = super.a / super.b; 
		}
		catch(ArithmeticException e) { 
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		finally { return result; }
	};
}

public class Ch5Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char operator = scan.next().charAt(0); 
		
		switch(operator) {
		case'+': 
			Add2 add = new Add2();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
			break;
		
		case'-': 
			Sub2 sub = new Sub2();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
			break;
		
		case '*': 
			Mul2 mul = new Mul2();
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
			break;
		
		case '/':
			Div2 div = new Div2();
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
