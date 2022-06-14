package chapter10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import chapter10.FlyingTextEx.MyKeyListener;

public class MouseListenerAllEx extends JFrame {
	JLabel label = new JLabel("Hello");		// 전역변수 
	JLabel label2 = new JLabel();		// 전역변수 
	Container c = getContentPane();		// 전역변수
	final int FLYING_UNIT = 14; 
	
	public MouseListenerAllEx() {
		setTitle("상하좌우키를 활용한 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.addMouseListener(new MyMouseListener()); 
		c.addMouseMotionListener(new MyMouseListener()); 	// drag, move일 때는 모션 리스너를 추가해줘야 함!
		c.setLayout(null); 	// 좌표점 찍기
		label.setSize(200, 100);	// 라벨의 사이즈
		label.setLocation(50,10);	// 라벨의 위치 좌표
		label.setText("No Mouse Event");
		c.add(label);				// 컨텐트 팬에 라벨 붙이기 
		
		label2.setSize(200, 100);	// 라벨의 사이즈
		label2.setLocation(50,10);
		c.add(label2);	
		
		setSize(300,300);
		setVisible(true); 
		
		//컴포넌트나 응용프로그램이 키 이벤트를 독점하는 권한
		//컴포넌트에 포커스 설정 방법 : 다음 2 라인의 코드 필요
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {
		public void mousePressed(MouseEvent e) {
//			c.setBackground(Color.CYAN);
			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);
			c.setBackground(new Color(r,g,b));
			label.setText("mousePressed (" + e.getX() + ","+ e.getY() + ")");
		}
		public void mouseReleased(MouseEvent e) {
//			c.setBackground(Color.CYAN);
			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);
			c.setBackground(new Color(r,g,b));
			label.setText("mouseReleased (" + e.getX() + ","+ e.getY() + ")");
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseDragged(MouseEvent e) {
//			c.setBackground(Color.CYAN);
			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);
			c.setBackground(new Color(r,g,b));
			label.setText("mouseDragged (" + e.getX() + ","+ e.getY() + ")");
		}
		public void mouseEntered(MouseEvent e) {
//			c.setBackground(Color.CYAN); 
			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);
			c.setBackground(new Color(r,g,b));
			label.setText("mouseEntered (" + e.getX() + ","+ e.getY() + ")");
		}
		public void mouseMoved(MouseEvent e) {
			label2.setLocation(e.getX(), e.getY()); 
			label2.setText("(" + e.getX() + ","+ e.getY() + ")"); 
		}
	}
	
	
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
