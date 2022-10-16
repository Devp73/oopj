interface Showable
{  
    void show();  
    interface Message
    {  
        void msg();  
    }  
}  
public class Q12 implements Showable.Message, Showable
{  
    public void msg()
    {
        System.out.println("Msg Method Called");
    }
    
    public void show()
    {
        System.out.println("Show Method Called");
    }

    public static void main(String args[])
    {  
        Showable.Message message=new Q12(); //child interface 
        message.msg();
        
        Showable s = new Q12(); //parent interface
        s.show();
    }  
}  


