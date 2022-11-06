package shoppingmall;

import java.util.ArrayList;
import java.util.Scanner;

import shoppingmall.User.payType;

public class MyShop implements IShop{
	Scanner scan = new Scanner(System.in);
	String title; 	// 쇼핑몰 이름 
	User users[] = new User[2]; 		// 사용자 이름 배열 
	Product product[] = new Product[4]; // 상품 배열
	ArrayList<Product> cart = new ArrayList<Product>(); 	// 장바구니 
	int selUser;	// 사용자 번호 
	
	// 쇼핑몰이름 설정 
	@Override
	public void setTitle(String title) {
		this.title = title;
	}	
	
	// 예제사용자 생성
	@Override
	public void genUser() {
		// 대입하려면 서로 타입이 같아야 함.
		users[0] = new User("홍길동", payType.CARD);
		users[1] = new User("블로거", payType.CASH);
	}
					
	// 예제상품 생성
	@Override
	public void genProduct() {
		product[0] = new CellPhone("갤럭시 노트5", 1000000, "SKT");
		product[1] = new CellPhone("애플 아이폰7", 980000, "KT");
		product[2] = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		product[3] = new SmartTV("LG Smart TV", 2500000, "Full HD");
	}				
	
	// 쇼핑몰시작 메소드
	@Override
	public void start() {
		System.out.println(this.title + ": 메인화면 - 계정선택");
		System.out.println("========================");
		// 사용자 이름 출력 
		for(int i=0; i<users.length; i++) { System.out.println( "[" + i + "]" + users[i]);}
		System.out.println("[x]종료");
		System.out.print("선택 : ");
		String menu = scan.next();
		switch(menu) {
		case "0": 
			selUser = 0;	// 0번째 사용자 
		case "1":
			selUser = 1;	// 1번째 사용자 
			productList();
			break;
		case "x":
			System.exit(0);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
		}
	}				
	
	// 상품목록 출력, 장바구니에 담기 
	void productList() {
		System.out.println(this.title + ": 상품목록 - 상품 선택");
		System.out.println("========================");
		// 상품 목록 출력 
		for(int i=0; i<product.length; i++) {
			System.out.print("[" + i + "]");
			product[i].printDetail();
		} 
		System.out.println("[h]메인화면");
		System.out.println("[c]체크화면");
		
		boolean loop = true;
		while(loop) {
			System.out.print("선택 : ");
			String select = scan.next();
		switch(select) {
		case "0": 
			cart.add(product[0]);
			System.out.println("1개의 상품이 장바구니에 담겼습니다.");
			break;
		case "1":
			cart.add(product[1]);
			System.out.println("1개의 상품이 장바구니에 담겼습니다.");
			break;
		case "2":
			cart.add(product[2]);
			System.out.println("1개의 상품이 장바구니에 담겼습니다.");
			break;
		case "3":
			cart.add(product[3]);
			System.out.println("1개의 상품이 장바구니에 담겼습니다.");
			break;
		case "h":
			loop = false;
			start();
			break;
		case "c":
			loop = false;
			checkOut();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
		}
		}
		
	}
	
	// 장바구니에 선택된 상품과 결제금액, 결제수단 출력 
	void checkOut() {
		System.out.println(this.title + ": 체크아웃");
		System.out.println("========================");
		// 장바구니에 담긴 상품 총 합계 계산, 상품 이름과 가격 출력 
		int sum = 0;
		for(int i=0; i<cart.size(); i++) {
			Product p = cart.get(i);		//
			sum += p.price;
			System.out.println("[" + i + "]" + p.pname + "(" + p.price + ")");
		}
		System.out.println("========================");
		System.out.println("결제방법: " + users[selUser].getPaytype());
		System.out.println("합계: " + sum + "입니다.");
		
		System.out.println("[p]이전 , [q]결제 완료");
		System.out.print("선택 : ");
		String choice = scan.next();
		switch(choice) {
		case "p": 
			productList();
			break;
		case "q":
			System.out.println("결제가 완료되었습니다.");
		}
	}
}
