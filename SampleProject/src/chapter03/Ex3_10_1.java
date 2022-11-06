package chapter03;

public class Ex3_10_1 {

	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},	//1학년 (1학기, 2학기)
							{3.5, 3.6},	//2학년 (1학기, 2학기)
							{3.7, 4.0}, //3학년 (1학기, 2학기)
							{4.1, 4.2}}; //4학년 (1학기, 2학기)
		double sum = 0.0;
		
		for(double[] grade : score) {
			for(double semester : grade) {
				sum += semester;
			}
		}
		
		
		double grade_cnt = score.length;	//행 길이 (학년 수)
		double semester_cnt = score[0].length;	//열 길이 (학기 수)
		
		double avr = sum / (grade_cnt*semester_cnt);
		
		System.out.println("합계는 " + sum + ", " + "평균은 " + avr + "입니다.");
	}

}
