package exercise;

public class Ch3Ex9 {

	public static void main(String[] args) {
		int [][] array = new int[4][4];
		
		for(int i=0; i<array.length; i++) {				  //행
			for(int j=0; j<array[i].length; j++) {		  //열
//				int num = (int) (Math.random()*10) + 1;	  //각 열에 들어갈 랜덤값을 넣는다.
//				System.out.print(num + " ");
				array [i][j] = (int) (Math.random()*10) + 1;
				System.out.print(array[i][j] + "\t"); 
			}
			System.out.println();						  //한 행을 찍고 아래로 한 줄
		}
		
	
		
	}

}
