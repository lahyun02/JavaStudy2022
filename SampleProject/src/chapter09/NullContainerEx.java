package chapter09;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	
	public NullContainerEx() {
		super("GridLayout Sample"); //JFrame 생성자 중에서 String 을 파라메터로 갖는 생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null); 	//배치관리자 없는 컨테이너 (절대좌표로 쓸거임)
		
		JLabel label = new JLabel("Hello, Press Buttons!");
		label.setLocation(130, 50);
		label.setSize(200, 20);
//		label.setBounds(130, 50, 200, 20);
		contentPane.add(label); 
		
		for(int i=1; i<=9; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setLocation(i*15, i*15);
			button.setSize(50, 20);
			contentPane.add(button); 
		}
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}

}
