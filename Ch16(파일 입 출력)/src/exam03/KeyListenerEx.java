package exam03;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerEx extends JFrame{
	
	public KeyListenerEx(){
		KeyPanel p = new KeyPanel();
		setContentPane(p);
		
		setSize(300, 300);
		setVisible(true);
		p.requestFocus();
	}
	
	class KeyPanel extends JPanel{
		JLabel la = new JLabel("키값이 입력될 위치");
				
		public KeyPanel() {
			add(la);
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					String s = e.getKeyText(e.getKeyCode());
					la.setText(s + " 가 눌렸습니다.");
				}
			});
		}
		
	}
	
	public static void main(String[] args) {
		
		new KeyListenerEx();
		
	}

}
