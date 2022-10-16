interface Shape {
	float area();
	float perimeter();
}

class Rectangle implements Shape {

	private float length;
	private float breadth;

	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float area() {

		return length * breadth;
	}

	@Override
	public float perimeter() {

		return 2 * (length + breadth);
	}
}

class Circle implements Shape {

	private float radius;

	public Circle(float radius) {
		this.radius = radius;

	}

	@Override
	public float area() {

		return (float)Math.PI * radius * radius;
	}

	@Override
	public float perimeter() {

		return 2 * (float)Math.PI * radius;
	}
}

public class Q15 {
    public static void main(String[] args) {
        // Rectangle area and parameter
		float length = 2;
		float breadth = 3;
		Shape s = new Rectangle(length, breadth);

		System.out.println("Rectangle - Area: " + s.area());
		System.out.println("Rectangle - perimeter: " + s.perimeter());

		// Circle area and parameter
		float radius = 2;
		Shape s1 = new Circle(radius);
		System.out.println("Circle - Area: " + s1.area());
		System.out.println("Circle - perimeter: " + s1.perimeter());
    }
    
}
