package chapter11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		super("텍스트필드 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label1 = new JLabel("이름");
		JLabel label2 = new JLabel("학과");
		JLabel label3 = new JLabel("주소");
		JLabel totalLabel = new JLabel();
		JTextField text1 = new JTextField("나자바", 20);
		JTextField text2 = new JTextField("컴퓨터공학과", 20);
		JTextField text3 = new JTextField("자바시", 20);
		c.add(label1); c.add(text1);
		c.add(label2); c.add(text2);
		c.add(label3); c.add(text3);
		totalLabel.setText(text1.getText() + ", " + text2.getText() + ", " + text3.getText()); 
		c.add(totalLabel); 
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
