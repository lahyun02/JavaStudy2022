package chapter06;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); 	// a
		
		char c1='4', c2='F';
		if(Character.isDigit(c1)) System.out.println(c1 + "는 숫자");		// true
		if(Character.isAlphabetic(c2)) System.out.println(c2 + "는 영문자");	// true
		
		System.out.println(Integer.parseInt("-123"));	// -123
		System.out.println(Integer.toHexString(28));	// 1c
		System.out.println(Integer.toBinaryString(28));	// 11100
		System.out.println(Integer.bitCount(28));		// 3 - 28에 대한 2진수의 1의 개수
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());	// 3.14
		System.out.println(Double.parseDouble("3.14"));		//3.14
		
		boolean b = (4>3);	//b는 true
		System.out.println(Boolean.toString(b));	// true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false"));	// 문자열을 false로 변환 
		
		System.out.println(Integer.toHexString(c2));
		System.out.println(Integer.toOctalString(c2));
	}

}
