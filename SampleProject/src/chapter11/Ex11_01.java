package chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex11_01 extends JFrame {
	
	Ex11_01() {
		setTitle("JComponent의 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disabled Button "); 
		JButton b3 = new JButton("getX(), getY()"); 
		c.add( b1 );
		c.add(b2 ); 
		c.add(b3 );

		b1.setSize(400, 100);
		b1.setOpaque(true);
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.magenta);
		b1.setFont( new Font("Arial", Font.PLAIN, 20 ) ); 
		
		b2.setSize(200, 200);
		b2.setEnabled(false);
		
		b3.setSize(200, 200);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JFrame frame = (JFrame)b.getTopLevelAncestor();  //JFrame으로 다운그레이드함.
				frame.setTitle(b.getX() + ", " + b.getY()); 
			}
		});
		
		setSize(260, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex11_01();
	}

}
