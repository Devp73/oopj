interface Calculation1
{
    void calculateArea();
}

class Circle1 implements Calculation1
{
    double ra;
    
    Circle1(double r)
    {
        ra = r;
    }
    
    public void calculateArea()
    {
        double a = 3.14 * ra * ra;
        System.out.println("Area of Circle is " + a);
    }
}

class Rectangle1 implements Calculation1
{
    int le,br;
    
    Rectangle1(int l, int b)
    {
        le = l;
        br = b;
    }
    
    public void calculateArea()
    {
        double a = le * br;
        System.out.println("Area of Rectangle is " + a);
    }
}

class Triangle1 implements Calculation1
{
    int he,br;
    
    Triangle1(int h, int b)
    {
        he = h;
        br = b;
    }
    
    public void calculateArea()
    {
        double a = 0.5 * he * br;
        System.out.println("Area of Triangle is " + a);
    }
}


public class Q11 {
    public static void main(String[] args) {
        Calculation1 c1 = new Circle1(10);
        Calculation1 c2 = new Rectangle1(10,20);
        Calculation1 c3 = new Triangle1(10,20);
        
        c1.calculateArea();
        c2.calculateArea();
        c3.calculateArea();
    }
    
}
