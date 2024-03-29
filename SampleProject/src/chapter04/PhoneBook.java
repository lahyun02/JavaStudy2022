package chapter04;

import java.util.Scanner;

class Phone{
	//속성
	private String name;
	private String tel;
	//생성자
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	//getters & setters
	//get 속성정보를 얻어오는 것 set 속성 정보를 세팅함
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", tel=" + tel + "]";
	}
	
	
	
}

// 인원수를 받고, 인원수만큼 배열을 만들어 초기화합니다.
// 인원수만큼 이름과 전화번호를 입력받아 생성하고 값을 초기화합니다.
// 입력이 끝나면 "저장되었습니다"라고 출력합니다. 그 후,
// 검색할 이름을 입력받습니다.
// 검색어가 있다면 전화번호를 출력하고, 없다면 "없습니다"라고 출력합니다.
// 검색은 사용자가 검색어에 "그만"이라고 입력할 때까지 반복합니다. 

public class PhoneBook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수 >>> ");
		int num = scan.nextInt();
		Phone ph[] = new Phone[num];
		
		for(int i=0; i < ph.length; i++) {
			System.out.print("이름과 전화번호(,없이) >>> ");
			String name = scan.next();
			String tel = scan.next();
			ph[i] = new Phone(name,tel);
		}
		
		System.out.println("저장되었습니다.");
		
		while(true) {
			boolean success = false;
			System.out.print("전화번호를 검색할 성함을 입력하세요(종료:그만) >>> ");
			String search = scan.next();
			
			if(search.equals("그만")) {
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				for(int i=0; i < ph.length; i++) {
					if(search.equals(ph[i].getName())) {
						System.out.println("전화번호: " + ph[i].getTel());
						success = true;
						break;
					}
				}
				if(success == false) {
					System.out.println("없습니다.");
				}
			}
		}
		
		
//		for(Phone p : ph) p.toString();
		
//		System.out.print("검색할 이름 >>> ");
//		String search = scan.next();
//		if(search.equals(ph.getName()))
//			System.out.println(ph.getTel());
//		else
//			System.out.println("검색어가 없습니다.");

	}

}
