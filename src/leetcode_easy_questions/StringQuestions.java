package leetcode_easy_questions;

public class StringQuestions {

    //Is Palindrome
    public static boolean isPalindrome(String str) {
        char[] ch = str.toCharArray();

        int l = 0;
        int h = ch.length - 1;

        while (l <= h) {
            char temp = ch[l];
            ch[l] = ch[h];
            ch[h] = temp;
            l++;
            h--;
        }
        if (String.valueOf(ch).equals(str)) {
            return true;
        }
        return false;
    }

    //13. Roman to Integer
    public static int romanToInt(String s) {
        int ans = 0, num = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }

            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("gannag"));

        System.out.println(romanToInt("XX"));
    }
}
