package exam07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager {
	
    public static void main(String[] args) {
    	
        Student[] student = new Student[3];
        ArrayList<Student> al = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("�л� ���� ���α׷�");
        System.out.println("==============================");
        for (int i = 0; i < student.length; i++) {
        	
            System.out.print(">> ");
            String text = sc.nextLine();
            
            System.out.print("�̸� �Է� : ");
            String name = sc.next();
            System.out.print("�а� : ");
            String department = sc.next();
            System.out.print("�й� : ");
            String num = sc.next();
            System.out.print("���� : ");
            String score = sc.next();
            
            student[i] = new Student(name, department, num, score);
            al.add(student[i]);
        }
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println("======================================");
            Student s = al.get(i);
            System.out.println("�̸�: " + s.getName());
            System.out.println("�а�: " + s.getDepartment());
            System.out.println("�й�: " + s.getNum());
            System.out.println("����: " + s.getScore());
        }
        
        System.out.println("===============================");
        while (true) {
            System.out.print("�л� �̸�  :  ");
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
