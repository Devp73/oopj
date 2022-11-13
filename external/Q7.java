package external;

import java.util.Scanner;

class AgeNotWithinRange extends Exception
{
    public String toString()
    {
        return "AgeNotWithinRange";
    }
}

class Driver
{
    int vno,age;
    String name;
    Driver(int vno,String name,int age)
    {
        this.vno = vno;
        this.name = name;
        this.age = age;
    }
    void disp()
    {
        System.out.println("Vehicle number: " + vno);
        System.out.println("Driver name: " + name);
        System.out.println("Driver age: " + age);
    }
}

public class Q7 {
    public static void main(String args[]) {
        try {
            int vno,age;
            String name;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Vehicle number: "); vno = sc.nextInt();
            //sc.nextLine(); //to clear buffer
            System.out.print("Enter Driver name: "); name = sc.next();
            System.out.print("Enter Driver age: "); age = sc.nextInt();
            if(age<18) throw new AgeNotWithinRange();
            Driver d1 = new Driver(vno,name,age);
            d1.disp();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

