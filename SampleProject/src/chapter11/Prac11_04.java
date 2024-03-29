package chapter11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 실습문제 11장 4번
public class Prac11_04 extends JFrame {
	JTextField money [] = new JTextField[8];
	String text[] = {"50000원", "10000원", "1000원", "500원", "100원", "50원", "10원", "1원"};
	int money_unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	int mu[] = new int[8];
//	List<Integer> money_unit = new ArrayList<Integer>();
	JTextField totalMoney = new JTextField(20);
	JPanel j;
	JCheckBox[] cb = new JCheckBox[8];
	boolean flag;
	public Prac11_04() {
		super("Money Changer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		JPanel panel;
		JLabel label = new JLabel("금액");
		JButton calBtn = new JButton("계산");
		MyListener listener = new MyListener();
		calBtn.addActionListener(listener);
//		c.add(label);
//		c.add(totalMoney); 
		
		j = new JPanel();
		j.add(label); 
		j.add(totalMoney);
		j.setOpaque(true);
		j.setBackground(Color.PINK); 
		j.add(calBtn);
//		j.setba
//		label.add(j);
		c.add(j); 
		
//		c.add(calBtn); 
		c.setBackground(Color.PINK); 
		MyItemListener itemListener = new MyItemListener();
		
		for(int i=0; i<money.length; i++) {
			
			j = new JPanel();
			j.add(new JLabel(text[i]));
			j.add(money[i] = new JTextField(10));
			j.setOpaque(true); 
			j.setBackground(Color.PINK);
//			c.add(new JLabel(text[i]));
//			money[i] = new JTextField(30);
			cb[i] = new JCheckBox();
			j.add(cb[i]); 
			cb[i].addItemListener(itemListener);
			
			c.add(j); 
//			c.add((money[i])); 
		}
		
		setSize(400,400);
		setVisible(true); 
		
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				for(int i=0; i<money_unit.length; i++) {
					if(e.getItem() == cb[i])
					mu[i] = money_unit[i];
				}
								
			}
			else {
				for(int i=0; i<money_unit.length; i++) {
					if(e.getItem() == cb[i])
					mu[i] = 0;
				}
				
			}
		}
		
	}
	
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			int num = Integer.parseInt(totalMoney.getText());
			int n=0;
			for(int i=0; i<money.length; i++) {
				if(mu[i]!=0) {
					money[i].setText(Integer.toString(num/money_unit[i]));
					
				}
				else if(money_unit[i]!=0 ) {
					money[i].setText(Integer.toString((num%money_unit[i-1])/money_unit[i]) );  
				}
				
				
//				if(i == 0) { money[0].setText(Integer.toString(num/money_unit[i])); }
//				else {
//					money[i].setText(Integer.toString((num%money_unit[i-1])/money_unit[i]) );  
//				} 
				
				
			}
			
			
			
			
		}
	}
	

	public static void main(String[] args) {
		new Prac11_04();
	}

}
