package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RunnableTimer implements Runnable {
	int n = 0;
	JLabel timerLabel;
	
	public RunnableTimer(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		while(true) {
			timerLabel.setText(Integer.toString(n));  
			n++;
			try{Thread.sleep(1000);}  // Thread클래스를 직접 상속받지 않았기 때문에 sleep메소드 앞에 Thread클래스명을 붙여준
			//쉬는 기간동안 이코드를 실행할 수 없는 인터럽트가 일어날 수 있기 때문에 try-catch문 안에 써야 함.
			catch(InterruptedException e){return;} // 문제가 생기면 응용프로그램 종료
		}
	} 	//Thread의 run 메소드를 오버라이딩, 스레드 작성코드


}

public class RunnableTimerEx extends JFrame{
	public RunnableTimerEx() {
		setTitle("스레드 timer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		RunnableTimer runnable = new RunnableTimer(timerLabel);//기본 쓰레드 객체에 runnable을 넣을 ㅜ==수있ㅇ
		Thread th = new Thread(runnable);
		setSize(300, 170);
		setVisible(true);
		th.start();
		
	}
	
	public static void main(String[] args) {
		RunnableTimerEx th = new RunnableTimerEx();
	}
}