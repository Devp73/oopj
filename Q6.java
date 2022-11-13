package external;

import java.util.Scanner;

class MarksOutOfBoundsException extends Exception {
    public String toString() {
        return "Enter valid marks";
    }
}

class Student {

    int rno, marks[] = new int[4];

    Student(int rno, int marks[]) {
        this.rno = rno;
//        System.arraycopy(marks, 0, this.marks, 0, 4);
        for (int i = 0; i < 4; i++) {
            this.marks[i] = marks[i];
        }
    }

    void disp() {
        System.out.println("Roll no: " + rno);
        for (int i = 0; i < 4; i++) {
            System.out.println("Subject " + (i + 1) + "Marks = " + marks[i]);
        }
    }

}

public class Q6 {

    public static void main(String args[]) {
        int rno, marks[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your roll no: ");
        rno = sc.nextInt();
        try {
            for (int i = 0; i < 4; i++) {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                if (marks[i] > 100 || marks[i] < 0) {
                    throw new MarksOutOfBoundsException();
                }
            }
            Student stud = new Student(rno, marks);
            stud.disp();
        } catch (MarksOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

    }
}
