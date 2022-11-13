package external;
public class Q3 {
    static String reverseWords(String str)
    {
        String s[] = str.split(" ");
        String temp = "";
        for (int i = s.length - 1; i >= 0; i--) {
            temp += s[i] + " ";
        }
        return temp;
    }
    public static void main(String args[]) {
        System.out.println(reverseWords("hi how are"));
    }
}
