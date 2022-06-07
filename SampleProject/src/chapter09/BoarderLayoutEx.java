package chapter09;

import javax.swing.*;
import java.awt.*;

public class BoarderLayoutEx extends JFrame {
	
	public BoarderLayoutEx() {
		super("BoarderLayout Sample"); //JFrame 생성자 중에서 String 을 파라메터로 갖는 생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setLayout(new BorderLayout(30, 20));
		
		contentPane.add(new JButton("add"), BorderLayout.NORTH);
		contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"), BorderLayout.EAST);
		contentPane.add(new JButton("div"), BorderLayout.WEST);
		contentPane.add(new JButton("calculate"), BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new BoarderLayoutEx();
	}

}
