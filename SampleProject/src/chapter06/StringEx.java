package chapter06;

public class StringEx {

	public static void main(String[] args) {
		String str1 = "Hello-Java";
		String str2 = "Hello               ";
		String str3 = str1.concat("Java");
		StringBuffer sb1 = new StringBuffer("ILOVEYOU");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.equals(str2));
		System.out.println(str3.hashCode());
		System.out.println(str1.equals(str3));
		System.out.println(str1.charAt(0)); 	// for문을 이용해 한문자씩 가져올수있음.
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		System.out.println(str1.length());
		System.out.println(str1.replace("ll", "hh"));
		System.out.println(str1.split("-")); // 구분자 - 입력
		System.out.println(str2.trim());
		System.out.println(str1.substring(5, 8));
		System.out.println(sb1.delete(1, 5));
		System.out.println(sb1.reverse());
		
		
		System.out.println("======================");
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "의 길이는 " + a.length());	// 3- 문자열의 길이(문자 개수)
		System.out.println(a.contains("#")); // true- 문자열의 포함 관계
		
		a = a.concat(b); //문자열 연결
		System.out.println(a);
		
		a = a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a);
		
		a = a.replace("C#", "JAVA"); 	// 문자열 대치
		System.out.println(a);
		
		String s[] = a.split(","); 	// 문자열 분리
		for(int i=0; i<s.length; i++)
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴
		System.out.println(a);
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴
		System.out.println(c);
		
	}

}
