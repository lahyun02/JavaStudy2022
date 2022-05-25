package chapter08;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Person {
	private String name;		// 이름
	private String gender;		// 성별
	private int weight;			// 몸무게
	private int height;			// 키
	
	// getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", weight=" + weight + ", height=" + height;
	}
}

public class CSV_Parsing {

	public static void main(String[] args) {
		BufferedReader reader = null;		
		BufferedWriter writer = null;
		
		// Person 객체를 담을 컬렉션 ArrayList 선언 및 생성
		ArrayList<Person> list = new ArrayList<>(); // try문 밖에서도 쓰려면 try문 안에 있으면 안됨.
		// Person 객체 선언 
		Person p;
		
		int sum = 0;		// 남자 몸무게 합계
		int manNum = 0;		// 남자 인원수
		int i = 0;			// list의 요소들 검색할때 인덱스
		
		try {
			// 파일 읽기
			reader = new BufferedReader(new FileReader(new File("d:\\sample2.csv")));
			// 파일 쓰기
			writer = new BufferedWriter(new FileWriter("d:\\csv_parsing.txt"));
			
			reader.readLine(); // 한줄 라인은 필요없으니까 날려버림.
			
			String msg; 	 // 한줄 라인을 담을 문자열 선언
			while((msg=reader.readLine()) != null) {		// 문자열 라인이 null이 아닐 동안(있는 동안)
//				System.out.println(msg); 
				StringTokenizer st = new StringTokenizer(msg, ",");		// msg를 ,로 분리
				p = new Person();								// Person 객체 선언 및 생성
				p.setName(st.nextToken().trim());
				p.setGender(st.nextToken().trim());
				p.setWeight(Integer.parseInt(st.nextToken().trim())); 
				p.setHeight(Integer.parseInt(st.nextToken().trim())); 
				list.add(p);											// list에 추가
			}
			for(i=0; i<list.size(); i++) {								// list의 크기만큼 검색 
				if(list.get(i).getGender().equals("남")) {				// 성별이 남자일경우
					sum += list.get(i).getWeight();						// 몸무게 합하기
					manNum++;											// 남자인원수 더하기
				}
			}
			String s = "총 "+ manNum + "명의 남자들의 평균 몸무게는 " + (double) sum/manNum + "입니다.";
//			System.out.println(s);
			writer.write(s);		// 파일에 문자열 s 쓰기
			reader.close();
			writer.close();
		}
		catch(IOException e) {e.printStackTrace();}
	}

}
