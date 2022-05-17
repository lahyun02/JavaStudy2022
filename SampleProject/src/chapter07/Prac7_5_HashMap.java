package chapter07;
import java.util.*;


public class Prac7_5_HashMap {
	// 학생 정보 출력하기 
	public static void show(HashMap<String, Student> hm) {
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Student s = hm.get(name);
			System.out.println("------------------------");
			System.out.println("이름: " + s.name);
			System.out.println("학과: " + s.dpt);
			System.out.println("학번: " + s.stuNum);
			System.out.println("평균: " + s.avg);
		}
	}
	// 학생이름을 검색해서 해당 학생의 정보 출력 
	public static String search(HashMap<String, Student> hm, String name) {
		Student s = hm.get(name);
		return s.name + ", " + s.dpt + ", " + s.stuNum + ", " + s.avg;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		// Student객체를 생성한 후 입력값을 HashMap에 저장하기  
		HashMap<String, Student> hm = new HashMap<String, Student>();
		
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String info = scan.nextLine();
			StringTokenizer st = new StringTokenizer(info, ", ");
			while(st.hasMoreTokens()) {
				String name = st.nextToken();
				String dpt = st.nextToken();
				int stuNum = Integer.parseInt(st.nextToken());
				double avg = Double.parseDouble(st.nextToken());
				Student s = new Student(name, dpt, stuNum, avg);
				hm.put(name, s);
			}
		}
		show(hm); 		// 학생 정보 출력하기 
		System.out.println("------------------------");
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scan.next();
			if(name.equals("그만")) break;
			System.out.println(search(hm, name));		// 학생이름을 검색해서 해당 학생의 정보 출력 
		}
		
		scan.close();
	}
}

