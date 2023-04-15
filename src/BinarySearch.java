package SearchingAndSorting;

public class BinarySearch {

    public static int Bin_Search(int [] a , int target){
        int low = 0;
        int high = a.length - 1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(target > a[mid]){
                low = mid + 1;
            }else if(target < a[mid]){
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    //Binary search using recursion

    static int BinSear(int []a , int target , int low , int high){
        if(low > high){
            return 1;
        }
        int mid = low + ( high - low ) / 2;

        if(target == a[mid])
            return mid;
        if(target > a[mid])
            return BinSear(a,target,mid+1,high);
        else
            return BinSear(a,target,low,mid - 1);
    }


//    Input: letters = ["c","f","j"], target = "a"
//    Output: "c"
//    Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    static char nextGreatestLetter(char [] ch , char x){
        int low = 0;
        int high = ch.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (x < ch[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return ch[low % ch.length];
    }


    //      floor of a specific no in sorted array
//      input : 11,22,33,44,55 target : 54
//      output : 44
    static int floor(int [] a , int target){
        int low = 0;
        int high = a.length - 1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(target > a[mid]){
                low = mid + 1;
            }else if(target < a[mid]){
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return high;
    }

//    Celing of a specific no in sorted array
//    input : 11,22,33,44,55 target : 50
//    output : 5 index of 55

    static int celing(int [] a , int target){
        int low = 0;
        int high = a.length - 1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(target > a[mid]){
                low = mid + 1;
            }else if(target < a[mid]){
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int [] a = {11,23,34,48,52,66};

        System.out.println(celing(a,50));
    }
}
