package calc01;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


@SuppressWarnings("serial") // Warnning ����
public class Calculator extends JFrame implements ActionListener {
	JPanel jpButton, jpResult; // �г� �ʱ�ȭ
	JMenuBar jmb; // �޴��� �ʱ�ȭ
	JMenu jmEdit, jmHelp; // �޴� �ʱ�ȭ
	JMenuItem mCopy, mPaste, mHelp, mInfo; // �޴� ������ �ʱ�ȭ
	JLabel jlbResult1, jlbResult2; // ���̺� �ʱ�ȭ
	JButton[] jbButton = null; // ��ư�迭 �ʱ�ȭ
	String result=""; 
	String result1=""; // ��� 1 ����
	String result2=""; // ��� 2 ����
	String number[] = {" ", " ", " "}; // ���� ���� ���� ����	
	String[] numStr = {
			"��", "CE", "C", "��",
			"7", "8", "9", "��",
			"4", "5", "6", "-",
			"1", "2", "3", "+",
			"0", "00", ".", "=" }; // ��ư�� ����

	public Calculator(){
		super("����"); // Ÿ��Ʋ ��
		getContentPane().setLayout(new BorderLayout()); // ��ü ���̾ƿ��� BorderLayout

		// ���̺� ���� 
		jpResult = new JPanel(new GridLayout(3,2)); // jpResult��� �гο� GrideLayot�� ����, 3 x 2
		jpResult.setBackground(Color.WHITE); // jpResult��� �гο� ��� ������� 
		jlbResult1 = new JLabel("", JLabel.RIGHT); // jlbResult1��� �� ���� ���̺�, ��������
		jlbResult2 = new JLabel("0", JLabel.RIGHT); // jlbResult2��� �⺻�� 0�� ���̺�, ��������
		jlbResult2.setFont(new Font("���� ���", Font.BOLD, 35)); // jlbResult2 ���̺� ��Ʈ�� ���� ���, ���ϰ�, ũ��35 ����

		jpResult.add(jlbResult1); // jpResult �гο� jlbResult1 ���̺� �߰�
		jpResult.add(jlbResult2); // jpResult �гο� jlbResult2 ���̺� �߰�
		jlbResult1.setFont(new Font("���� ���", 0, 20));
		jlbResult2.setFont(new Font("���� ���", 0, 40));
		// ���̺� �� 

		// ��ư ���� 
		jpButton = new JPanel(new GridLayout(5, 4, 2, 2)); // jpButton��� �г�, GridLayout����, 5 x 2, ������ ���μ��� 2��
		jpButton.setBackground(Color.WHITE); // jpButton �г� ����� ���
		jbButton = new JButton[numStr.length]; // jbButton ��ư �迭 �ʱ�ȭ

		// jbButton�� ǥ���� ���� ����
		for(int i=0; i<numStr.length; i++) {
			jbButton[i] = new JButton(numStr[i]); // for���� ����Ͽ� ��ư�� �ϳ��ϳ� �����Ͽ� ���� ����
			jbButton[i].setFont(new Font("���� ���", Font.BOLD, 20)); // ��ư �ȿ� ��Ʈ�� ���� ���, ���ϰ�, ũ��35 ����
			jpButton.add(jbButton[i]);
			jbButton[i].addActionListener(this); // �̺�Ʈ ���
		}

		// ��ư �� ����
		for(int j=0; j<numStr.length; j++) {
			if(j < 3) { // ��, CE, C ��ư ������ ����
				jbButton[j].setBackground(Color.LIGHT_GRAY);
			}else if(j==3 || j==7 || j==11 || j==15) { // ��, ��, -, + ��ư ������ ����
				jbButton[j].setBackground(Color.LIGHT_GRAY);
			}else if(j>=4 && j%4 != 3) { // ������ ���� ��ư ������ ����
				jbButton[j].setBackground(Color.WHITE);
			}else if(j == 19) { // = ��ư ������ ����
				jbButton[j].setBackground(Color.PINK);
			}	
		}
		
		// ������ â(GUI) �⺻ ����
		getContentPane().add("North", jpResult);
		getContentPane().add("Center", jpButton);
		setSize(350, 500); // â ũ�� ����
		getContentPane().setBackground(Color.WHITE); // ���ȭ�� ������� ����
		setResizable(false); // â ũ�⸦ ������ �� �������ϱ�
		setVisible(true); // â�� ȭ�鿡 ��Ÿ�� ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ â ����� ���μ��� ����
	}

