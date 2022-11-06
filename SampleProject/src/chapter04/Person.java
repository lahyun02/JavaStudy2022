package chapter04;

public class Person { //파일명과 같은 클래스 명에 public을 달아준다. 한 파일 안에 여러 클래서 작성 가능.
	//속성
	public String name;
	public int sex;
	public int age;
	@Override 	//java.lang.Objects(클래스계의 조상)으로부터 상속받은 메소드. -toString() (틀은 그대로 가져오 쓰되 내용물만 바꿈)
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	//생성자 (메소드) (규칙: 클래스 이름과 같은 이름을 쓴다.) 
	Person(){
		System.out.println("Person()생성자 호출");
	} //메소드는 일처리를 하는 아이이기때문에 일을 하든 안하든 틀을 만들어줘야 함. 그래서 중괄호 써야함!
	Person(String name){
		this(); //생성자들 중에서 안에 아무것도 없는 애들 데려와~
		this.name = name;
	}
	Person(String name, int age) {
		this(name);
		this.age = age;
	}
	//생성자 메소드는 리턴타입을 생략. 생성하고 나면 클래스 타입이 어차피 Person이기 때문에 굳이 리턴타입 쓸 필요 없음. 
	//this : 이 클래스 안에 있는 속성이야~
		
	//행위
	int eat(int rice, int side) {return rice+side;}
	int eat(int rice){return rice;}
	void eat() {System.out.println("뭘 좀 먹어봐!");}

	//main 행뒤
	public static void main(String[] args) {
		Person student = new Person();
		Person student1 = new Person("엄남경"); 		//객체선언 및 생성
		Person student2 = new Person("엄남경", 20); 		//객체선언 및 생성
		
		System.out.println(student2.name + ", " + student2.age);
//		System.out.println(student1.name);
//		System.out.println(student2.name);
//		System.out.println(student2.age);
//		System.out.println(student1.eat(100));
//		System.out.println(student2.eat(300, 200));
		student.eat(); //출력문 안에 출력문은 안넣어줘서 그냥 적어주면 됨.
	}
}	

