package chapter05;

class PointNew {
	private int x, y;
	public PointNew() {} 	// 문제 8번을 위해. 
	public PointNew(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPointNew extends PointNew {
	private String color;
	
	public String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}

	ColorPointNew(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setXY(int x, int y) {
		move(x, y);
	}
	

	@Override
	public String toString() {
		return color + "색의 " + "(" + getX() + "," + getY() + ")의 점";
	}
	
}


public class Prac5_5 {
	
	public static void main(String[] args) {
		ColorPointNew cp = new ColorPointNew(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다. ");
	}

}
