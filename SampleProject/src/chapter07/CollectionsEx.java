package chapter07;

import java.util.*;

public class CollectionsEx {
	//todo : 우리가 직접 짜는 이진탐색 메소드 
	static boolean binarySearch(LinkedList<String> my, String key) {
		
		Collections.sort(my);
		int start = 0;
		int end = my.size() - 1;		// 마지막 인덱스 번호는 전체 크기 -1이니까. 0부터 세기 때문.
		int middle;
		int state = 0;
		boolean success = false;
		
		while(start <= end) {
			middle = (start+end) / 2;
//			if(my.get(middle).equals(key)) {
			if(key.compareTo(my.get(middle)) == 0) {
//				state = 1;
				success = true;
				break;
			}
			//todo : 문자비교 (String의 compare 메소드 활용) 
			// 사전적으로 문자가 앞에 있는지 뒤에 있는지 비교. end, start값 
			else if(key.compareTo(my.get(middle)) < 0) // 0보다 작으면 사전에서 더 앞에 있음.
				end = middle - 1;
			else if(key.compareTo(my.get(middle)) > 0)
				start = middle + 1;
			
		}
		
//		if(state == 1)  System.out.println("탐색성공!!!");
//		else   			System.out.println("탐색실패!!!");
		return success;
	}
	
	
	
	
	// todo : LinkedList<String>을 입력받아서 화면에 출력하는 메소드 
	static void printList(LinkedList<String> my) {
		Iterator<String> it = my.iterator();
		while(it.hasNext()) {
			String e = it.next();
			String seperator;
			if(it.hasNext())
				seperator = "-> ";
			else
				seperator = "\n"; 	// 다음줄로 내려옴. escape sequence \b(backspace), \t(tab)
			System.out.print(e + " " + seperator);
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		// 코드가 잘 들어갔는지 중간에 한번씩 확인해보기. (암기!)
		//1. for문 사용
//		for(int i=0; i<myList.size(); i++) 
//			System.out.println(myList.get(i));
		
		//2. for-each문 사용
//		for(String movie : myList) 
//			System.out.println(movie);
		
		//3. iterator 사용
//		Iterator<String> it = myList.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//4. Collections 사용 : 메소드들이 모두 static으로 구성.
//		printList(myList);
//		Collections.sort(myList);
//		printList(myList);
//		Collections.reverse(myList);
//		printList(myList);
//		Collections.sort(myList, Comparator.reverseOrder());
//		printList(myList);
//		
//		int index = Collections.binarySearch(myList, "아바타");
//		System.out.println("아바타는 " + index + "번 인덱스에 있습니다.");
//		
//		binarySearch(myList, "아바타");
//		
//		index = Collections.binarySearch(myList, "가가가");
//		System.out.println("가가가는 " + index + "번 인덱스에 있습니다.");
//		// 특정값이 없어서 탐색이 안되면 인덱스는 -1번이 됨.
//		
//		index = Collections.binarySearch(myList, "스타워즈");
//		System.out.println("스타워즈는 " + index + "번 인덱스에 있습니다.");
		
		printList(myList);
		System.out.print("검색어 >> ");
		String search = scan.next().trim();
		if(binarySearch(myList, search)) System.out.println("탐색성공!!!");
		else 							 System.out.println("탐색실패!!!");
		
	}

}
