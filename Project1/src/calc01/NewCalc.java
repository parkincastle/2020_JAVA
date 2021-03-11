package calc01;

import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class NewCalc extends JFrame {

	// ��� Ŭ�������� ������ �� �ְ� ���������� ����
	// JLabel : ���� ��Ȳ �� ���� ����� �˷��ش�.
	static JLabel label;
	static JLabel info;
	static int flag = 0;
	static int check = 0;
	JPanel jpButton, jpResult; // �г� �ʱ�ȭ
	JMenuBar jmb; // �޴��� �ʱ�ȭ
	JMenu jmEdit, jmHelp; // �޴� �ʱ�ȭ
	JMenuItem mCopy, mPaste, mHelp, mInfo; // �޴� ������ �ʱ�ȭ
	JLabel jlbResult1, jlbResult2; // ���̺� �ʱ�ȭ
	JButton[] jbButton = null; // ��ư�迭 �ʱ�ȭ
	String result="";
	String result1="";
	String result2="";
	String number[] = {" ", " ", " "};	

	public NewCalc() {
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
		c.setBackground(Color.LIGHT_GRAY);

		// BorderLayout���� ��ġ ������ ����, �� ��ġ�� JPanel����
		NorthPanel NP = new NorthPanel();
		c.add(NP, BorderLayout.EAST);

		CenterPanel CP = new CenterPanel();
		c.add(CP, BorderLayout.SOUTH);

		setSize(350, 500);
		setVisible(true);
	}

	class NorthPanel extends JPanel {
		public NorthPanel() {

			// JLabel�� ������ NorthPanel
			// ������� ����� ��Ÿ���� ���� GridLayout���� ����
			setLayout(new GridLayout(3, 1));
			setBackground(Color.LIGHT_GRAY);

			// ��Ȳ�� �˷��ִ� JLabel
			info = new JLabel("���� �Է��ϼ��� ");

			// ��������� �˷��ִ� JLabel
			label = new JLabel("");

			info.setFont(new Font("���� ���", 0, 20));
			info.setBackground(Color.LIGHT_GRAY);
			info.setForeground(Color.WHITE);
			info.setHorizontalAlignment(SwingConstants.RIGHT);

			label.setFont(new Font("���� ���", 0, 40));
			label.setBackground(Color.LIGHT_GRAY);
			label.setForeground(Color.WHITE);
			label.setHorizontalAlignment(SwingConstants.RIGHT);

			add(info);
			add(label);
			label.addMouseListener(new MyMouse());
		}
	}

	public class MyMouse extends MouseAdapter {

		// ���� ���� �� ����� �����ִ� label�� ������ �̺�Ʈ ������
		public void mousePressed(MouseEvent e) {
			if (e.getClickCount() == 0) {
				flag = 0;
				label.setText("");
				info.setText("���� �Է��ϼ��� ");
			}
		}
	}

	class CenterPanel extends JPanel {
		public CenterPanel() {
			
			

			// �迭�� JButton����
			JButton[] bt = new JButton[20];
			setBackground(Color.LIGHT_GRAY);
			// GridLayout ����Ͽ� ������ ũ��� ����
			setLayout(new GridLayout(5, 4, 3, 3));

			bt[0] = new JButton("��");
			bt[1] = new JButton("CE");
			bt[2] = new JButton("C");
			bt[3] = new JButton("��");

			bt[4] = new JButton("7");
			bt[5] = new JButton("8");
			bt[6] = new JButton("9");
			bt[7] = new JButton("��");

			bt[8] = new JButton("4");
			bt[9] = new JButton("5");
			bt[10] = new JButton("6");
			bt[11] = new JButton("-");

			bt[12] = new JButton("1");
			bt[13] = new JButton("2");
			bt[14] = new JButton("3");
			bt[15] = new JButton("+");
			
			bt[16] = new JButton("0");
			bt[17] = new JButton("00");
			bt[18] = new JButton(".");
			bt[19] = new JButton("=");


			for (int i = 0; i < 20; i++) {

				bt[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						// ���ڹ�ư Ŭ�� �� ���� �ؽ�Ʈ�� ��ư �ؽ�Ʈ ���� ���̱�
						if (flag == 0) {
							JButton b = (JButton) e.getSource();
							String oldtext = label.getText();
							String text = b.getText();
							String newtext = oldtext + text;

							// �ؽ�Ʈ ���̿� ���� ���� ũ�� ����
							int n = newtext.length();
							
							if (n <= 10)
								label.setFont(new Font("���� ���", 100, 40));
							else if (n > 10)
								label.setFont(new Font("���� ���", 0, 30));
							else if(n <= 20)
								label.setFont(new Font("���� ���", 0, 20));
							else if(n > 20)
								label.setFont(new Font("���� ���", 0, 20));

							// �ؽ�Ʈ ���� 30 �ʰ��� �߰��Է� �Ұ�
							if (n <= 30) {
								label.setText(newtext);
								info.setText("������ ��� ���Դϴ� ");
							} else if (n > 30)
								info.setText("�Է� ������ ������ �ʰ��Ͽ����ϴ� ");
						}
					}
				});
				
				// ���� ��ư ������ ����
				if (i % 4 != 3 && i < 19) {
					bt[i].setFont(new Font("���� ���", 0, 23));
					bt[i].setBackground(Color.WHITE);
					bt[i].setForeground(Color.BLACK);
					add(bt[i]);
						
				

					
				}
				else if(i < 20) {
					bt[i].setFont(new Font("���� ���", 0, 23));
					bt[i].setBackground(Color.ORANGE);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
				}
				
				//'c' ��ư ������ ����
				else if (i == 2 || i == 19) {
					bt[i].setFont(new Font("���� ���", 0, 23));
					bt[i].setBackground(Color.LIGHT_GRAY);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);

					bt[12].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							int n = label.getText().length() - 1;
							
							try {
								if (n == 0) {
									label.setText("");
									info.setText("������ �Է��ϼ��� ");
									flag = 0;
								} 
								else if (n > 0 && n <= 10) {
									label.setFont(new Font("���� ���", 0, 40));
									label.setText(label.getText().substring(0, n));
									info.setText("������ ����� ���Դϴ� ");
								} 
								else {
									label.setFont(new Font("���� ���", 0, 35));
									label.setText(label.getText().substring(0, n));
									info.setText("������ ����� ���Դϴ� ");
								}
							} catch (Exception e1) {
								System.out.println("������ ���ڰ� �����ϴ�.");
							}
						}
					});

					bt[19].addActionListener(new CalcListener());
				}

				else if (i % 4 == 3) {
					bt[i].setFont(new Font("���� ���", 0, 40));
					bt[i].setBackground(new Color(234, 150, 72));
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
					bt[i].addActionListener(new MyListener());
				}

				else if (i == 13) {
					bt[i].setFont(new Font("���� ���", 0, 30));
					bt[i].setBackground(Color.GRAY);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
					bt[i].addActionListener(new MyListener());
				}
			}
		}
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			int n = label.getText().length();
			Character c = label.getText().charAt(n - 1);
			if (flag == 0 && c != '+' && c != '-' && c != '��' && c != '��') {
				String oldtext = label.getText();
				String text = b.getText();
				String newtext = oldtext + text;
				label.setText(newtext);
				info.setText("������ ��� ���Դϴ� ");
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String txtButton = e.getActionCommand();

		if(txtButton.equals("1") || txtButton.equals("2") || txtButton.equals("3") || txtButton.equals("4") || txtButton.equals("5") || txtButton.equals("6")
				|| txtButton.equals("7") || txtButton.equals("8") || txtButton.equals("9")) {
			if(result2.equals("0")) {
				result2="";
			}
			result2+=txtButton;
			jlbResult2.setText(result2);
		} else if(txtButton.equals("��")) {
			int len = jlbResult2.getText().length();
			if(len==1) {
				result2 = "";
				jlbResult2.setText("0");
			} else {
				if(!"".equals(result2)) {
					result2 = result2.substring(0, len-1);
					jlbResult2.setText(result2);
				}
			}
		} else if(txtButton.equals("CE")) {
			result2 = "";
			result="";
			jlbResult2.setText("0");
			number[0] = "0";
		} else if(txtButton.equals("C")) {
			result="";
			result1="";
			result2="";
			jlbResult1.setText("");
			jlbResult2.setText("0");
			number[0] = " ";
			number[1] = " ";
			number[2] = " ";
		} else if(txtButton.equals("0") || txtButton.equals("00")) {
			if(!("".equals(result2))) {
				if(!"0".equals(result2)){
					result2+=txtButton;
					jlbResult2.setText(result2);
				}
			} else {
				result2 = "0";
			}
		} else if(txtButton.equals(".")) {
			if("".equals(result2)) {
				result2="0"+txtButton;
			} else {
				if(result2.indexOf(".")==-1) {
					result2 += txtButton;
				}
			}
			jlbResult2.setText(result2);
		} else if(txtButton.equals("=")) {
			if(!"".equals(result2)) {
				number[2] = result2;
			}
			if("".equals(result1)) {
				if(!number[1].equals(" ")) {
					result = Cal();
					if("0���� ���� �� �����ϴ�.".equals(result)) {
						result="";
						result1="";
						result2 = "";
						number[0] = " ";
						number[1] = " ";
						number[2] = " ";
					} else {
						number[0] = result;
						jlbResult2.setText(result);
					}
				}
				jlbResult1.setText(result1);
			} else {
				if(" ".equals(number[2])) {
					number[2] = result2;
				}
				result = number[0];
		
				if("0���� ���� �� �����ϴ�.".equals(result)) {
					jlbResult2.setText(result);
					result="";
					result1="";
					result2 = "";
					number[0] = " ";
					number[1] = " ";
					number[2] = " ";
				} else {
					result = Cal();
					
					if(!"0���� ���� �� �����ϴ�.".equals(result)) {
						result1 = "";
						number[0] = result;
						jlbResult2.setText(result);
						jlbResult1.setText(result1);
						result2 = "";
					} else {
						jlbResult2.setText("0���� ���� �� �����ϴ�.");
						jlbResult1.setText("");
						result="";
						result1="";
						result2 = "";
						number[0] = " ";
						number[1] = " ";
						number[2] = " ";
					}
					System.out.println("?");
				}
			}
		} else if(txtButton.equals("��") || txtButton.equals("��") || txtButton.equals("-") || txtButton.equals("+")) {
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

			} else {
				result2 = "";	
				jlbResult1.setText(result1);
			}

		}
	}

	public class CalcListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = label.getText();
			double result = Calculator(s);
			label.setFont(new Font("���� ���", 0, 40));

			if (result < 0) {
				info.setText("��� ������ ��길 �� �� �ֽ��ϴ� ");
				label.setText(Double.toString(result));
				flag = 1;
			}
			if (result >= 100000000) {
				info.setText("100,000,000 �̸��� ������ ����� �� �ֽ��ϴ� ");
				label.setText("0.0");
			} else
				label.setText(Double.toString(result));
		}

		private double Calculator(String s) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	public String Cal() {
		String num = "";
		String testNum1 = "";
		String testNum2 = "";

		if(number[0].indexOf(".")!=-1) {
			int index1 = number[0].indexOf(".");

			testNum1 = number[0].substring(index1, number[0].length());

			if(testNum1.replaceAll("0", "").equals(".")){
				number[0] = number[0].substring(0, index1);
			}
		}

		if(number[2].indexOf(".")!=-1) {
			int index2 = number[2].indexOf(".");

			testNum2 = number[2].substring(index2, number[2].length());

			if(testNum2.replaceAll("0", "").equals(".")){
				number[2] = number[2].substring(0, index2);
			}
		}
		if(number[1].equals("��")) {
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) {
				num = (Double.parseDouble(number[0]) * Double.parseDouble(number[2])) + "";
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
		} else if(number[1].equals("+")) {
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) {
				num = (Double.parseDouble(number[0]) + Double.parseDouble(number[2])) + "";
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
		} else if(number[1].equals("-")) {
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) {
				num = (Double.parseDouble(number[0]) - Double.parseDouble(number[2])) + "";
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
		} else if(number[1].equals("��")) {
			number[2].trim();
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) {
				num = (Double.parseDouble(number[0]) / Double.parseDouble(number[2])) + "";
			} else {
				if(number[2].equals("0")) {
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
		new NewCalc();
	}
}