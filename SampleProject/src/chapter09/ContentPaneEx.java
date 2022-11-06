package chapter09;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx() {
		super("ContentPane과 JFrame"); //JFrame 생성자 중에서 String 을 파라메터로 갖는 생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		
//		contentPane.add(new JButton("OK"));
//		contentPane.add(new JButton("Cancel"));
//		contentPane.add(new JButton("Ignore"));
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("calculate"));
		
		
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
