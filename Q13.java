package AllShips;

abstract class Ships
{
    String a = "Titanic";
    String b = "StarCruise";
    String c = "Victoria";
}

class Titanic extends Ships implements Passenger
{
    public void display()
    {
        System.out.println(a + " is a Passenger Ship");
    }
}

class Starcruise extends Ships implements Passenger
{
    public void display()
    {
        System.out.println(b + " is a Passenger Ship");
    }
}

class Victoria extends Ships implements Warship
{
    public void display()
    {
        System.out.println(c + " is a WarShip");
    }
    
}

interface Passenger
{
    void display();
}

interface Warship
{
    void display();
}

public class Q13 {
    public static void main(String[] args) {
        Titanic t = new Titanic();
        Starcruise s = new Starcruise();
        Victoria v = new Victoria();
        
        t.display();
        s.display();
        v.display();
    }
    
}
