package chapter11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Ex11_02 extends JFrame {
	public Ex11_02() {
		super("이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton yellowBtn = new JButton("노란색");
		JButton pinkBtn = new JButton("핑크색");

		yellowBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.YELLOW);
			}
		});
		
		pinkBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.PINK);
			}
		});
		
		c.add(yellowBtn); c.add(pinkBtn); 
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11_02();
	}

}
