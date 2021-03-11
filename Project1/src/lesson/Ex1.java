package lesson;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

class Ex2 extends JFrame{
	
    Ex2(){
        this.setTitle("와! 버튼 감추기!!!"); // 이름
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout()); //레이블 생성
        
        JCheckBox cb = new JCheckBox("버튼 비활성화"); // 체크박스 생성
        JCheckBox cb1 = new JCheckBox("버튼 감추기"); // 체크박스 생성
        JButton btn = new JButton("test button"); // 버튼 생성
        
        cb.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED) // 버튼 비활성화 체크박스가 선택됬을 경우
                    btn.setEnabled(false); // 비활성화
                else
                    btn.setEnabled(true); // 활성화
            }
        });
        cb1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED) // 버튼 감추기 체크박스가 선택됬을 경우
                    btn.setVisible(false); // 비활성화
                else
                    btn.setVisible(true); // 활성화
            } 
        });
        
        this.add(cb);
        this.add(cb1);
        this.add(btn);
        this.setSize(300,200); // window 창 크기 설정
        this.setVisible(true); // 
    }
}
public class Ex1 {

    public static void main(String[] args) {
        new Ex2();
    }
    
}


