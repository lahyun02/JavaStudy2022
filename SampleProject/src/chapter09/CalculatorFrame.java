package chapter09;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
	public CalculatorFrame() {
		super("계산기 프로그램"); 	// 프레임 타이틀 달기. setTitle("")과 같다. 부모 클래스중에 문자열이 들어가는 생성자가 있어서 이걸 상속받아서 사용함.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 프레임 윈도우를 닫으면 프로그램을 종료하도록 설정 
		
		Container c = getContentPane();		// 컨텐트 팬을 알아낸다. 
		
		c.add(new SouthPanel(), BorderLayout.SOUTH);	//  Border레이아웃으로 남쪽에 생성 
		c.add(new CenterPanel(), BorderLayout.CENTER);  //  Border레이아웃으로 중앙에 생성 
		c.add(new NorthPanel(), BorderLayout.NORTH);	//  Border레이아웃으로 북쪽에 생성 
		
		setSize(300, 300);		// 프레임 사이즈를 300x300으로 설정 
		setVisible(true);		// 프레임을 보이도록 설정 
		
	}
	
	
	public static void main(String[] args) {
		new CalculatorFrame();	// CalculatorFrame클래스 생성자 생성 후 실행 
	}
}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {		// 버튼 클릭 시 호출되는 메서드 
		JButton button = (JButton) e.getSource();		// 클릭된 버튼 알아내기 
		if(button.getText().equals("CE")) 				// 버튼의 문자열이 "Action"인지 비교 
			button.setText("종료"); 						// 문자열 변경 
		else
			button.setText("CE"); 						// 문자열 변경 
	}
}

class NorthPanel extends JPanel {
	private static JTextField tf;
	
	public static JTextField getTf() {
		return tf;
	}

	public static void setTf(JTextField tf) {
		NorthPanel.tf = tf;
	}

	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true); 
		setLayout(new FlowLayout());	//JPanel은 FlowLayout이 디폴트임.
		add(new JLabel("수식입력"));
		
		setTf(new JTextField(16));
		add(tf);
	}
}


class CenterPanel extends JPanel {
	ArrayList<JButton> btnList = new ArrayList<JButton>();
	StringBuilder sb = new StringBuilder();
	int last;		//마지막인덱스
	String str;		//수식입력 문자열 
	
	ArrayList<String> al = new ArrayList<String>();
	
	class MyActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();		// 이벤트 소스 버튼 알아내기 
			
			//수식 입력 텍스트필드에 클릭한 버튼의 내용들이 누적으로 출력된다. 
			btnList.add(button);
			
			for(int i=0; i < btnList.size(); i++) {
				last = btnList.lastIndexOf(button); 	//btnList에서 마지막 button 인덱스
			}
			sb.append(btnList.get(last).getText());		//btnList의 마지막 요소 텍스트를 추가하기
			str = sb.toString();						//문자열로 변환
			
			System.out.println(str);
			NorthPanel.getTf().setText(str);
		}
	}

	// 내부 클래스 
	class MyActionListener4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			// 계산한 값을 문자열로 변환해서 계산결과 필드에 출력하기 
			SouthPanel.getStf().setText(Integer.toString(calc(str)));
			}
		}
	
	// 입력한 버튼으로 계산하는 메소드
	public int calc(String str) {
		int total =0 ;		// 총합계
		StringTokenizer st = new StringTokenizer(str, "+-x/"); 
		int num1 =0;
		int num2 = 0;
		while(st.hasMoreTokens()) {
			num1 = Integer.parseInt(st.nextToken().trim());
			num2 = Integer.parseInt(st.nextToken().trim());
		}
		if(str.contains("+")) {
			total = num1 + num2;
		}
		else if(str.contains("-")) {
			
			total = num1 - num2;
		}
		else if(str.contains("x")) {
			
			total = num1 * num2;
		}
		else if(str.contains("/")) {
			if(!(num2 == 0)) total = num1 / num2;
			else { total = 1234; }
			
		}
		System.out.println(total);
		return total;
	} 
	
	
	public CenterPanel() {
		setBackground(Color.white);
		setOpaque(true);
		setLayout(new GridLayout(4,4,5,5));
		
		for(int i=0; i<10; i++) {	
			JButton b = new JButton(Integer.toString(i));
			add(b);
			b.addActionListener(new MyActionListener2());
		}
		
		
		class MyActionListener5 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				str = "";
				SouthPanel.getStf().setText(str);
				NorthPanel.getTf().setText(str);
				
				btnList.clear();
				sb.setLength(0);
			}
		}
		
		JButton delete_button = new JButton("CE");
		delete_button.addActionListener(new MyActionListener5());
		add(delete_button);
		
		JButton calc = new JButton("계산");
		add(calc);
		calc.addActionListener(new MyActionListener4());
		
		delete_button.addActionListener(new MyActionListener()); //독립적인 클래스로 이벤트 리스너 작성.

		JButton buttons[] = {new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/")};
		
		for(int i=0; i<buttons.length; i++) {
			buttons[i].setBackground(Color.CYAN);
			add(buttons[i]);
			
			buttons[i].addActionListener(new MyActionListener2());
		}
	}
}

class SouthPanel extends JPanel {
	private static JTextField stf;
	
	public static JTextField getStf() {
		return stf;
	}

	public static void setStf(JTextField stf) {
		SouthPanel.stf = stf;
	}

	public SouthPanel() {
		setBackground(Color.yellow);
		setOpaque(true); 
		setLayout(new FlowLayout());
		add(new JLabel("계산결과"));
		
		setStf(new JTextField(16));
		add(stf);
	}

}

