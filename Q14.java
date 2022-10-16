interface AddSubtract
{
    int addition(int a, int b);
    int subtraction(int c, int d);
}

interface MultiplyDivide extends AddSubtract
{
    int multiply(int e, int f);
    double divide(int g, int h);
}

class Calculation implements MultiplyDivide
{
    @Override
    public int addition(int a, int b)
    {
        return a + b;
    }
    
    @Override
    public int subtraction(int c, int d)
    {
        return c - d;
    }
    
    @Override
    public int multiply(int e, int f)
    {
        return e * f;
    }
    
    @Override
    public double divide(int g, int h)
    {
        return (double)g / h;
    }
}

public class Q14 {
    public static void main(String[] args) {
        int n1=5, n2=2;
        
        Calculation c = new Calculation();
        
        System.out.println("Addition is: " + c.addition(n1, n2));
        System.out.println("Subtraction is: " + c.subtraction(n1, n2));
        System.out.println("Multiplication is: " + c.multiply(n1, n2));
        System.out.println("Divide is: " + c.divide(n1, n2));
    }
    
}
