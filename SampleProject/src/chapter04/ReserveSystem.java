package chapter04;

import java.util.Scanner;

class Seat {
	private String sType;	// 좌석 타입 
	private String name;	// 예약자 이름 
	private String sState; 	// 좌석 예약 상태 
	private int sNum; 		// 좌석 번호 

	public String getsType() {
		return sType;
	}

	public void setsType(String sType) {
		this.sType = sType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsState() {
		return sState;
	}

	public void setsState(String sState) {
		this.sState = sState;
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	Seat() {		// 생성자 
		this.sState = "---";
	}
}

class Reservation {
	String sType; 	// 좌석 타입 
	String name; 	// 예약자 이름 
	String sState; 	// 좌석 예약 상태 
	int sNum; 		// 좌석 번호 

	// 예약받기 
	int reserve(String name, int sNum, Seat[] s) {
		int num = 0;
		s[sNum-1].setsState(name);
		System.out.println("예약완료되었습니다.");
		num++;
		return num;
	}

//	int reserve(Seat[] s) {
//		int num = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름>> ");
//		String name = sc.next();
//		System.out.print("번호>> ");
//		int sNum = sc.nextInt();
//		s[sNum-1].sState = name;
//		System.out.println("예약완료되었습니다.");
//		
//		num++;
//		return num;
//	}
}

class Check {
	String s, a, b; // s, a, b석 
	String sType; 	// 좌석 타입 
	String name; 	// 예약자 이름 
	String sState; 	// 좌석 예약 상태 
	int sNum; 		// 좌석 번호 

	// 각각의 좌석 조회
	static void show(String sType, Seat[] s) {
		if(sType.equals("1")) {
			System.out.print("S");
		}
		else if(sType.equals("2")) {
			System.out.print("A");
		}
		else if(sType.equals("3")) {
			System.out.print("B");
		}
		System.out.print(">> ");
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i].getsState() + " ");
		}
		System.out.println();
	}
	
	// 전체 좌석 조회 
	static void allShow(Seat[] s, Seat[] a, Seat[] b) {
		for(int j=0; j<3; j++) {
			if(j==0) {
				System.out.print("S>> ");
				for(int i=0; i<s.length; i++) {
					System.out.print(s[i].getsState() + " ");
				}
				System.out.println();
			} 
			else if(j==1) {
				System.out.print("A>> ");
				for(int i=0; i<a.length; i++) {
					System.out.print(a[i].getsState() + " ");
				}
				System.out.println();
			} 
			else if(j==2) {
				System.out.print("B>> ");
				for(int i=0; i<b.length; i++) {
					System.out.print(b[i].getsState() + " ");
				}
				System.out.println();
			} 
		}
	}
}

class Cancellation {
	String sType; 	// 좌석 타입 
	String name; 	// 예약자 이름 
	String sState; 	// 좌석 예약 상태 
	int sNum; 		// 좌석 번호 

	//삭제하기. 이름이랑 일치하는 인덱스를 찾아서 "---" 입력.  
	int cancle(String del_name, Seat [] s) {
		int num = 0;
		boolean success = false;
		for(int i=0; i<s.length; i++) {
			if(del_name.equals(s[i].getsState())) {
				s[i].setsState("---");
				success = true;
			}
		}
		if(success == true) {System.out.println("삭제완료되었습니다.");}
		else {System.out.println("없는 이름입니다.");}
		num++;
		return num;
	}
}


public class ReserveSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Seat [] s = new Seat [10];
		for(int i=0; i<s.length; i++) {
			s [i] = new Seat();
		}
		Seat [] a = new Seat [10];
		for(int i=0; i<a.length; i++) {
			a [i] = new Seat();
		}

		Seat [] b = new Seat [10];
		for(int i=0; i<b.length; i++) {
			b [i] = new Seat();
		}

		boolean loop = true;
		System.out.println("명품콘서트홀 예약 시스템입니다. ");

		while(loop) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>> ");
			String menu = sc.next();

		switch (menu) {

		case "1": 
			sc.nextLine();
			System.out.print("좌석구분 S(1), A(2), B(3)>>> ");
			String sType = sc.next();

			if(sType.equals("1")) {
				Check.show(sType, s);
				System.out.print("이름>> ");
				String name = sc.next();
				System.out.print("번호>> ");

				try {
					int sNum;
					sNum = sc.nextInt();
					Reservation rv = new Reservation();
					rv.reserve(name, sNum, s);
					break;

				} catch (Exception e) {
					System.out.println("없는 좌석번호입니다. 1~10까지 중에서 남아있는 좌석을 선택하세요.");
					sc.nextLine();
					break;
				}

			}

			else if(sType.equals("2")) {
				Check.show(sType, a);
				System.out.print("이름>> ");
				String name = sc.next();
				System.out.print("번호>> ");
				int sNum;

				try {
					sNum = sc.nextInt();
					Reservation rv = new Reservation();
					rv.reserve(name, sNum, a);
					break;

				} catch (Exception e) {
					System.out.println("없는 좌석번호입니다. 1~10까지 중에서 남아있는 좌석을 선택하세요.");
					sc.nextLine();
					break;
				}
			}

			else if(sType.equals("3")) {
				Check.show(sType, b);
				System.out.print("이름>> ");
				String name = sc.next();
				System.out.print("번호>> ");
				int sNum;

				try {
					sNum = sc.nextInt();
					Reservation rv = new Reservation();
					rv.reserve(name, sNum, b);
					sc.nextLine();
					break;

				} catch (Exception e) {
					System.out.println("없는 좌석번호입니다. 1~10까지 중에서 남아있는 좌석을 선택하세요.");
					sc.nextLine();
					break;
				}
			}

			else {
				System.out.println("없는 좌석번호입니다.");
			}
			break;

		case "2": 
			Check.allShow(s, a, b);
			break;

		case "3": 
			System.out.print("좌석 S:1, A:2, B:3>> ");
			String del_sType = sc.next();

			if(del_sType.equals("1")) {
				Check.show(del_sType, s);
				System.out.print("이름>> ");
				String del_name = sc.next();
				Cancellation c = new Cancellation();
				c.cancle(del_name, s);
			}

			else if(del_sType.equals("2")) {
				Check.show(del_sType, a);
				System.out.print("이름>> ");
				String del_name = sc.next();
				Cancellation c = new Cancellation();
				c.cancle(del_name, a);
			}

			else if(del_sType.equals("3")) {
				Check.show(del_sType, b);
				System.out.print("이름>> ");
				String del_name = sc.next();
				Cancellation c = new Cancellation();
				c.cancle(del_name, b);
			}

			else {
				System.out.println("없는 좌석번호입니다.");
			}
			break;

		case "4": 
			loop = false;
			break;

		default:
			System.out.println("없는 메뉴입니다. ");
			break;
		}
		}

		sc.close();
	}

 

}