	// ��ư �̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String txtButton = e.getActionCommand();

		if(txtButton.equals("1") || txtButton.equals("2") || txtButton.equals("3") 
				|| txtButton.equals("4") || txtButton.equals("5") || txtButton.equals("6")
				|| txtButton.equals("7") || txtButton.equals("8") || txtButton.equals("9")) { // ���� ��ư�� ��������
			if(result2.equals("0")) {
				result2="";
			}
			result2+=txtButton;
			jlbResult2.setText(result2);
		} else if(txtButton.equals("��")) { // �ϳ� �� ����
			int len = jlbResult2.getText().length();
			if(len==1) { // �Էµ� ���ڰ� �ϳ��� ���
				result2 = "";
				jlbResult2.setText("0");
			} else { // �Էµ� ���ڰ� ������ �� ���
				if(!"".equals(result2)) { // 
					result2 = result2.substring(0, len-1);
					jlbResult2.setText(result2);
				}
			}
		} else if(txtButton.equals("CE")) { // ��� �� ����
			result2 = "";
			result="";
			jlbResult2.setText("0");
			number[0] = "0";
		} else if(txtButton.equals("C")) { // ��ü ����
			result="";
			result1="";
			result2="";
			jlbResult1.setText("");
			jlbResult2.setText("0");
			number[0] = " ";
			number[1] = " ";
			number[2] = " ";
		} else if(txtButton.equals("0") || txtButton.equals("00")) {
			if(!("".equals(result2))) { // �Է°��� 00 �϶� 00�״�� ���
				if(!"0".equals(result2)){
					result2+=txtButton;
					jlbResult2.setText(result2);
				}
			} else { // �Է°��� 0 �϶� 0�״�� ���
				result2 = "0";
			}
		} else if(txtButton.equals(".")) { // .��ư�� ������ �� 
			if("".equals(result2)) { // �� ���ڰ� ���� ���
				result2="0"+txtButton;
			} else {
				if(result2.indexOf(".")==-1) { // �� ����(result2)�� �Ҽ����� ���� ���
					result2 += txtButton;
				}
			}
			jlbResult2.setText(result2);
		} else if(txtButton.equals("=")) { // = ��ư�� ��������
			if(!"".equals(result2)) { // �տ� ������ ���� ���
				number[2] = result2;
			}
			if("".equals(result1)) { // �տ� ���ڰ� ���� �� 
				if(!number[1].equals(" ")) {
					result = Cal();
					if("0���� ���� �� �����ϴ�.".equals(result)) {
						result="";       //
						result1="";      //
						result2 = "";    // �ʱ�ȭ
						number[0] = " "; //
						number[1] = " "; //
						number[2] = " "; //
					} else {
						number[0] = result;
						jlbResult2.setText(result); // �ؽ�Ʈ ���
					}
				}
				jlbResult1.setText(result1); // �ؽ�Ʈ ���
			} else { //���ڰ� ���� ���
				if(" ".equals(number[2])) {
					number[2] = result2;
				}
				result = number[0];
		
				if("0���� ���� �� �����ϴ�.".equals(result)) {
					jlbResult2.setText(result);
					result="";       //
					result1="";      //
					result2 = "";    // �ʱ�ȭ
					number[0] = " "; // 
					number[1] = " "; //
					number[2] = " "; //
				} else {
					result = Cal(); // ���޼��� ����
					
					if(!"0���� ���� �� �����ϴ�.".equals(result)) { 
						result1 = "";
						number[0] = result;
						jlbResult2.setText(result);
						jlbResult1.setText(result1);
						result2 = "";
					} else {
						jlbResult2.setText("0���� ���� �� �����ϴ�.");
						jlbResult1.setText("");
						result="";		 //
						result1="";		 //
						result2 = "";	 //
						number[0] = " "; //�ʱ�ȭ
						number[1] = " "; //
						number[2] = " "; //
					}
					System.out.println("?");
				}
			}
		} else if(txtButton.equals("��") || txtButton.equals("��") || txtButton.equals("-") || txtButton.equals("+")) { // ��Ģ ���� ��ư�� Ŭ������ ���
			if("".equals(result1)) {
				if("".equals(result2)) {
					if("".equals(result)) {
						result1 = "0" + txtButton;
						number[0] = "0";
					} else {
						result1 = result + txtButton;
					}
				} else {
					if(!"".equals(result)) {
						result1 = result + txtButton; 
					}
					result1 = result2 + txtButton;
					number[0] = result2;
				}
				number[1] = txtButton;
			} else {
				if("".equals(result2)) {
					result1 = result1.substring(0, result1.length()-1) + txtButton;
					number[1] = txtButton;
				} else {
					result1 += result2 + txtButton;
					number[2] = result2;
					result = Cal();
					number[1] = txtButton;
					jlbResult2.setText(result);
					number[0] = result;
				}
			}
			if(number[1].equals("��") && (number[2].equals(" 0") || number[2].equals("0"))) {
				result = "0���� ������ �����ϴ�";
				
			} else {
				result2 = "";	
				jlbResult1.setText(result1);
			}

		}
	}

	// ��� �޼ҵ�  
	public String Cal() {
		String num = "";
		String testNum1 = "";
		String testNum2 = "";

		if(number[0].indexOf(".")!=-1) { // ���ںκп� �Ҽ����� ���� ��
			int index1 = number[0].indexOf("."); //index1�� �ڿ��� ���� ���� ����

			testNum1 = number[0].substring(index1, number[0].length()); //�Էµ� ��ü���� ���� ����

			if(testNum1.replaceAll("0", "").equals(".")){ // 
				number[0] = number[0].substring(0, index1); // 
			}
		}

		if(number[2].indexOf(".")!=-1) { // 
			int index2 = number[2].indexOf(".");

			testNum2 = number[2].substring(index2, number[2].length());

			if(testNum2.replaceAll("0", "").equals(".")){
				number[2] = number[2].substring(0, index2);
			}
		}
		if(number[1].equals("��")) { // ���ϱ� ��ư �̺�Ʈ
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) { // �Ҽ����� ���� ���
				num = (Double.parseDouble(number[0]) * Double.parseDouble(number[2])) + ""; // �� ��ȯ��  ����ѵ� ���ڿ��� ����
			} else {
				if("".equals(number[2])){
					num = result2;
				} else {
					if(!"".equals(result)) {
						number[0] = result;
					}
					num = (Long.parseLong(number[0]) * Long.parseLong(number[2])) + "";
					result = num;
					number[0] = result;
				}
			}
		} else if(number[1].equals("+")) { // ���ϱ� ��ư �̺�Ʈ
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) { // �Ҽ����� ���� ���
				num = (Double.parseDouble(number[0]) + Double.parseDouble(number[2])) + ""; // �� ��ȯ�� ����ѵ� ���ڿ��� ����
			} else {
				if("".equals(number[2])){
					num = result2;
				} else {
					if(!"".equals(result)) {
						number[0] = result;
					}
					num = (Long.parseLong(number[0]) + Long.parseLong(number[2])) + "";
					result = num;
					number[0] = result;
				}
			}
		} else if(number[1].equals("-")) { // ���� ��ư �̺�Ʈ
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) { // �Ҽ����� ���� ���
				num = (Double.parseDouble(number[0]) - Double.parseDouble(number[2])) + ""; // �� ��ȯ��  ����ѵ� ���ڿ��� ����
			} else {
				if("".equals(number[2])){
					num = result2;
				} else {
					if(!"".equals(result)) {
						number[0] = result;
					}
					num = (Long.parseLong(number[0]) - Long.parseLong(number[2])) + "";
					result = num;
					number[0] = result;
				}
			}
		} else if(number[1].equals("��")) { // ������ ��ư �̺�Ʈ
			number[2].trim(); // ���ڿ� ��������
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) { // ���ڿ� �Ҽ����� �־
				num = (Double.parseDouble(number[0]) / Double.parseDouble(number[2])) + ""; //  // �� ��ȯ��  ����ѵ� ���ڿ��� ����
			} else {
				if(number[2].equals("0")) { // 0�� ���� ���
					num = "0���� ���� �� �����ϴ�.";
					result2 = "";
				} else {
					if("".equals(number[2])){
						num = result2;
					} else {
						if(!"".equals(result)) {
							number[0] = result;
						}
						num = (Double.parseDouble(number[0]) / Double.parseDouble(number[2])) + "";

						if(num.indexOf(".")!=-1) {
							int index3 = num.indexOf(".");
							String testNum3 = num.substring(index3, num.length());
							if(testNum3.replaceAll("0", "").equals(".")){
								num = num.substring(0, index3);
							}
						}
						result = num;
						number[0] = result;
					}
				}
			}
		}
		return num;
	} 

	public static void main(String[] args) {
		new Calculator();
	}
}
