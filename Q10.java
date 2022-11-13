package external;

import java.util.Scanner;

class Student {
    String name;
    int marks1,marks2,marks3,rno;
    double per, total;

    Student(String name,int rno,int marks1,int marks2,int marks3) {
        this.name = name;
        this.rno = rno;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    void result() {
        total = (marks1 + marks2 + marks3) / 3;
        per = (marks1 + marks2 + marks3) / 3; //marks are entered from 100 only
    }

    void displayData() {
        result();
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rno);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + per);
    }
}

public class Q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int marks1, marks2, marks3, rno;
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter RollNo: ");
        rno = sc.nextInt();
        System.out.print("Enter Marks1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter Marks2: ");
        marks2 = sc.nextInt();
        System.out.print("Enter Marks3: ");
        marks3 = sc.nextInt();
        Student s = new Student(name,rno,marks1,marks2,marks3);
        s.displayData();
    }
}
