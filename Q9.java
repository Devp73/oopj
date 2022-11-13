package external;

class Shape
{
    double d1,d2;
    Shape(double d1, double d2)
    {
        this.d1 = d1;
        this.d2 = d2;
    }
    void Area()
    {
        
    }
}

class Rect extends Shape
{
    Rect(double d1, double d2)
    {
        super(d1,d2);
    }
    void Area()
    {
        System.out.println("Area of Rectangle: " + (d1*d2)); 
    }
}

class Circle extends Shape
{
    Circle(double d1, double d2)
    {
        super(d1,d2);
    }
    void Area()
    {
        System.out.println("Area of Circle: " + (Math.PI * (d1*d1)));
    }
}

class Triangle extends Shape
{
    Triangle(double d1, double d2)
    {
        super(d1,d2);
    }
    void Area()
    {
        System.out.println("Area of Triangle: " + (d1*d2)/2); 
    }
}

public class Q9 {
    public static void main(String args[]) {
        Shape shape;
        Rect r = new Rect(4,10);
        Circle c = new Circle(10,10);
        Triangle t = new Triangle(10,10);
        r.Area();
        c.Area();
        t.Area();
        
    }
}
