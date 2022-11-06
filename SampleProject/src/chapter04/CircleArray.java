package chapter04;

public class CircleArray {
	public static void main(String[] args) {
		Circle0[] c;
		c = new Circle0[5];
		for(int i = 0; i<c.length; i++) 
			c[i] = new Circle0(i);	//초기화
		
		for(Circle0 cc : c)
			System.out.println(cc.getArea());
	}
}

class Circle0{
	//필드
	double radius;
	
	//생성자 메소드 public을 달아줘도 되고 안달아줘도 됨. 기본적으로 같은 패키지 안에서 접근 가능. 
	Circle0(double radius) {
		this.radius = radius;
	}
	
	//일반메소드
	double getArea() {
		return 3.14 * radius * radius;
	}
	 
	
}