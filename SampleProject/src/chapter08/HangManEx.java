package chapter08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

class HangMan {
	String oneWord = null;
	int cnt = 0;
	int index1 = 0;
	int index2 = 0;
	char ans1 = ' ';
	char ans2 = ' ';
	char[] ca;
	boolean check1 = false;
	boolean check2 = false;
	
	// 단어 출력 - 2자리 수 -로 대체 
	char[] word(Vector<String> v) {
		// 단어-랜덤 수  
		int random = (int)(Math.random()*25143+1);
		
		// 영어단어 하나 선택 해서 소문자로 변경  
		oneWord = v.get(random).toLowerCase();
		
		// 4글자 이상의 단어 선택 
		if(oneWord.length() < 4) {
			random = (int)(Math.random()*25143+1);
			oneWord = v.get(random).toLowerCase();
		}
		
		System.out.println(oneWord);
		
		// 랜덤 글자 1
		index1 = (int)(Math.random()*oneWord.length());
//		// 랜덤 글자 2
		index2 = (int)(Math.random()*oneWord.length());
		// length()는 글자 전체 숫자이고, index는 0부터 시작하므로, length()자체에 인덱스+1이 된 것이기 때문에 random에 +1을 하지 않아도 된다. 
		
		// '-'가 중복되지 않도록 검사 
		for(int i=0; i<2; i++) {
			if(index1 == index2) { 
				index2 = (int)(Math.random()*oneWord.length());
				i--;
			}
		}
		ca = oneWord.toCharArray();
		
		ans1 = ca[index1];
		ca[index1] = '-';
		
		ans2 = ca[index2];
		ca[index2] = '-';
		
		return ca;
	}
	
	// 단어 글자 맞추기 입력 - 검사
	void checkBox(char c) {
//		Scanner scan = new Scanner(System.in); 
//		System.out.print(">> ");
//		char c1 = scan.next().charAt(0);
		cnt++;
		// 다음 검색에서 ans1은 제외하기 
		if(check1 == false && c == ans1 ) { 
			cnt = 0; 
			check1 = true;
			ca[index1] = ans1; 
			System.out.println(ca);
		}
		else if( check2 == false && c == ans2) { 
			cnt = 0; 
			check2 = true; 
			ca[index2] = ans2;
			System.out.println(ca); 
		}
	} 
	
	void question() {

		
	}
	
	
}


public class HangManEx {

	public static void main(String[] args) {
		Scanner scan = null;
		Vector<String> wordVector = new Vector<String>();
		try {
			scan =  new Scanner(new FileReader("/Users/lahyun/lani/study/coding/java-study/words.txt"));
			while(scan.hasNext()) {
				String word = scan.nextLine();
				wordVector.add(word); 
			}
			
		}
		catch(IOException e) {e.printStackTrace();}
//		scan = new Scanner(System.in);
		System.out.println("지금부터 행맨 게임을 시작합니다. ");
		
		HangMan hm = new HangMan();
		
		scan = new Scanner(System.in); 
		boolean flag = true;
		while(flag) {
		System.out.println(hm.word(wordVector));
		while(true) { 	
			System.out.print(">> ");
			char c = scan.next().charAt(0);
			hm.checkBox(c);
//			System.out.println(hm.cnt);
			
			// 5번 안에 정답을 맞출 경우 
			if(hm.cnt < 6 && (hm.check1 == true && hm.check2 == true) ) { 
				System.out.println( "정답을 맞히셨습니다! "); 
				System.out.println("정답 : " + hm.oneWord); 
				System.out.print("Next(y/n)? "); 
				String next = scan.next();
				if(next.equals("y")) { 
					hm.cnt = 0; 
					hm.check1 = false; 
					hm.check2 = false; 
					break; 
				}
				else if(next.equals("n")) {  flag = false; break;} 
				break; 
			}
		
			// 5번 이상 오답인 경우  
			if(hm.cnt >= 5 && (hm.check1 == false || hm.check2 == false) ) { 
				System.out.println("5번 실패하였습니다. "); 
				System.out.println("정답 : " + hm.oneWord); 
				System.out.print("Next(y/n)? "); 
				String next = scan.next();
				if(next.equals("y")) { 
					hm.cnt = 0; 
					hm.check1 = false; 
					hm.check2 = false; 
					break; 
				}
				else if(next.equals("n")) {  flag = false; break;} 
			}
		}
		}
		
	}

}
