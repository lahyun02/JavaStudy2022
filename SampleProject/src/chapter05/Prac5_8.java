package chapter05;

class PositivePoint extends PointNew {
	PositivePoint() {};
	PositivePoint(int x, int y) {
		super(x, y);
		if(x > 0 && y > 0) {
			super.move(x, y);
		} else {
			super.move(0, 0);
		}
	}
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}
	
	@Override
	protected void move(int x, int y) { 	
		if(x > 0 && y > 0) {				// 양수일때만 이동. 
			super.move(x, y);
		}
	}
}

public class Prac5_8 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}
