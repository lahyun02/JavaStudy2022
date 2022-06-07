package chapter09;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		super("계산기 프로그램"); 	//setTitle("")과 같다. 부모 클래스중에 문자열이 들어가는 생성자가 있어서 이걸 상속받아서 사용함.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new NorthPanel(), BorderLayout.NORTH);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			setOpaque(true); 
			setLayout(new FlowLayout());	//JPanel은 FlowLayout이 디폴트임.
			add(new JLabel("수식입력"));
			add(new JTextField(16));
		}
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setBackground(Color.white);
			setOpaque(true);
			setLayout(new GridLayout(4,4,5,5));

			for(int i=0; i<10; i++) {	
				add(new JButton(Integer.toString(i)));
			}
			
			JButton delete_button = new JButton("CE");
			add(delete_button);
			add(new JButton("계산"));
			
			
			delete_button.addActionListener(new MyActionListener()); //독립적인 클래스로 이벤트 리스너 작성.
			//-> 한번쓰고 말꺼라서 굳이 이름 안지어주고 익명으로 그냥 썼음.

			
			JButton buttons[] = {new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/")};
			
			for(int i=0; i<buttons.length; i++) {
				buttons[i].setBackground(Color.CYAN);
				add(buttons[i]);
			}
				
		}
	}
	class SouthPanel extends JPanel {
		public SouthPanel() {
			setBackground(Color.yellow);
			setOpaque(true); 
			setLayout(new FlowLayout());
			add(new JLabel("계산결과"));
			add(new JTextField(16));
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		new InnerClassListener();
	}
}






