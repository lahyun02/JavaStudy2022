package chapter05;

class Point3D extends PointNew {
	private int z;
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// z축으로 위쪽 이동 
	int moveUp() {
		this.z++;
		return z;
	}
	
	// y축으로 아래쪽 이동 
	int moveDown() {
		this.z--;
		return z;
	}
	
	// x축, y축, z축으로 이동 
	protected void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + "," + getZ() + ")의 점";
	}
	
	
	
}

public class Prac5_7 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다. ");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다. ");
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다. ");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다. ");
		
	}

}
