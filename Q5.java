class Car
{
    void run()
    {
        System.out.println("running");
    }
}

class Audi extends Car
{
    void run()
    {
        System.out.println("running swiftly with 100km");
    } 
} 
public class Q5
{
    public static void main(String[] args)
    {     
        Car b = new Audi();//upcasting  

        b.run();  
    }  
}


 