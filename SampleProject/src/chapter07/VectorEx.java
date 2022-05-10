package chapter07;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		var v = new Vector<Integer>();
		
		v.add(5); 		//자동 박싱 
		v.add(4);
		v.add(-1);
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) 
			System.out.println(it.next());
		
		
		
//		System.out.println(v);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		System.out.println(v.get(0));
//		System.out.println(v);
//		v.remove(0);
//		System.out.println(v);
//		v.removeAllElements();
//		System.out.println(v);
//		System.out.println(v.capacity());
		
//		v.clear();
//		System.out.println(v);
//		System.out.println(v.capacity());
		
		

	}

}
