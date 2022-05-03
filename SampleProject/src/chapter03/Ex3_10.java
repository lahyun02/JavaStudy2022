package chapter03;

public class Ex3_10 {

	public static void main(String[] args) {
		
		int letter_k[][] = {  //K 글자 초기화
				{1, 0, 0, 0, 1, 1},
				{1, 0, 0, 1, 0, 0},
				{1, 1, 1, 0, 0, 0}, 
				{1, 1, 1, 0, 0, 0},
				{1, 0, 0, 1, 0, 0},
				{1, 0, 0, 0, 1, 1}
		};		
		
		for(int row [] : letter_k) {
			for(int col : row) {
				if(col == 1)
					System.out.print("■");
			 	else 
				System.out.print("□");
			
			}
			System.out.println();
		}
		
//		for(int row=0; row<letter_k.length; row++) {
//			for(int col=0; col<letter_k[row].length; col++) {
//				if(letter_k[row][col] == 1)
//					System.out.print("■");
//			 	else 
//				System.out.print("□");
//			
//			}
//			System.out.println();
//		}
		
		
		
				
		
	}

}
