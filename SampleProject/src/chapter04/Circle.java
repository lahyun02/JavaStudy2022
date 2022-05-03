package chapter04;

public class Circle {
	//속성
	public double radius; 	//원의 반지름
	public String name;	//원의 이름
	
//	//생성자 메소드 오버로딩 (생성만 하는 메소드)
	public Circle(){}	//기본 생성자
	public Circle(double radius, String name) {
		this.radius = radius;
		this.name = name;
		System.out.println(this.name + ": "+ this.getArea());
	}
	
	//일반 메소드 (여러가지 일을 하는 메소드)
	public double getArea(){
		return 3.14 * radius * radius;
	} 
	//참고: 아무것도 기입하지 않는 메소드: 추상메소드
	
	
	//main 메소드
	public static void main(String[] args) {
//		Circle pizza;			//1. 객체선언
//		pizza = new Circle(); 	//2. 객체생성(메모리에 공간할당)후 레퍼런스(공간을 가리킴)하도록 함. 
		
		Circle pizza = new Circle(10.0, "콤비네이션피자"); // 객체선언, 객체생성(메모리에 공간할당)후 레퍼런스(공간을 가리킴)하도록 함. 
		Circle coin = new Circle(); // 객체선언, 객체생성(메모리에 공간할당)후 레퍼런스(공간을 가리킴)하도록 함. \
		coin.radius = 5.0;
		coin.name = "500원 동전";
		System.out.println(coin.name + ": "+ coin.getArea());
	}

}
