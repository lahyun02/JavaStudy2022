package chapter05;

interface Weapon{
	public void fire(int power);	// 현재 curPower에서 power값을 제거한다.
	public int getRestPower(); 		// 현재 curPower값을 리턴한다.
	public int charge(int power); 	// 현재 curPower에서 power만큼 더하고 더해진 curPower값을 리턴한다. 
}

// to do1 : weapon의 메소드를 오버라이딩하라! 
class MyWeapon implements Weapon{
	int curPower;
	@Override
	public void fire(int power) {this.curPower -= power;} // 현재 curPower에서 power값을 제거한다.
	@Override
	public int getRestPower() {return this.curPower;} // 현재 curPower값을 리턴한다.
	@Override
	public int charge(int power) {return this.curPower += power;} // 현재 curPower에서 power만큼 더하고 더해진 curPower값을 리턴한다. 
}

// todo2 : GameUnit 2개를 만들고 각 GameUnit은 MyWeapon의 기능을 사용할 수 있도록 하라.
public class GameUnit {
	//todo3 : GameUnit이 가질 속성을 정의하라.
	public static int bossPower = 10000;	// bossPower
	private MyWeapon weapon;				// weapon객체
	private String name;					// 각 unit 이름
	
	//todo4 : GameUnit의 생성자를 정의하라. (이름, 무기, Power값 초기화)
	GameUnit(String name, int power) {
		this.name = name;
		weapon = new MyWeapon();			// unit은 무기를 갖는다.
		weapon.charge(power);
	}
	
	//todo5 : attack(int power) 메소드를 정의하라.
	//void attack(int power)을 하면 bossPower에서 power만큼 제거하고,
	//bossPower가 0이하가 되면 게임 승리하고 System.exit(0) 프로그램 종료함.
	public void attack(int power) {
		bossPower -= power; 
		if(bossPower <= 0) {
			System.out.println("게임승리!! : " + this.name);
			System.exit(0); 	// 무조건 프로그램 종료시켜라.
		} else {
			System.out.println("공격!! bossPower : " + bossPower);
		}
		
	}
	
	public static void main(String[] args) {
	//todo6 : GameUnit들이 서로 경기할 수 있도록 시나리오를 만든다.
		GameUnit unit1 = new GameUnit("unit1", 500);
		GameUnit unit2 = new GameUnit("unit2", 100);
		

		while(true) {
		int num1 = (int)(Math.random()*100)+1;
		unit1.attack(num1);
		
		int num2 = (int)(Math.random()*100)+1;
		unit2.attack(num2);
		}
		
	}

}
