package chapter05;

class Shape{
	public void draw() {System.out.println("Shape");}
}
class Line extends Shape{
	@Override
	public void draw() {System.out.println("Line");}
}
class Rect extends Shape{
	@Override
	public void draw() {System.out.println("Rect");}
}
class Circle extends Shape{
	@Override
	public void draw() {System.out.println("Circle");}
}


public class MethodOverridingEx {
	static void paint(Shape p) {p.draw();} 	//static안엔 static만 쓸 수 있다.
	

	public static void main(String[] args) {
		//같은 클래스 내라서 객체를 안만들어주고 사용 가능.
		//업캐스팅 시-> p.draw()에서 부모가 아닌 자식걸로 사용함.
		paint(new Line()); 	//공간을 형성해서 p가 가리키게 만듦.
		paint(new Rect());
		paint(new Circle());
	}

}
