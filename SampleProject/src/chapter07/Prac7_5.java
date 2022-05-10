package chapter07;
import java.util.*;

class Student {
	String name;
	String dpt;
	int stuNum;
	double avg;
	public Student(String name, String dpt, int stuNum, double avg) {
		this.name = name;
		this.dpt = dpt;
		this.stuNum = stuNum;
		this.avg = avg;
	}
}

public class Prac7_5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		// Student객체를 생성한 후 입력값을 Student의 각 속성필드에 넣기 
		ArrayList<Student> al = new ArrayList<Student>();
		for(int i=0; i<4; i++)
			System.out.println(">> ");
			String info = scan.next();
			StringTokenizer st = new StringTokenizer(info, ",");
			while(st.hasMoreTokens()) {
				
			}
		
	}

}
