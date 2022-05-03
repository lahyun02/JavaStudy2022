package chapter03;

public class Prac3_10 {

	public static void main(String[] args) {
		int array [][] = new int [4][4];
		//1. for문
		for(int i=0; i<10; i++) {							// 정수 10개 생성 (반복)
			int a = (int)(Math.random()*array.length);		// 배열의 요소들을 랜덤한 위치에 지정  
			int b = (int)(Math.random()*array[0].length);	
			if(array[a][b] == 0) {							// 랜덤한 위치에 넣으려는 배열의 요소가 0일 경우
				array[a][b] = (int)(Math.random()*10+1);		// 랜덤인 수를 그 랜덤한 위치에 저장 
			} 
			else {											// 랜덤한 위치에 넣으려는 배열의 요소가 0이 아니라면
				i--;										// 다시 같은 회차 반복으로 돌아가서 for문의 실행문 반복
			}
		}

		// 배열 array 출력 
		for(int x[] : array) {
			for(int y : x)
				System.out.printf("%5d", y);
			System.out.println();
		}
		
		
		System.out.println("======for-each문 초기화 시도==========");
		//배열 초기화 (for-each)
		for(int x[] : array) {
			for(int y : x) {
				y = 0;
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println("======for-each문 출력 (초기화 안되있음)==========");
		//배열 초기화 시도..그러나 (for-each)---> for-each문은 초기화 안됨!!!
		for(int x[] : array) {
			for(int y : x) {
				System.out.print(y);
			}
			System.out.println();
		}

		System.out.println("========배열 초기화(for문)========");
		//배열 초기화 (for문)
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				System.out.print(array[i][j]=0);
			}
			System.out.println();
		}
				
				
				
		//2. while문 
		int n = 0;
		while(true) {
			
			int a = (int)(Math.random()*array.length);
			int b = (int)(Math.random()*array[0].length);
			if(array[a][b] == 0) {							// 랜덤한 위치에 넣으려는 배열의 요소가 0일 경우
				array[a][b] = (int)(Math.random()*10+1);		// 랜덤인 수를 그 랜덤한 위치에 저장 
				n++;
			} 
			if(n == 10) {
				break;
			}
		}
		
		// 배열 array 출력 
				for(int x[] : array) {
					for(int y : x)
						System.out.printf("%5d", y);
					System.out.println();
				}
				
		System.out.println("========배열 초기화(for문)========");
		//배열 초기화 (for문)
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				System.out.print(array[i][j]=0);
			}
			System.out.println();
		}
		
		//3. while문2 
		n = 0;
		while(n<10) {
			int a = (int)(Math.random()*array.length);
			int b = (int)(Math.random()*array[0].length);
			if(array[a][b] == 0) {							// 랜덤한 위치에 넣으려는 배열의 요소가 0일 경우
				array[a][b] = (int)(Math.random()*10+1);		// 랜덤인 수를 그 랜덤한 위치에 저장 
				n++;
			}
		}
		
		// 배열 array 출력 
				for(int x[] : array) {
					for(int y : x)
						System.out.printf("%5d", y);
					System.out.println();
				}		
		


	}
}
