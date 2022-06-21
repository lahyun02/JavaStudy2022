package chapter11;

import java.awt.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		super("체크박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedcherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");  //선택된 상태 
		JCheckBox cherry = new JCheckBox("체리", cherryIcon, true);
		cherry.setSelectedIcon(selectedcherryIcon);
		
		c.add(apple); c.add(pear); c.add(cherry);
		
		setSize(400,600);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
