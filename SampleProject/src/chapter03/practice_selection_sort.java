package chapter03;

public class practice_selection_sort {

	public static void main(String[] args) {
		
		int iu[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		System.out.println("정렬 전 : ");
		for(int n : iu) System.out.printf("%5d", n);
		System.out.println();
		
		//3. 끝까지 찾기
		for(int x = 0; x <8; x++) {
			//1. 최솟값 찾기
			int min_index = x;
			for (int i = x+1; i < 8; i++) {
				if(iu[min_index]>iu[i]) 
					min_index=i;
			}
		
			//2. 정렬하기
			int temp = iu[min_index];
			iu[min_index] = iu[x];
			iu[x] = temp;
		
		}
		
		System.out.println("정렬 전 : ");
		for(int n : iu) System.out.printf("%5d", n);
		System.out.println();
			
			
//			//1,2단계
//			
//			//3. 끝까지 찾기
//			//1. 최솟값 찾기
//			int min_index = 0;
//			for (int i = 1; i < 8; i++) {
//				if(iu[min_index]>iu[i]) 
//					min_index=i;
//			}
//		
//			//2. 정렬하기
//			int temp = iu[min_index];
//			iu[min_index] = iu[i];
//			iu[0] = temp;
//			
	}

}
