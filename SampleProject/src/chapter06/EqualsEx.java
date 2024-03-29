package chapter06;

class Rect{
	int width;
	int height;
	Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	@Override
	public boolean equals(Object obj) {
		Rect r = (Rect)obj;
		if(r.width*r.height == width*height) 
			return true;
		else 
			return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Rect r1 = new Rect(2, 3);
		Rect r2 = new Rect(3, 2);
		System.out.println(r1.equals(r2));
		
	}
}
