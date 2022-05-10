package chapter06;

import java.util.Calendar;
import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
		// 1~45사이의 숫자를 7개 랜덤 생성하기
		int lotto[] = new int[7];
		Random rd = new Random();
		Calendar now = Calendar.getInstance();
		
		//중복을 체크해서 프로그램을 리모델링해주세요.
		for(int i=0; i<lotto.length; i++) {
			//lotto[i] = (int)(Math.random()*45 +1);
			lotto[i] = rd.nextInt(44)+1; 			// (0~44) + 1
			for(int j=0; j<i;j++) {
				if(lotto[i]== lotto[j] ) {i--;}
			}
		}
		
		for(int lo :lotto) System.out.print(lo + " ");
		System.out.println();
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		now.set(2020, 2, 20);
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
	}

}
