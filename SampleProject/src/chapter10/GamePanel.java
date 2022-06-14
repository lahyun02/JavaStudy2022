package chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class GamePanel extends JFrame {
	JLabel[] label = new JLabel [3];
	Container c = getContentPane(); 
	JLabel result = new JLabel("시작합니다.");
	
	public GamePanel() {
		setTitle("Open Challenge 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		add(new GamePanelNew());
		setSize(500,500);
		setVisible(true); 
		
	}
	
	class GamePanelNew extends JPanel {
		public GamePanelNew() {

			this.setLayout(null);
			this.addKeyListener(new MyKeyListener()); 
			
			label[0] = new JLabel();
			label[1] = new JLabel();
			label[2] = new JLabel();
			
			for(int i=0; i<label.length; i++) {
				this.add(label[i]);				// 컨텐트 팬에 라벨 붙이기 
				label[i].setSize(100, 50);	// 라벨의 사이즈
				label[i].setLocation(50*(i*3),50);	// 라벨의 위치 좌표
				label[i].setOpaque(true); // 글자 라벨지의 투명도. 
				label[i].setBackground(Color.PINK); 
				label[i].setText("0"); 
				label[i].setFont(new Font("Ariel", Font.PLAIN, 34)); 
			}
			
			result.setSize(100, 100);
			result.setLocation(200, 350);
			this.add(result); 
//			result.setText("시작합니다.");
			
			
			//컴포넌트에 포커스 설정 방법
			this.setFocusable(true);
			this.requestFocus();
		}
	}
	
	class MyKeyListener extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '\n') {
				for(int i=0; i<label.length; i++) {
					int x = (int)(Math.random()*5);
					label[i].setText(String.valueOf(x));  
				}
				
				String s = label[0].getText();
				
				boolean flag = false;
				for(int i=1; i<label.length; i++) {
					String text = label[i].getText();
					if(!text.equals(s)) { flag = false; break; }
					else  flag = true;
				}
				
				if(flag== true) result.setText("축하합니다!!!");
				else result.setText("아쉽군요"); 
			}
		}
	}
	
	
	public static void main(String[] args) {
		new GamePanel();
	}

}
