package chapter00;

class Box {
	//필드
	private int width;
	private int length;
	private int height;
	private int volume;
	
	//생성자
	public Box() {}
	
	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	//getVolume
	int getVolume() {
		this.volume = this.width*this.length*this.height;
		return volume;
	}
	
	//toString
	@Override
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", height=" + height + ", volume=" + volume + "]";
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Box box = new Box(3, 4, 5);
		System.out.println(box.getVolume()); 
		System.out.println(box.toString()); 
	}

}
