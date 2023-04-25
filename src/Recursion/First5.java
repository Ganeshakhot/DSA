package Recursion;

public class First5 {

    // print 5 to 1
    public static void Print(int n ){
        //base condition
        if(n <= 0){
            return;
        }
        System.out.println(n);
        Print(n - 1);
    }

    //print 1 to 5
    public static void Print2(int n ){
        //base condition
        if(n <= 0){
            return;
        }
        Print2(n - 1);
        System.out.println(n);

    }

//    sum of n numbers
//    n = 5 then 1 + 2 + 3 + 4 + 5
    public static int sumofN(int n){
        if(n <= 0){
            return 0;
        }
        return n+sumofN(n-1);
    }

//    facto of a given no

    public static int facto(int n){
        if(n <= 1){
            return 1;
        }
        return n * facto(n - 1);
    }


    public static void main(String[] args) {
        int a = facto(5);
        System.out.println(a);
    }
}
