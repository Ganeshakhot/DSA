package Recursion;

import java.util.Arrays;

class BasicPrograms {

    // print 5 to 1
    public static void Print(int n) {
        //base condition
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        Print(n - 1);
    }

    //print 1 to 5
    public static void Print2(int n) {
        //base condition
        if (n <= 0) {
            return;
        }
        Print2(n - 1);
        System.out.println(n);

    }

    //    sum of n numbers
//    n = 5 then 1 + 2 + 3 + 4 + 5
    public static int sum_of_N(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum_of_N(n - 1);
    }

//    facto of a given no

    public static int facto(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * facto(n - 1);
    }

//    Recursive Programs to find Minimum and Maximum elements of array

    static int min(int[] a, int n) {
        if (n == 0) {
            return a[0];
        }
        return Math.min(a[n - 1], min(a, n - 1));
    }

    static int max(int[] a, int n) {
        if (n == 0) {
            return a[0];
        }
        return Math.max(a[n - 1], max(a, n - 1));
    }

//    344. Reverse String
//    https://leetcode.com/problems/reverse-string/description/

    public static char[] reverse(char[] s, int low, int high) {
        if (low >= high) {
            return s;
        }
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        reverse(s, low + 1, high - 1);
        return s;
    }

    //    Reverse An array
    public static int[] reverse(int[] s, int low, int high) {
        if (low >= high) {
            return s;
        }
        int temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        reverse(s, low + 1, high - 1);
        return s;
    }

    //    Sum of digit of a number using recursion
    //    Input : 45632
    //    Output :20
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    //    Prime no or Not using Recursion
    //    set i = 2 because itration start for 2 of prime no program
    public static boolean isPrime(int n, int i) {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits(45632));
    }
}
