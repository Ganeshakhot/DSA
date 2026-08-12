package leetcode_easy_questions;

public class StringQuestions {

    //Is Palindrome
    public static boolean isPalindrome(String str){
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
        if(String.valueOf(ch).equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("gannag"));
    }
}
