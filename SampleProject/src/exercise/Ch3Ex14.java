package exercise;

import java.util.Scanner;

public class Ch3Ex14 {

	public static void main(String[] args) {
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner scan = new Scanner(System.in);
		int s = 0;
		boolean flag = false;
		while(true) {
			System.out.print("과목이름 >> ");
			String msg = scan.next();
			
			if(msg.equals("그만")) break;
			
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(msg)) {		// msg와 course[i]가 같으면 
					s = score[i];	// scroe의 i번째를 n에 대입함.
					flag = true;	// flag를 true로 설정. 만약 msg와 course[i]가 같지 않으면 flag는 먼저 선언한대로 false가 됨.
					break;			// 자원을 아끼기 위해서 사용. 확인이 된 후 더이상 나머지를 굳이 검사하지 않아도 됨.	 
				}
			}
			
			if(flag) { System.out.print("점수 : " + s); System.out.println(); }
			else	   System.out.println("없는 과목입니다.");
			
			//다른 방법
//			i를 외부에 선언한 후
//			if(i == course.length) System.out.println("없는 과목입니다."); 
			
		}
		
		System.exit(1);
		scan.close();
	}

}
