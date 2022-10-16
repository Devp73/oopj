import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        
        for (int i=0;i<a.length ;i++ ) 
        {
            System.out.println("Enter Number[i+1]: ");
            a[i]=sc.nextInt();
        }         
        
        Arrays.sort(a);
        
        System.out.println("Reverse Array is: ");
        
        for (int i=a.length-1; i>=0; i--) 
        {
            System.out.println(a[i]);
        }

    }
    
}
