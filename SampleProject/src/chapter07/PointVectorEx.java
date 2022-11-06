package chapter07;

import java.util.Iterator;
import java.util.Vector;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point (x=" + x + ", y=" + y + ")";
	}
	
}

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
//		Iterator<Point> it = v.iterator();
		v.add(new Point(1,2));
		v.add(new Point(2, 3));
		v.add(new Point(30, -8));
		// v에 있는 데이터를 하나씩 가져옴. 준비되어있는 자료에 붙여줘야 함. 실시간 처리를 싫어함.
		// iterator를 선언하기 전에 자료를 넣어줘야 함.
		// Vector v와 Interator는 별개. v에 자료가 추가되어도. it와는 별개라 it에는 안들어감.
		Iterator<Point> it = v.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
//		for(int i=0; i < v.size(); i++) {
//			Point p = v.get(i);
//			System.out.println(p);
//		}
			
//		for(Point p : v) 
		
	}

}
