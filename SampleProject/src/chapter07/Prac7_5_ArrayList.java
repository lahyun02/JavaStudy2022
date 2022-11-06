package chapter07;
import java.util.*;

class Student {
	String name;		// 이름 
	String dpt;			// 학과 
	int stuNum;			// 학번 
	double avg;			// 학점 평균 
	
	// 생성자 
	public Student(String name, String dpt, int stuNum, double avg) {
		this.name = name;
		this.dpt = dpt;
		this.stuNum = stuNum;
		this.avg = avg;
	}
	// 학생 정보 출력 
	public void show() {
		System.out.println("------------------------");
		System.out.println("이름: " + this.name);
		System.out.println("학과: " + this.dpt);
		System.out.println("학번: " + this.stuNum);
		System.out.println("평균: " + this.avg);
	}
	
}

public class Prac7_5_ArrayList {
	// 입력한 학생 정보 출력 
	public static void print(ArrayList<Student> s) {
		Iterator<Student> it = s.iterator();
		while(it.hasNext()) {
			it.next().show();
		}
	}
	// ArrayList에 저장된 객체 중 학생이름을 찾아서 해당 학생의 정보 출력 
	public static void checkNshow(ArrayList<Student> s, String name) {
		// s의 요소 순차 검색 
		Iterator<Student> it = s.iterator();
		while(it.hasNext()) {
			Student n = it.next();
			if(n.name.contains(name)) {
				System.out.println(n.name + ", " + n.dpt + ", " + n.stuNum + ", " + n.avg);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		// Student객체를 생성한 후 입력값을 ArrayList에 저장하기 
		ArrayList<Student> al = new ArrayList<Student>();
		
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String info = scan.nextLine();
			StringTokenizer st = new StringTokenizer(info, ", ");
			while(st.hasMoreTokens()) {
				String name = st.nextToken().trim();
				String dpt = st.nextToken().trim();
				int stuNum = Integer.parseInt(st.nextToken().trim());
				double avg = Double.parseDouble(st.nextToken().trim());
				al.add(new Student(name, dpt, stuNum, avg));
			}
		}
		
		
		print(al); 				// 입력한 학생 정보 출력 
		System.out.println("------------------------");
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scan.next();
			checkNshow(al, name);		// 학생이름을 검색해서 해당 학생의 정보 출력 
			if(name.equals("그만")) break;
		}
		
		scan.close();
	}
}

