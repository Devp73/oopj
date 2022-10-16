package q3;

import pkg.*;

//other package subclass
class SubClass extends Parent
{
    public void method()
    {
        System.out.println("protected1: " + protected1);
    }
}

//other package non-subclass (cannot create subclasses)
//class SubClass1 extends NonSubClass

public class Q3 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.method();
        NonSubClass obj1 = new NonSubClass();
        obj1.method();
        
        SubClass obj2 = new SubClass();
        obj2.method(); 
    }
    
}
