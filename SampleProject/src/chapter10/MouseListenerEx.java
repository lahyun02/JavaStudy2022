package chapter10;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseListenerEx extends JFrame {
	JLabel label = new JLabel("Hello"); // 지역변수-> 변역변수
	
	public MouseListenerEx() {
		setTitle("Mouse Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //윈도우창의 x를 누르면 프로그램 종료 
		Container c = getContentPane();
//		c.addMouseListener(new MyMouseListener());
		c.addMouseListener(new MyMouseAdapter());
		
		//1. 레이아웃 세팅
		c.setLayout(null);  //레이아웃 지우기
		label.setSize(50,20); 
		label.setLocation(30, 30);
		c.add(label); 
		
		//2. 화면에 프레임이 보이도록 세팅
		setSize(250,250); 
		setVisible(true); 
		
	}
	
	//MouseListener를 활용하는 방법
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x,y);
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		
	}
	
	//MouseAdapter를 활용하는 방법
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x,y);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
