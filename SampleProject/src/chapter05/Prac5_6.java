package chapter05;

class ColorPointThree extends PointNew {
	private String color;
	ColorPointThree() {
		super(0,0);
		this.color = "BLACK";
	}
	
	ColorPointThree(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	
	void setXY(int x, int y) {
		super.move(x, y);
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
	
	
}

public class Prac5_6 {

	public static void main(String[] args) {
		ColorPointThree zeroPoint = new ColorPointThree();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPointThree cp = new ColorPointThree(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}
