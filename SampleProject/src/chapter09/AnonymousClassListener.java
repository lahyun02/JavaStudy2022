package chapter09;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

// 3 키를 누르면 그 글자가 클릭됐을때 텍스트 필드에 setText로 해당 글자가 들어감. 
// 3+5 계산 누르면, 계산결과에 8이 출력.
// ce -> 초기화되도록. 

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		super("계산기 프로그램"); 	//setTitle("")과 같다. 부모 클래스중에 문자열이 들어가는 생성자가 있어서 이걸 상속받아서 사용함.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new SouthPanelC(), BorderLayout.SOUTH);
		c.add(new CenterPanelC(), BorderLayout.CENTER);
		c.add(new NorthPanelC(), BorderLayout.NORTH);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new CalculatorFrame();
	}
}


class NorthPanelC extends JPanel {
	public NorthPanelC() {
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true); 
		setLayout(new FlowLayout());	//JPanel은 FlowLayout이 디폴트임.
		add(new JLabel("수식입력"));
		add(new JTextField(16));
	}
}

class CenterPanelC extends JPanel {
	public CenterPanelC() {
		setBackground(Color.white);
		setOpaque(true);
		setLayout(new GridLayout(4,4,5,5));

		for(int i=0; i<10; i++) {	
			add(new JButton(Integer.toString(i)));
		}
		
		JButton delete_button = new JButton("CE");
		add(delete_button);
		add(new JButton("계산"));
		
		
		// 익명클래스로 이벤트 리스너 만들기 
		delete_button.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				if(button.getText().equals("CE")) 
					button.setText("종료"); 
				else
					button.setText("CE"); 
			}
		} ); 

		
		JButton buttons[] = {new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/")};
		
		for(int i=0; i<buttons.length; i++) {
			buttons[i].setBackground(Color.CYAN);
			add(buttons[i]);
		}
			
	}
}
class SouthPanelC extends JPanel {
	public SouthPanelC() {
		setBackground(Color.yellow);
		setOpaque(true); 
		setLayout(new FlowLayout());
		add(new JLabel("계산결과"));
		add(new JTextField(16));
	}
}