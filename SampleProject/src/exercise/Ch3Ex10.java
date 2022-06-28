package exercise;

public class Ch3Ex10 {

	public static void main(String[] args) {
		int [][] array = new int[4][4];
		int row, col = 0;
		//배열의 모든 원소를 0으로 초기화 
		for(row=0; row<array.length; row++) {				  //행
			for(col=0; col<array[row].length; col++) {	
				array [row][col] = 0;
			}
		}
		
		//임의의 인덱스 10개에 1~10까지의 임의의 수를 채운다.
		int n = 0;
		while(n < 10) {
			row = (int) (Math.random()*array.length);	//0~3사이의 정수 생성
			col = (int) (Math.random()*array[row].length);	//0~3사이의 정수 생성
			
			if(array[row][col] != 0) continue;		//해당 인덱스에 이미 값이 채워져 있다면
			array[row][col] = (int) (Math.random()*10) + 1;  //1~10 사이의 수를 채운다.
			n++; 
		}
		
		
//		for(int r=0; r<10; r++) {
//			int num = (int) (Math.random()*10) + 1;
//			int i = (int) (Math.random()*array.length);
//			int j = (int) (Math.random()*array[0].length);
//			
//			if(array[i][j] !=0) {
//				array[i][j] = num;
//			}
//		}
		
		
		//화면에 출력한다
		for(row=0; row<array.length; row++) {				  //행
			for(col=0; col<array[row].length; col++) {	
				System.out.print(array[row][col] + "\t"); 
			}
			System.out.println();
		}
		
		

		

		
	}

}
