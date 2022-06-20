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
		setTitle("Open Challenge 10"); //프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //프레임 종료버튼이 클릭되면 응용프로그램을 종료
		add(new GamePanelNew());  // GamePanelNew 생성자로 생성, 추가
		setSize(500,500);  //프레임 크기 500x500
		setVisible(true);  //프레임 출력
	}
	
	class GamePanelNew extends JPanel {
		public GamePanelNew() {

			this.setLayout(null); 	// 배치관리자 없애기
			this.addKeyListener(new MyKeyListener());  // 키 리스너 생성 및 등록
			
			// JLabel을 배열로 3개 만들기
			label[0] = new JLabel();
			label[1] = new JLabel();
			label[2] = new JLabel();
			
			// JLabel 설정
			for(int i=0; i<label.length; i++) {
				this.add(label[i]);				// 컨텐트 팬에 라벨 붙이기 
				label[i].setSize(100, 50);	// 라벨의 사이즈
				label[i].setLocation((50*(i+1))+(100*i)-8,50);	// 라벨의 위치 좌표
				label[i].setOpaque(true); // 글자 라벨지의 투명도. 
				label[i].setBackground(Color.PINK); // 배경색
				label[i].setText("0"); 	//텍스트내용을 0으로 설정
				label[i].setFont(new Font("Ariel", Font.PLAIN, 34));  //폰트 설정
			}
			
			result.setSize(100, 100);		//result의 사이즈 설정
			result.setLocation(200, 350);   //result의 위치 설정
			this.add(result); 				//result 추가
			
			
			//컴포넌트에 포커스 설정 방법
			this.setFocusable(true);
			this.requestFocus();
		}
	}
	
	class MyKeyListener extends KeyAdapter {
		//키가 눌릴때
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '\n') {
				for(int i=0; i<label.length; i++) {
					int x = (int)(Math.random()*5);       //0부터 4까지 랜덤 숫자 생성
					label[i].setText(String.valueOf(x));  //라벨의 텍스트에 랜덤숫자 작성
				}
				
				String s = label[0].getText();			  //첫번째 라벨의 텍스트 내용 가져오기
				
				boolean flag = false;					  
				for(int i=1; i<label.length; i++) {		  // label의 길이만큼 반복 
					String text = label[i].getText();	  // i번째 라벨의 텍스트 가져오기
					if(!text.equals(s)) { flag = false; break; } 	// i번째 라벨의 텍스트가 s랑 같으면 flag는 false
					else  flag = true;		// 같지 않으면 true
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
