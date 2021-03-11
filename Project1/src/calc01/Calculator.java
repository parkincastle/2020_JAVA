package calc01;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


@SuppressWarnings("serial") // Warnning 무시
public class Calculator extends JFrame implements ActionListener {
	JPanel jpButton, jpResult; // 패널 초기화
	JMenuBar jmb; // 메뉴바 초기화
	JMenu jmEdit, jmHelp; // 메뉴 초기화
	JMenuItem mCopy, mPaste, mHelp, mInfo; // 메뉴 아이템 초기화
	JLabel jlbResult1, jlbResult2; // 레이블 초기화
	JButton[] jbButton = null; // 버튼배열 초기화
	String result=""; 
	String result1=""; // 출력 1 변수
	String result2=""; // 출력 2 변수
	String number[] = {" ", " ", " "}; // 계산부 에서 쓰일 변수	
	String[] numStr = {
			"←", "CE", "C", "÷",
			"7", "8", "9", "×",
			"4", "5", "6", "-",
			"1", "2", "3", "+",
			"0", "00", ".", "=" }; // 버튼값 지정

	public Calculator(){
		super("계산기"); // 타이틀 바
		getContentPane().setLayout(new BorderLayout()); // 전체 레이아웃을 BorderLayout

		// 레이블 시작 
		jpResult = new JPanel(new GridLayout(3,2)); // jpResult라는 패널에 GrideLayot을 적용, 3 x 2
		jpResult.setBackground(Color.WHITE); // jpResult라는 패널에 흰색 배경적용 
		jlbResult1 = new JLabel("", JLabel.RIGHT); // jlbResult1라는 값 없는 레이블, 우측정렬
		jlbResult2 = new JLabel("0", JLabel.RIGHT); // jlbResult2라는 기본값 0인 레이블, 우측정렬
		jlbResult2.setFont(new Font("맑은 고딕", Font.BOLD, 35)); // jlbResult2 레이블에 폰트는 맑은 고딕, 진하게, 크게35 적용

		jpResult.add(jlbResult1); // jpResult 패널에 jlbResult1 레이블 추가
		jpResult.add(jlbResult2); // jpResult 패널에 jlbResult2 레이블 추가
		jlbResult1.setFont(new Font("맑은 고딕", 0, 20));
		jlbResult2.setFont(new Font("맑은 고딕", 0, 40));
		// 레이블 끝 

		// 버튼 생성 
		jpButton = new JPanel(new GridLayout(5, 4, 2, 2)); // jpButton라는 패널, GridLayout적용, 5 x 2, 간격은 가로세로 2씩
		jpButton.setBackground(Color.WHITE); // jpButton 패널 배경은 흰색
		jbButton = new JButton[numStr.length]; // jbButton 버튼 배열 초기화

		// jbButton에 표기할 값들 적용
		for(int i=0; i<numStr.length; i++) {
			jbButton[i] = new JButton(numStr[i]); // for문을 사용하여 버튼들 하나하나 지정하여 값들 설정
			jbButton[i].setFont(new Font("맑은 고딕", Font.BOLD, 20)); // 버튼 안에 폰트는 맑은 고딕, 진하게, 크게35 적용
			jpButton.add(jbButton[i]);
			jbButton[i].addActionListener(this); // 이벤트 등록
		}

		// 버튼 색 지정
		for(int j=0; j<numStr.length; j++) {
			if(j < 3) { // ←, CE, C 버튼 디자인 설정
				jbButton[j].setBackground(Color.LIGHT_GRAY);
			}else if(j==3 || j==7 || j==11 || j==15) { // ÷, ×, -, + 버튼 디자인 설정
				jbButton[j].setBackground(Color.LIGHT_GRAY);
			}else if(j>=4 && j%4 != 3) { // 나머지 숫자 버튼 디자인 설정
				jbButton[j].setBackground(Color.WHITE);
			}else if(j == 19) { // = 버튼 디자인 설정
				jbButton[j].setBackground(Color.PINK);
			}	
		}
		
		// 위도우 창(GUI) 기본 설정
		getContentPane().add("North", jpResult);
		getContentPane().add("Center", jpButton);
		setSize(350, 500); // 창 크기 설정
		getContentPane().setBackground(Color.WHITE); // 배경화면 흰색으로 설정
		setResizable(false); // 창 크기를 조절할 수 없도록하기
		setVisible(true); // 창을 화면에 나타낼 것인지 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
	}

	// 버튼 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String txtButton = e.getActionCommand();

