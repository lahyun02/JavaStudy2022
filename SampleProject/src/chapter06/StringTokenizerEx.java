package chapter06;

import java.util.StringTokenizer;

class Person {
	String name;
	String gender;
	int weight;
	int height;
	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", weight=" + weight + ", height=" + height;
	}
}

public class StringTokenizerEx {

	public static void main(String[] args) {
		// 남자의 평균체중을 구하라. 
		String query = "김명수, 남, 77, 167 / 홍길동, 남, 65, 170 / 김새영, 여, 57, 164 / 이장군, 남, 77, 167 / 홍미영, 여, 64, 165";
		StringTokenizer st = new StringTokenizer(query, "/");
		StringTokenizer st1;
		Person[] p = new Person[st.countTokens()];
		
		int i = 0;
		while(st.hasMoreTokens()) {
			st1 = new StringTokenizer(st.nextToken(), ",");
			while(st1.hasMoreTokens()) {
				p[i] = new Person();
				p[i].name = st1.nextToken().trim();
				p[i].gender = st1.nextToken().trim();
				p[i].weight = Integer.parseInt(st1.nextToken().trim());
				p[i].height = Integer.parseInt(st1.nextToken().trim());
				
				System.out.println(p[i].toString());
			}
			i++;
		}
		
		//남자 몸무게 평균 
		//남자 몸무게 합계, 인원수 구하기
		int sum = 0;
		int manNum = 0;
		for(int j=0; j<p.length; j++) {
			if(p[j].gender.equals("남")) {
				sum += p[j].weight;
				manNum++;
			}
		}
		System.out.println(sum);
		System.out.println(manNum);
		System.out.println("남자들의 몸무게 평균은 " + (double)sum / manNum);
	}
}
