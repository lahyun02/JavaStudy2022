package chapter05;

class Point {
	private int x, y;
	public Point() {
		this.x = this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

class ColorPoint extends Point {
	private String color;
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}

}
