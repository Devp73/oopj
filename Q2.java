package external;
public class Q2 {
    static void getMaxChar(String str)
    {
        int len=str.length();
        String temp = new String();
        //freq array based on ascii value
        int cnt[] = new int[256]; //ascii size
        
        for (int i = 0; i < len; i++) {
            cnt[str.charAt(i)]++;
        }
        
        //removing duplicates from the string
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            //check if char is already present in temp
            if(temp.indexOf(ch) < 0)
            {
                temp += ch;
            }
        }
        //print char and their occureneces
        for (int i = 0; i < temp.length(); i++) {
            char ch=temp.charAt(i);
            if(cnt[ch] > 1)
            {
                System.out.println(ch +" " + cnt[ch]);
            }
        }
    }
    public static void main(String args[]) {
        getMaxChar("howareyoudoingha");
    }
}
