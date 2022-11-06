package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer1 {
	int n = 0;
	JLabel timerLabel;
	
	public Timer1(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void init() {
		while(true) {
			timerLabel.setText(Integer.toString(n));  
			n++;
			try{Thread.sleep(1000);} // Thread클래스를 직접 상속받지 않았기 때문에 sleep메소드 앞에 Thread클래스명을 붙여준
			catch(InterruptedException e){return;} // 문제가 생기면 응용프로그램 종료
		}
	} 	//Thread의 run 메소드를 오버라이딩, 스레드 작성코드


}

public class Ex extends JFrame{
	public Ex() {
		setTitle("스레드 timer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		Timer1 tt = new Timer1(timerLabel); 
		
		setSize(300, 170);
		setVisible(true);
		
		tt.init();
	}
	
	public static void main(String[] args) {
		Ex th = new Ex();
	}
}