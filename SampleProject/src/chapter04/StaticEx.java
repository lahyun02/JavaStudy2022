package chapter04;

class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		int size = a.length + b.length;		// 새로운 배열의 크기  
		int temp[] = new int[size];			// 새로운 배열 생성 

		for(int i=0; i<a.length; i++) {		// a 배열 요소로 초기화 
			temp[i] = a[i];					// a 배열의 크기만큼 초기화 
		}
		int j = 0;							// b 배열 0번째 순서부터 
		for(int i=a.length; i<size; i++) {	// a 배열 크기부터 시작 ~ 새 배열의 크기 전까지 
			temp[i] = b[j];					// b 배열 요소로 초기화 
			j++;							// j 1씩 증가 
		}
		return temp;						// temp 배열 리턴 
	}

	public static void print(int[] a) {
		System.out.print("[ ");
		for(int i : a) 						// a 배열 출력 
			System.out.print(i + " ");
		System.out.println("]");
	}
}

public class StaticEx {

	public static void main(String[] args) {
		int [] array1 = { 1, 5, 7, 9};
		int [] array2 = { 3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