		if(txtButton.equals("1") || txtButton.equals("2") || txtButton.equals("3") 
				|| txtButton.equals("4") || txtButton.equals("5") || txtButton.equals("6")
				|| txtButton.equals("7") || txtButton.equals("8") || txtButton.equals("9")) { // 숫자 버튼을 눌렀을때
			if(result2.equals("0")) {
				result2="";
			}
			result2+=txtButton;
			jlbResult2.setText(result2);
		} else if(txtButton.equals("←")) { // 하나 씩 삭제
			int len = jlbResult2.getText().length();
			if(len==1) { // 입력된 숫자가 하나일 경우
				result2 = "";
				jlbResult2.setText("0");
			} else { // 입력된 숫자가 여러개 일 경우
				if(!"".equals(result2)) { // 
					result2 = result2.substring(0, len-1);
					jlbResult2.setText(result2);
				}
			}
		} else if(txtButton.equals("CE")) { // 출력 부 삭제
			result2 = "";
			result="";
			jlbResult2.setText("0");
			number[0] = "0";
		} else if(txtButton.equals("C")) { // 전체 삭제
			result="";
			result1="";
			result2="";
			jlbResult1.setText("");
			jlbResult2.setText("0");
			number[0] = " ";
			number[1] = " ";
			number[2] = " ";
		} else if(txtButton.equals("0") || txtButton.equals("00")) {
			if(!("".equals(result2))) { // 입력값이 00 일때 00그대로 출력
				if(!"0".equals(result2)){
					result2+=txtButton;
					jlbResult2.setText(result2);
				}
			} else { // 입력값이 0 일때 0그대로 출력
				result2 = "0";
			}
		} else if(txtButton.equals(".")) { // .버튼을 눌렀을 때 
			if("".equals(result2)) { // 앞 숫자가 없을 경우
				result2="0"+txtButton;
			} else {
				if(result2.indexOf(".")==-1) { // 앞 숫자(result2)에 소숫점이 없을 경우
					result2 += txtButton;
				}
			}
			jlbResult2.setText(result2);
		} else if(txtButton.equals("=")) { // = 버튼을 눌렀을때
			if(!"".equals(result2)) { // 앞에 공백이 없을 경우
				number[2] = result2;
			}
			if("".equals(result1)) { // 앞에 숫자가 없을 때 
				if(!number[1].equals(" ")) {
					result = Cal();
					if("0으로 나눌 수 없습니다.".equals(result)) {
						result="";       //
						result1="";      //
						result2 = "";    // 초기화
						number[0] = " "; //
						number[1] = " "; //
						number[2] = " "; //
					} else {
						number[0] = result;
						jlbResult2.setText(result); // 텍스트 출력
					}
				}
				jlbResult1.setText(result1); // 텍스트 출력
			} else { //숫자가 있을 경우
				if(" ".equals(number[2])) {
					number[2] = result2;
				}
				result = number[0];
		
				if("0으로 나눌 수 없습니다.".equals(result)) {
					jlbResult2.setText(result);
					result="";       //
					result1="";      //
					result2 = "";    // 초기화
					number[0] = " "; // 
					number[1] = " "; //
					number[2] = " "; //
				} else {
					result = Cal(); // 계산메서드 실행
					
					if(!"0으로 나눌 수 없습니다.".equals(result)) { 
						result1 = "";
						number[0] = result;
						jlbResult2.setText(result);
						jlbResult1.setText(result1);
						result2 = "";
					} else {
						jlbResult2.setText("0으로 나눌 수 없습니다.");
						jlbResult1.setText("");
						result="";		 //
						result1="";		 //
						result2 = "";	 //
						number[0] = " "; //초기화
						number[1] = " "; //
						number[2] = " "; //
					}
					System.out.println("?");
				}
			}
		} else if(txtButton.equals("÷") || txtButton.equals("×") || txtButton.equals("-") || txtButton.equals("+")) { // 사칙 연산 버튼을 클릭했을 경우
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
			if(number[1].equals("÷") && (number[2].equals(" 0") || number[2].equals("0"))) {
				result = "0으로 나눌수 없습니다";
				
			} else {
				result2 = "";	
				jlbResult1.setText(result1);
			}

		}
	}

	// 계산 메소드  
	public String Cal() {
		String num = "";
		String testNum1 = "";
		String testNum2 = "";

		if(number[0].indexOf(".")!=-1) { // 숫자부분에 소숫점이 없을 때
			int index1 = number[0].indexOf("."); //index1에 자연수 글자 개수 저장

			testNum1 = number[0].substring(index1, number[0].length()); //입력된 전체숫자 개수 저장

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
		if(number[1].equals("×")) { // 곱하기 버튼 이벤트
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) { // 소숫점이 있을 경우
				num = (Double.parseDouble(number[0]) * Double.parseDouble(number[2])) + ""; // 형 변환후  계산한뒤 문자열로 저장
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
		} else if(number[1].equals("+")) { // 더하기 버튼 이벤트
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) { // 소숫점이 있을 경우
				num = (Double.parseDouble(number[0]) + Double.parseDouble(number[2])) + ""; // 형 변환후 계산한뒤 문자열로 저장
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
		} else if(number[1].equals("-")) { // 빼기 버튼 이벤트
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) { // 소숫점이 있을 경우
				num = (Double.parseDouble(number[0]) - Double.parseDouble(number[2])) + ""; // 형 변환후  계산한뒤 문자열로 저장
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
		} else if(number[1].equals("÷")) { // 나누기 버튼 이벤트
			number[2].trim(); // 문자열 공백제거
			if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) { // 숫자에 소숫점이 있어서
				num = (Double.parseDouble(number[0]) / Double.parseDouble(number[2])) + ""; //  // 형 변환후  계산한뒤 문자열로 저장
			} else {
				if(number[2].equals("0")) { // 0을 나눌 경우
					num = "0으로 나눌 수 없습니다.";
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
