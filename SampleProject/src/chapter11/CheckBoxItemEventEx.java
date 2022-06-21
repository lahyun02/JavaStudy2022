package chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	JCheckBox fruits[] = new JCheckBox[3];
	String names[] = {"사과", "배", "체리"};
	int sum = 0;
	JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		super("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");   
		JCheckBox cherry = new JCheckBox("체리");
		
		JLabel topLabel = new JLabel("사과 100원, 배 500원, 체리 20000원");
		sumLabel = new JLabel("현재 0원 입니다.");
		
		c.add(topLabel); 
		
		MyItemListener listener = new MyItemListener();

		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); 
			c.add(fruits[i]); 
			fruits[i].addItemListener(listener); 
		}
		
		c.add(sumLabel); 
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) 		sum += 100;
				else if(e.getItem() == fruits[1]) 	sum += 500;
				else if(e.getItem() == fruits[2])	sum += 20000;
			} else {
				if(e.getItem() == fruits[0]) 		sum -= 100;
				else if(e.getItem() == fruits[1]) 	sum -= 500;
				else if(e.getItem() == fruits[2])	sum -= 20000;
			}
			
			sumLabel.setText("현재 " + sum + "원 입니다."); 
		}
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
