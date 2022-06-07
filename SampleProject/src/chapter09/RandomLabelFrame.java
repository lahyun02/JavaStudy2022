package chapter09;

import javax.swing.*;
import java.awt.*;

public class RandomLabelFrame extends JFrame {
	
	public RandomLabelFrame() {
		super("Random Labels"); //JFrame 생성자 중에서 String 을 파라메터로 갖는 생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); 	//배치관리자 없는 컨테이너 (절대좌표로 쓸거임)
		
		
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel(Integer.toString(i)); 
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			label.setLocation(x, y);
			label.setSize(10, 10);
			label.setOpaque(true);  	//라벨의 배경색상이 판넬 위에 보이도록 
			label.setBackground(Color.BLUE);
			c.add(label); 
		
//			JButton button = new JButton(Integer.toString(i));
//			button.setLocation(i*15, i*15);
//			button.setSize(50, 20);
//			contentPane.add(button); 
		}
		
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new RandomLabelFrame();
	}

}
