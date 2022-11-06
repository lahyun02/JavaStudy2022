package chapter13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	String text;
	int delay;
	
	public FlickeringLabel(String text, int delay) {
		super(text);	//JLabel 생성자 호출 
		this.text = text;
		this.delay = delay;
		setOpaque(true);
		//라벨별로 따로 동작해야하는 기능을 추가  
 		//각각의 생성자 호출시 스레드를 함께 호ㅜㅊㄹ
		Thread th = new Thread(this);   //Thread th = new Thread(new FlickeringLabel(text, delay));
		th.start();
		th.setPriority(5); 
		System.out.println("우선순위: " + th.getPriority() ); 
		
	}
	
	@Override
	public void run() {
		boolean state = true;
		while(true) {

				if (state)  	setBackground(Color.YELLOW);
				else 			setBackground(Color.GREEN);
				if (state)		state = false;
				else 			state = true;
				try {Thread.sleep(delay);}
				catch(InterruptedException e ) {return;}
		}
	}
}

public class FilckeringLabelEx extends JFrame {
	
	FilckeringLabelEx(){
		setTitle("깜빡이 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		
		FlickeringLabel label1 = new FlickeringLabel("0.5초씩깜빡", 500); 
		JLabel label2 = new JLabel("안깜빡");
		FlickeringLabel label3 = new FlickeringLabel("0.3초씩깜빡", 300);
		
		c.add(label1); c.add(label2); c.add(label3); 
		
		setSize(300,150);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new FilckeringLabelEx();
	}

}
