package chapter05;

interface PhoneInterface{ // 인터페이스는 디폴트가 public!
	int TIMEOUT = 10000; //생략해도 어차피 상수. 다같이 공유하는 상수. (static final 생략, public도 생략) 
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{
	void play();
	void stop();
}
class PDA{
	int calculator(int x, int y) {return x+y;}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{
	@Override
	public void sendCall() {System.out.println("sendcall");}
	@Override
	public void receiveCall() {System.out.println("receivecall");}
	@Override
	public void sendSMS() {System.out.println("sendsms");}
	@Override
	public void receiveSMS() {System.out.println("receivesms");}
	@Override
	public void play() {System.out.println("play");}
	@Override
	public void stop() {System.out.println("stop");}
	public void schedule() {System.out.println("schedule");}
}


public class interfaceEx {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculator(3, 5));
		phone.schedule();
	}

}
