package Math;

public class RevNumber {
    public static int revNum(int n){
        int rev = 0;
        while(n != 0){
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }
        return rev;
    }


    public static void main(String[] args) {
        int n = 12345;
        System.out.println(revNum(n));
    }
}
