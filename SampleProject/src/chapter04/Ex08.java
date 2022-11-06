package chapter04;

public class Ex08 {
	
	// replaceSpace : char배열을 받아 공백을 콤마로 교체하는 메소드
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++)
			if(a[i] == ' ') a[i] = ',';
	}
	
	// printCharArray : char배열을 받아 배열안에 문자들을 화면에 출력하는 메소드
	static void printCharArray(char a[]) {		//두 메소드는 독립적. 지역변수:a[]-> 이 메소드 안에서 지역변수로 쓰임
//		for(int i=0; i<a.length; i++)
//			System.out.println(a[i]);
		for(char c : a) System.out.print(c);
		System.out.println();
			
	}
	//기능을 명확히 써놓고 다른 곳에서도 기능적으로 사용할 수 있어야함.
	
	public static void main(String[] args) {
		char a[] = {'I', ' ', 'L', 'O','V', 'E', ' ', 'Y', 'O', 'U', '.' };
		printCharArray(a);
		replaceSpace(a);
		printCharArray(a);
	}

}
