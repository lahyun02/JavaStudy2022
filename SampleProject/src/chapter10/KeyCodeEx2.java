package chapter10;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class KeyCodeEx2 extends JFrame {
	JLabel label = new JLabel();		// 전역변수 
	Container c = getContentPane();		// 전역변수
	
	public KeyCodeEx2() {
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.addKeyListener(new MyKeyListener()); 
		c.setLayout(null); 	// 좌표점 찍기
		label.setSize(100, 100);	// 라벨의 사이즈
		label.setLocation(50,50);	// 라벨의 위치 좌표
		c.add(label);				// 컨텐트 팬에 라벨 붙이기 
		
		setSize(300,150);
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
			char keyChar = e.getKeyChar();
			String keyText = e.getKeyText(keyCode); 
			
			label.setText(keyText + "키가 눌려졌음");  
			
			if(keyChar == '%') {
				c.setBackground(Color.YELLOW); 	// 컨텐트 팬의 배경색을 노란색으로 변경. 
			}
			if(keyCode == KeyEvent.VK_F1) {		
				c.setBackground(Color.GREEN);
//				label.setText("F1키가 입력되었음"); 
			}
//			else if(keyText.equals("5")) {
////				label.setText("5키가 입력되었음"); 
//			}
		}
	}
	
	
	public static void main(String[] args) {
		new KeyCodeEx2();
	}

}
