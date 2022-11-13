package external;

class MyThread implements Runnable
{
    Thread T1; 
    MyThread(String str)
    {
        T1 = new Thread(this); 
        T1.start();
    }
    public void run()
    {
        try
        {
            for(int i=1;i<=15;i++)
            {
                System.out.println(+ (i));
                T1.sleep(1000);
            }
        }
        catch(InterruptedException ex)
        {
            
        }
    }
}

public class Q4 {
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        MyThread m1;
        m1 = new MyThread("");
        try
        {
            for(int i=15;i>0;i--)
            {
                System.out.println("    " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ex)
        {
            
        }
    }
}