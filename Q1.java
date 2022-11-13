package external;
public class Q1 {
    
    static char getMaxChar(String str)
    {
        //freq array based on ascii value
        int cnt[] = new int[256]; //ascii size
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i)]++;
        } 
        int max=-1;
        char res = 0;
        for (int i = 0; i < str.length(); i++) {
            if(max < cnt[str.charAt(i)])
            {
                max = cnt[str.charAt(i)];
                res = str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String args[]) {
        System.out.println(getMaxChar("howareyou"));
    }
}
