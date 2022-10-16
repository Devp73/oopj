package pkg;

public class Child extends Parent {
    public void method()
    {
        // private1 not accessible (same package same class)
        //System.out.println("private1: " + private1);
        System.out.println("default1: " + default1); //same package sub class
    }
}
