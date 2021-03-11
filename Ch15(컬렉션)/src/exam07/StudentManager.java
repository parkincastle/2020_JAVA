package exam07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager {
	
    public static void main(String[] args) {
    	
        Student[] student = new Student[3];
        ArrayList<Student> al = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("학사 관리 프로그램");
        System.out.println("==============================");
        for (int i = 0; i < student.length; i++) {
        	
            System.out.print(">> ");
            String text = sc.nextLine();
            
            System.out.print("이름 입력 : ");
            String name = sc.next();
            System.out.print("학과 : ");
            String department = sc.next();
            System.out.print("학번 : ");
            String num = sc.next();
            System.out.print("점수 : ");
            String score = sc.next();
            
            student[i] = new Student(name, department, num, score);
            al.add(student[i]);
        }
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println("======================================");
            Student s = al.get(i);
            System.out.println("이름: " + s.getName());
            System.out.println("학과: " + s.getDepartment());
            System.out.println("학번: " + s.getNum());
            System.out.println("점수: " + s.getScore());
        }
        
        System.out.println("===============================");
        while (true) {
            System.out.print("학생 이름  :  ");
            String name = sc.next();
            if (name.equals("stop")) {
                break;
            }
            for (int i = 0; i < al.size(); i++) {
                Student s = al.get(i);
                s.findStudent(name);
            }
        }
    }
}
