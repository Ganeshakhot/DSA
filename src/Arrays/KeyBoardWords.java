package Arrays;
import java.util.*;
public class KeyBoardWords {

    //    500. Keyboard Row
    //    https://leetcode.com/problems/keyboard-row/

    public String[] findWords(String[] words) {
        //@ arpitkatiyar
        String str1="qwertyuiopQWERTYUIOP";
        String str2="asdfghjklASDFGHJKL";
        String str3="zxcvbnmZXCVBNM";


        ArrayList<String> l=new ArrayList<>();

        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            int m=0;
            int n=0;
            int p=0;
            for(int j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(str1.contains(ch+""))
                {
                    m++;
                }
                else if(str2.contains(ch+""))
                {
                    n++;
                }
                else
                    p++;
            }

            if(m==str.length() || n==str.length() || p==str.length())
            {
                l.add(words[i]);
            }
        }
        return l.toArray(new String[l.size()]);
    }
}
