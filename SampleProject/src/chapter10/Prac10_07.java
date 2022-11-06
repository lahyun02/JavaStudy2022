package chapter10;

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;

public class Prac10_07 extends JFrame {
	JLabel label = new JLabel("Love Java");
	Container c = getContentPane();
//	int size = 16;
	public Prac10_07() {
		setTitle("마우스 휠을 굴려 폰트 크기 조정하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label.setSize(100, 100);
		label.setLocation(50,10);
		label.setFont(new Font("Ariel", Font.PLAIN, 20)); 
		c.add(label);
		
		label.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				JLabel j = (JLabel) e.getSource();
				int n = e.getWheelRotation();
				if(n < 0) {  // up direction. 음수면 위. 폰트 5픽셀씩 작게
					int size = j.getFont().getSize();
					if(size <= 5) return; 
					j.setFont(new Font("Ariel", Font.PLAIN, size-5)); 
				}
				else {  // down direction. 양수면 아래. 폰트 5픽셀씩 크게
					int size = j.getFont().getSize();
					j.setFont(new Font("Ariel", Font.PLAIN, size+5)); 
				}
				System.out.println(j.getFont().getSize());
			}
		});
		
		setSize(300,300);
		setVisible(true); 
		
		//컴포넌트에 포커스 설정
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	
	public static void main(String[] args) {
		new Prac10_07();
	}

}
