package chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

import chapter10.KeyCodeEx2.MyKeyListener;

public class FlyingTextEx extends JFrame {
	JLabel label = new JLabel("Hello");		// 전역변수 
	Container c = getContentPane();		// 전역변수
	final int FLYING_UNIT = 5; 			// 다른데서 못바꾸게 하고, 나중에 값을 변경할 때는 이곳에서만하면 유지보수가 쉽다. 
	
	
	public FlyingTextEx() {
		setTitle("상하좌우키를 활용한 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.addKeyListener(new MyKeyListener()); 
		c.setLayout(null); 	// 좌표점 찍기
		label.setSize(100, 100);	// 라벨의 사이즈
		label.setLocation(50,50);	// 라벨의 위치 좌표
		c.add(label);				// 컨텐트 팬에 라벨 붙이기 
		
		setSize(300,300);
		setVisible(true); 
		
		//컴포넌트나 응용프로그램이 키 이벤트를 독점하는 권한
		//컴포넌트에 포커스 설정 방법 : 다음 2 라인의 코드 필요
		c.setFocusable(true);
		c.requestFocus();
	}
	
	// 키 이벤트 리스너 만들기
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
//			char keyChar = e.getKeyChar();
//			String keyText = e.getKeyText(keyCode); 
			
			switch(keyCode) {
			case KeyEvent.VK_UP : 
				label.setLocation(label.getY(), label.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN : 
				label.setLocation(label.getY(), label.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT : 
				label.setLocation(label.getY() - FLYING_UNIT, label.getY() );
				break;
			case KeyEvent.VK_RIGHT : 
				label.setLocation(label.getY()+ FLYING_UNIT, label.getY());
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
		
	}

}
