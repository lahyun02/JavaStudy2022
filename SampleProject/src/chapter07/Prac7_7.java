package chapter07;

import java.util.*;

public class Prac7_7 {
	public static void main(String[] args) {
		// 이름, 학점 입력받기
		Scanner scan = new Scanner(System.in);
		HashMap<String, Double> hm = new HashMap<String, Double>();
		
		System.out.println("미래장학금관리시스템입니다.");
		
		// 해시맵에 저장
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점>> ");
			String key = scan.next();
//			Double value = Double.parseDouble(scan.next());
			Double value = scan.nextDouble();	scan.nextLine();
			hm.put(key, value);
		}
		
		System.out.print("장학생 선발 학점 기준>> ");
//		Double base = Double.parseDouble(scan.next());
		Double base = scan.nextDouble();	scan.nextLine();
		
		//p414 참조 : 해시맵의 전체 검색
		// todo: 해시맵을 전체 검색하며 value값을 비교해서 base보다 크면 해당되는 key값을 출력한다. 
		System.out.print("장학생 명단 : ");
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String k = it.next();		// 이름
			Double v = hm.get(k);		// 학점 
			if(v >= base)				// 기준보다 학점이 높으면 이름 출력 
				System.out.print(k + " ");
		}
		
		
	}

}
