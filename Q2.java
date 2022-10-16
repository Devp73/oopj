abstract class Fruit
{
    String color;
    Fruit(String c)
    {
        color = c;
    }
    abstract public String toString();
}

class Apple extends Fruit
{
    Apple(String c)
    {
        super(c);
    }
    public String toString()
    {
        return "Color of Apple " + color;
    }
}
class Orange extends Fruit
{
    Orange(String c)
    {
        super(c);
    }
    public String toString()
    {
        return "Color of Orange " + color;
    }
}
class Mango extends Fruit
{
    Mango(String c)
    {
        super(c);
    }
    public String toString()
    {
        return "Color of Mango " + color;
    }
}
class Grape extends Fruit
{
    Grape(String c)
    {
        super(c);
    }
    public String toString()
    {
        return "Color of Grape " + color;
    }
}
public class Q2
{
	public static void main(String[] args)
	{
		Fruit f[]=new Fruit[4];
		f[0]=new Apple("Red");
		f[1]=new Orange("Orange");
		f[2]=new Mango("Yellow");
		f[3]=new Grape("Green");
		for(int i=0;i<f.length;i++)
		{
		    System.out.println(f[i].toString());
		}
	}
}
