package external;

class MyThread implements Runnable
{
    Thread T1; 
    MyThread(String str)
    {
        T1 = new Thread(this); 
        T1.start();
    }
    boolean isPrime(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public void run()
    {
        try
        {
            for(int i=2;i<=100;i++)
            {
                if(isPrime(i))
                {
                    System.out.println(+ (i));
                    Thread.sleep(500);
                }
            }
        }
        catch(InterruptedException ex)
        {
            
        }
    }
}


public class Q5 {
    static boolean isPerfect(int n)
    {
        //1 is divisor for all numbers so initialized with 1
        int sum=1;
        for (int i = 2; i < n; i++) {
            if(n%i == 0)
            {
                sum += i;
            }
        }
        if(sum==n)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        MyThread m1;
        m1 = new MyThread("");
        try
        {
            for (int i = 2; i <= 100; i++) {
                if(isPerfect(i))
                {
                    System.out.println("    " + i);
                    Thread.sleep(500);
                }
            }
        }catch(InterruptedException ex)
        {
            
        }
    }
}
