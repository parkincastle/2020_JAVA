package lesson;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

class Ex2 extends JFrame{
	
    Ex2(){
        this.setTitle("��! ��ư ���߱�!!!"); // �̸�
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout()); //���̺� ����
        
        JCheckBox cb = new JCheckBox("��ư ��Ȱ��ȭ"); // üũ�ڽ� ����
        JCheckBox cb1 = new JCheckBox("��ư ���߱�"); // üũ�ڽ� ����
        JButton btn = new JButton("test button"); // ��ư ����
        
        cb.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED) // ��ư ��Ȱ��ȭ üũ�ڽ��� ���É��� ���
                    btn.setEnabled(false); // ��Ȱ��ȭ
                else
                    btn.setEnabled(true); // Ȱ��ȭ
            }
        });
        cb1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED) // ��ư ���߱� üũ�ڽ��� ���É��� ���
                    btn.setVisible(false); // ��Ȱ��ȭ
                else
                    btn.setVisible(true); // Ȱ��ȭ
            } 
        });
        
        this.add(cb);
        this.add(cb1);
        this.add(btn);
        this.setSize(300,200); // window â ũ�� ����
        this.setVisible(true); // 
    }
}
public class Ex1 {

    public static void main(String[] args) {
        new Ex2();
    }
    
}


