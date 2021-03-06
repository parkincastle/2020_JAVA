package calc01;

import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calc extends JFrame {

	// 모든 클래스에서 공유할 수 있게 전역변수로 선언
	// JLabel : 현재 상황 및 연산 결과를 알려준다.
	static JLabel label;
	static JLabel info;
	static int flag = 0;
	static int check = 0;

	public Calc() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
		c.setBackground(Color.LIGHT_GRAY);

		// BorderLayout으로 배치 관리자 설정, 각 위치에 JPanel부착
		NorthPanel NP = new NorthPanel();
		c.add(NP, BorderLayout.EAST);

		CenterPanel CP = new CenterPanel();
		c.add(CP, BorderLayout.SOUTH);

		setSize(350, 500);
		setVisible(true);
	}

	class NorthPanel extends JPanel {
		public NorthPanel() {

			// JLabel로 구성된 NorthPanel
			// 계산결과를 가운데에 나타내기 위헤 GridLayout으로 설정
			setLayout(new GridLayout(3, 1));
			setBackground(Color.LIGHT_GRAY);

			// 상황을 알려주는 JLabel
			info = new JLabel("값을 입력하세요 ");

			// 연산과정을 알려주는 JLabel
			label = new JLabel("");

			info.setFont(new Font("맑은 고딕", 0, 20));
			info.setBackground(Color.LIGHT_GRAY);
			info.setForeground(Color.WHITE);
			info.setHorizontalAlignment(SwingConstants.RIGHT);

			label.setFont(new Font("맑은 고딕", 0, 40));
			label.setBackground(Color.LIGHT_GRAY);
			label.setForeground(Color.WHITE);
			label.setHorizontalAlignment(SwingConstants.RIGHT);

			add(info);
			add(label);
			label.addMouseListener(new MyMouse());
		}
	}

	public class MyMouse extends MouseAdapter {

		// 연산 과정 및 결과를 보여주는 label에 부착된 이벤트 리스너
		public void mousePressed(MouseEvent e) {
			if (e.getClickCount() == 0) {
				flag = 0;
				label.setText("");
				info.setText("값을 입력하세요 ");
			}
		}
	}

	class CenterPanel extends JPanel {
		public CenterPanel() {
			
			

			// 배열로 JButton선언
			JButton[] bt = new JButton[20];
			setBackground(Color.LIGHT_GRAY);
			// GridLayout 사용하여 동일한 크기로 설정
			setLayout(new GridLayout(5, 4, 3, 3));

			bt[0] = new JButton("←");
			bt[1] = new JButton("CE");
			bt[2] = new JButton("C");
			bt[3] = new JButton("÷");

			bt[4] = new JButton("7");
			bt[5] = new JButton("8");
			bt[6] = new JButton("9");
			bt[7] = new JButton("×");

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

						// 숫자버튼 클릭 시 기존 텍스트에 버튼 텍스트 새로 붙이기
						if (flag == 0) {
							JButton b = (JButton) e.getSource();
							String oldtext = label.getText();
							String text = b.getText();
							String newtext = oldtext + text;

							// 텍스트 길이에 따라 글자 크기 조절
							int n = newtext.length();
							
							if (n <= 10)
								label.setFont(new Font("맑은 고딕", 100, 40));
							else if (n > 10)
								label.setFont(new Font("맑은 고딕", 0, 30));
							else if(n <= 20)
								label.setFont(new Font("맑은 고딕", 0, 20));
							else if(n > 20)
								label.setFont(new Font("맑은 고딕", 0, 20));

							// 텍스트 길이 30 초과시 추가입력 불가
							if (n <= 30) {
								label.setText(newtext);
								info.setText("수식을 계산 중입니다 ");
							} else if (n > 30)
								info.setText("입력 가능한 범위를 초과하였습니다 ");
						}
					}
				});
				
				// 숫자 버튼 디자인 설정
				if (i % 4 != 3 && i < 19) {
					bt[i].setFont(new Font("맑은 고딕", 0, 23));
					bt[i].setBackground(Color.WHITE);
					bt[i].setForeground(Color.BLACK);
					add(bt[i]);
						
				

					
				}
				else if(i < 20) {
					bt[i].setFont(new Font("맑은 고딕", 0, 23));
					bt[i].setBackground(Color.ORANGE);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
				}
				
				//'c' 버튼 디자인 설정
				else if (i == 2 || i == 19) {
					bt[i].setFont(new Font("맑은 고딕", 0, 23));
					bt[i].setBackground(Color.LIGHT_GRAY);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);

					bt[12].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							int n = label.getText().length() - 1;
							
							try {
								if (n == 0) {
									label.setText("");
									info.setText("수식을 입력하세요 ");
									flag = 0;
								} 
								else if (n > 0 && n <= 10) {
									label.setFont(new Font("맑은 고딕", 0, 40));
									label.setText(label.getText().substring(0, n));
									info.setText("수식을 지우는 중입니다 ");
								} 
								else {
									label.setFont(new Font("맑은 고딕", 0, 35));
									label.setText(label.getText().substring(0, n));
									info.setText("수식을 지우는 중입니다 ");
								}
							} catch (Exception e1) {
								System.out.println("삭제할 숫자가 없습니다.");
							}
						}
					});

					bt[19].addActionListener(new CalcListener());
				}

				else if (i % 4 == 3) {
					bt[i].setFont(new Font("맑은 고딕", 0, 40));
					bt[i].setBackground(new Color(234, 150, 72));
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
					bt[i].addActionListener(new MyListener());
				}

				else if (i == 13) {
					bt[i].setFont(new Font("맑은 고딕", 0, 30));
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
			if (flag == 0 && c != '+' && c != '-' && c != '×' && c != '÷') {
				String oldtext = label.getText();
				String text = b.getText();
				String newtext = oldtext + text;
				label.setText(newtext);
				info.setText("수식을 계산 중입니다 ");
			}
		}
	}

	public class CalcListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = label.getText();
			double result = Calculator(s);
			label.setFont(new Font("맑은 고딕", 0, 40));

			if (result < 0) {
				info.setText("양수 범위의 계산만 할 수 있습니다 ");
				label.setText(Double.toString(result));
				flag = 1;
			}
			if (result >= 100000000) {
				info.setText("100,000,000 미만의 범위만 계산할 수 있습니다 ");
				label.setText("0.0");
			} else
				label.setText(Double.toString(result));
		}
	}

	public double Calculator(String ss) {
		int i;
		double ans;
		check = 0;
		ArrayList<Double> v = new ArrayList<Double>();
		ArrayList<String> op = new ArrayList<String>();

		op.add(null);
		String str = new String("");
		for (i = 0; i < ss.length(); i++) {
			Character c = ss.charAt(i);
			String s = Character.toString(c);

			if (Character.isDigit(c)) {
				str += Character.toString(c);
				if (i == ss.length() - 1)
					v.add(Double.parseDouble(str));
			} else if (s.equals("."))
				str += s;
			else {
				v.add(Double.parseDouble(str));
				op.add(Character.toString(c));
				str = "";
			}
		}

//		for(i = 0; i < v.size(); i++) {
//			if (v.get(i) >= 1000000000) {
//				check = 1;		
//				info.setText("100,000,000 미만의 수끼리만 계산할 수 있습니다 ");
//				break;
//			}
//		}

		if (check == 0) {
			for (i = 1; i < v.size(); i++) {
				String s = op.get(i);
				double tmp;

				if (s.equals("×")) {
					tmp = v.get(i - 1) * v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i - 1);
					v.add(i - 1, tmp);
					i--;
				} else if (s.equals("÷")) {
					tmp = v.get(i - 1) / v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i - 1);
					v.add(i - 1, tmp);
					i--;
				}
			}

			ans = v.get(0);
			for (i = 1; i < v.size(); i++) {
				String s = op.get(i);
				double n = v.get(i);

				if (s.compareTo("+") == 0)
					ans = ans + n;
				else if (s.compareTo("-") == 0)
					ans = ans - n;
			}

			return ans;
		}

		return 0;
	}

	public static void main(String[] args) {
		new Calc();
	}
}