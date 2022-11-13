package external;

class Series
{
    void fibo()
    {
        int n=10,n1=0,n2=1,n3=1;
        int cnt=0;
        while(cnt < n)
        {
            System.out.println(n1);
            n3 = n1+n2;
            n1=n2; n2=n3;
            cnt++;
        }
        
    }
    void fibo(int terms)
    {
        int n1=0,n2=1,n3=1;
        int cnt=0;
        while(cnt < terms)
        {
            System.out.println(n1);
            n3 = n1+n2;
            n1=n2; n2=n3;
            cnt++;
        }
    }
    
    void fibo(int start, int end)
    {
        int curr = 1, prev = 1,temp=1;
        while (curr <= end)
        {
            temp = curr;
            curr = prev + curr;
            prev = temp;
            if (curr >= start && curr <= end)
            {
                System.out.println(curr);
            }
        }

    }
}

public class Q11 {
    public static void main(String args[]) {
        Series obj = new Series();
        obj.fibo(0,5);
    }
}

