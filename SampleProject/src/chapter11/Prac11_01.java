package chapter11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Prac11_01 extends JFrame {
	public Prac11_01() {
		super("체크박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox cb1 = new JCheckBox("버튼 비활성화");
		JCheckBox cb2 = new JCheckBox("버튼 감추기");
		JButton btn = new JButton("test button");

		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn.setEnabled(false); 
				} else {
					btn.setEnabled(true);
				}
			}
		});
		
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn.setVisible(false);
				} else {
					btn.setVisible(true);
				}
			}
		});
		
		
		c.add(cb1); c.add(cb2); c.add(btn);
		
		setSize(300,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Prac11_01();
	}

}
