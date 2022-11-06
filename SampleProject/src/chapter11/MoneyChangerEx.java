package chapter11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 실습문제 11장 3번
public class MoneyChangerEx extends JFrame {
	JTextField money [] = new JTextField[8];
	String text[] = {"50000원", "10000원", "1000원", "500원", "100원", "50원", "10원", "1원"};
	int money_unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	JTextField totalMoney = new JTextField(20);
	JPanel j;
	public MoneyChangerEx() {
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
		for(int i=0; i<money.length; i++) {
			
			j = new JPanel();
			j.add(new JLabel(text[i]));
			j.add(money[i] = new JTextField(10));
			j.setOpaque(true); 
			j.setBackground(Color.PINK);
//			c.add(new JLabel(text[i]));
//			money[i] = new JTextField(30);
			
			c.add(j); 
//			c.add((money[i])); 
		}
		
		
		setSize(400,400);
		setVisible(true); 
		
	}
	
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			int num = Integer.parseInt(totalMoney.getText());
			
			for(int i=0; i<money.length; i++) {
				if(i == 0) { money[0].setText(Integer.toString(num/money_unit[0])); }
				else {
					money[i].setText(Integer.toString((num%money_unit[i-1])/money_unit[i]) );  
				}
			}
		}
	}
	

	public static void main(String[] args) {
		new MoneyChangerEx();
	}

}
