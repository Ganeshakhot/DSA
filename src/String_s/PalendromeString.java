package String_s;

public class PalendromeString {

    public static boolean isPalendrome(String str){
        char []ch = str.toCharArray();

        int l = 0;
        int h = ch.length - 1;

        while(l <= h){
            char temp = ch[l];
            ch[l] = ch[h];
            ch[h] = temp;
            l++;
            h--;
        }
        System.out.println(ch.toString());
        if(String.valueOf(ch).equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        isPalendrome("abcabc");
    }
}
