package chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEx extends JFrame {
	
	public ButtonEx() {
		super("버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/normalIcon.gif");
		
		JButton btn = new JButton("call~", normalIcon);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		btn.setVerticalAlignment(SwingConstants.BOTTOM); 
		btn.setPressedIcon(pressedIcon);	//마우스로 이미지를 클릭하면
		btn.setRolloverIcon(rolloverIcon); // 마우스를 이미지 위에 올렸을 떄 
		
		
		c.add(btn);
		setSize(400,600);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ButtonEx();
	}

}
