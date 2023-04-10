package Math;

public class easyMath {

//    question no 1: power of four
//    Input: n = 16
//    Output: true
    public boolean isPowerOfFour(int n) {
        if(n <= 0)
            return false;
        if(n == 1)
            return true;
        return n%4 == 0 && isPowerOfFour(n / 4);
    }

//    question no 2
//    Input: digits = [4,3,2,1]
//    Output: [4,3,2,2]
//
//    Input: digits = [9]
//    Output: [1,0]
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

//    Question no 3 Climb stairs
//    Input: n = 3
//    Output: 3
//    Explanation: There are three ways to climb to the top.
//    1. 1 step + 1 step + 1 step
//    2. 1 step + 2 steps
//    3. 2 steps + 1 step
    public int climbStairs(int n) {
        if(n==1) return 1;

        if(n==2) return 2;

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }

//    question no 4 happy no
//    Input: n = 19
//    Output: true
//    Explanation:
//            1 square + 9 square = 82
//            8 square + 2 square = 68
//            6 square + 8 square = 100
//            1 square + 0 square + 0 square = 1

    public boolean isHappy(int n) {
        int slowPointer = n;
        int fastPointer = nextNumber(n);

        while (fastPointer != 1 && fastPointer != slowPointer) {
            slowPointer = nextNumber(slowPointer);
            fastPointer = nextNumber(nextNumber(fastPointer));
        }
        return (fastPointer == 1);
    }

    int nextNumber(int n) {
        int newNumber = 0;

        while(n != 0) {
            int num = n % 10;
            newNumber += num * num;
            n = n / 10;
        }
        return newNumber;
    }

//    question no 5 Power of two
//    Input: n = 16
//    Output: true
//    Explanation: 24 = 16

    public boolean isPowerOfTwo(int n) {
        for(int i = 0 ; i < n ; i++){
            if((int)Math.pow(2,i) == n){
                return true;
            }
        }
        return false;
    }

//    question no 6 ugly No
//    An ugly number is a positive integer
//    whose prime factors are limited to 2, 3, and 5.
//
//    Input: n = 1
//    Output: true
//    Explanation: 1 has no prime factors, therefore all of its
//    prime factors are limited to 2, 3, and 5.
//
//    Input: n = 14
//    Output: false
//    Explanation: 14 is not ugly since it includes the prime factor 7.
    public boolean isUgly(int n) {
        if(n == 0)
        {
            return false;
        }
        while(n % 2 == 0)
        {
            n = n / 2;
        }

        while(n % 3 == 0)
        {
            n = n / 3;
        }

        while(n % 5 == 0)
        {
            n = n / 5;
        }
        return n == 1;
    }
}
