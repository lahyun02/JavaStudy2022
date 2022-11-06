package chapter07;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		//1. 객체선언
		Scanner scan = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		//2. 이름을 입력받아 ArrayList에 add한다. 
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력해주세요 >> ");
			al.add(scan.next());
		}
		//3. ArrayList에 입력된 이름을 출력한다.
		//3-1. for문을 활용
//		for(int i=0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		//3-2. Iterator를 활용
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//3-3. for-each 문을 활용 
//		for(String name : al) System.out.println(name);
		
		//4. ArrayList에 입력된 이름 중 가장 긴 이름을 찾아 출력한다.
		//가정, 반복, 비교, 대입 
//		int long_string = al.get(0).length();
//		int long_index = 0;
//		for(int i=1; i<al.size(); i++) {
//			if(long_string < al.get(i).length()) 
//				long_index = i;
//		}
//		System.out.println("가장 긴 이름은 >> " + al.get(long_index));
		
		int max = 0;
		int max_index = 0;
		for(int i=0; i<al.size(); i++) {
			String name = al.get(i);
//			max = name.length();  			
			// for문을 반복할 동안 max와 i번째 이름의 길이를 비교하기도 전에 max에 무조건 i번째 이름의 길이를 대입하니까 
			// if문의 조건식은 항상 false가 돼서 max_index의 값은 항상 0이 된다...
			if(max < name.length()) {
				max = name.length();
				max_index = i;
			}
		}
		System.out.println("가장 긴 이름의 길이는 " + max);
		System.out.println("가장 긴 이름은 " + al.get(max_index));
	}

}
