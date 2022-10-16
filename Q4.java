import java.util.Scanner;
interface ABC 
{
    void method();
}

class A implements ABC
{
    public void method()
    {
        System.out.println("Method of interface called ");
    }
}

public class Q4
{
	public static void main(String[] args)
	{
		A a = new A();
		
		a.method();
	}
}
