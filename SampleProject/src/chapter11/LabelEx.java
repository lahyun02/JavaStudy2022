package chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelEx extends JFrame {
	public LabelEx() {
		super("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		JLabel normalIcon = new JLabel("보고싶으면 전화하세요.", new ImageIcon("images/normalIcon.gif"), SwingConstants.LEFT);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(normalIcon);
		
		setSize(400,600);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new LabelEx();
	}

}
