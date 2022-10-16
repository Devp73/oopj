class MyThread2 implements Runnable
{
    Thread T1; 
    MyThread2(String str)
    {
        T1 = new Thread(this); 
        T1.start();
    }
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(+ (i*i));
                T1.sleep(1000);
            }
        }
        catch(InterruptedException ex)
        {
            
        }
    }
}


public class Q8 {
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        MyThread2 m1;
        m1 = new MyThread2("");
        try
        {
            for(int i=1;i<=10;i++)
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

/*public class Q8 {
    public static void main(String[] args) {
        Multi m1=new Multi();
        Multi2 m2=new Multi2(); 
        
        m1.start();
        m2.start();
    }   
}*/
