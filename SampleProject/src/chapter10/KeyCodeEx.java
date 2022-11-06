package chapter10;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class KeyCodeEx extends JFrame {
	JLabel[] label = new JLabel[3];
	
	public KeyCodeEx() {
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener()); 
		
		c.setLayout(new FlowLayout());
		label[0] = new JLabel(" getKeyCode() ");
		label[1] = new JLabel(" getKeyChar() ");
		label[2] = new JLabel(" getKeyText() ");
		
		for(int i=0; i<label.length;i++) {
			c.add(label[i]);
			label[i].setOpaque(true); // 글자 라벨지의 투명도. 
			label[i].setBackground(Color.YELLOW); 
		}
		
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
			
			label[0].setText(Integer.toString(keyCode)); 
			label[1].setText(Character.toString(keyChar)); 
			label[2].setText(keyText); 
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new KeyCodeEx();
	}

}
