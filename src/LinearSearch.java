public class LinearSearch {
    public static int Linearsearch(int [] a , int Target){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == Target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
