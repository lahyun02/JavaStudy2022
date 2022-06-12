package chapter09;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

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
//		add(new JTextField(16));
		
//		JTextField tf = new JTextField(16);  // -> 오류. 널포인트익셉션 
		setTf(new JTextField(16));
		add(tf);
		
	}
}



class CenterPanel extends JPanel {
	ArrayList<JButton> btnList = new ArrayList<JButton>();
	StringBuilder sb = new StringBuilder();
	int last;
	String str;
	
	
	// 내부 클래스
	class MyActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();		// 이벤트 소스 버튼 알아내기 
			
			//수식 입력 텍스트필드에 클릭한 버튼의 내용들이 누적으로 출력된다. 
			btnList.add(button);
			for(int i=0; i < btnList.size(); i++) {
//				NorthPanel.getTf().setText(btnList.get(i).getText());
				last = btnList.lastIndexOf(button); 
			}
			sb.append(btnList.get(last).getText());
			str = sb.toString();
			System.out.println(str);
			NorthPanel.getTf().setText(str);
			
			if(btnList.get(last).getText().equals("x")) {
//				num.add();
			}
		}
	}
	
	ArrayList<Integer> num = new ArrayList<Integer>();
	// 내부 클래스 
	class MyActionListener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();		// 이벤트 소스 버튼 알아내기 
			// 숫자만 따로 ArryaList에 저장. 
			int n = Integer.parseInt(button.getText());
			num.add(n);
//			for(int na : num) System.out.println(na);
		}
	}
	
	int total = 0;
	int i=0;
	// 내부 클래스 
		class MyActionListener4 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// x이면 바로 앞에 있는 것과 뒤에 있는 것 곱하기 
				JButton button = (JButton) e.getSource();
				
//				String operator = button.getText().toString();
//				boolean contains = str.contains("x");
				
//				String[] split = str.split("x");
				
				
				if(str.contains("x")) { 
//					int nn = num.get(0) * num.get(1);
					if(i==0) { total += num.get(0); System.out.println("total : " + total); i++; }
					 total = total * num.get(1); 
					 
					 
//					String[] split = str.split(operator);
//					int nn = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
//					System.out.println(nn);
					System.out.println("num.get(0) :" + num.get(0));
					System.out.println("num.get(1) :" + num.get(1));
					System.out.println("total2 :" + total);
				}
				
				String ss = String.valueOf(total);
				SouthPanel.getStf().setText(ss);
				
			}
			
			
		}
		
//	// 내부 클래스 
//	class MyActionListener5 implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			
//		}
//		
//	}
	
	
	public CenterPanel() {
		setBackground(Color.white);
		setOpaque(true);
		setLayout(new GridLayout(4,4,5,5));
		
//		JButton b = null;
//		ArrayList<JButton> al = new ArrayList<JButton>();
		for(int i=0; i<10; i++) {	
//			add(new JButton(Integer.toString(i)));
			JButton b = new JButton(Integer.toString(i));
			add(b);
			b.addActionListener(new MyActionListener2());
			b.addActionListener(new MyActionListener3());
//			al.get(i).addActionListener(new MyActionListener2()); // -> al의 0번째에 추가하기도 전에 0번째것을 호출했으니까 인덱스 바운즈 에러가 남. 
//			al.add(b);
//			al.get(i).addActionListener(new MyActionListener2());
			
		}
		
		
		
		JButton delete_button = new JButton("CE");
		add(delete_button);
		
//		add(new JButton("계산"));
		JButton calc = new JButton("계산");
		add(calc);
		calc.addActionListener(new MyActionListener4());
		
		
		
		delete_button.addActionListener(new MyActionListener()); //독립적인 클래스로 이벤트 리스너 작성.
		//-> 한번쓰고 말꺼라서 굳이 이름 안지어주고 익명으로 그냥 썼음.

//		JButton buttons[] = {new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/")};
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton multiple = new JButton("x");
		JButton divide = new JButton("/");
		
		JButton buttons[] = {plus, minus, multiple, divide};
		
		for(int i=0; i<buttons.length; i++) {
			buttons[i].setBackground(Color.CYAN);
			add(buttons[i]);
			
			buttons[i].addActionListener(new MyActionListener2());
//			buttons[i].addActionListener(new MyActionListener4());
//			al.add(buttons[i]);
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
//		add(new JTextField(16));
		
//		stf = new JTextField(16);
		setStf(new JTextField(16));
		add(stf);
		
	}
	

}

