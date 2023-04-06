import java.util.Arrays;
public class Sorting {

    public static void Bubble(int [] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if(a[j] > a[j+1]){
                    Swap(a,j,j+1);
                }
            }
        }
    }

    public static void insertionSort(int [] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(a[j] < a[j-1])
                    Swap(a,j,j-1);
            }
        }
    }

    public static void selectionSort(int [] a){
        for (int i = 0; i < a.length; i++) {
            int last = a.length - i - 1;
            int max = getMax(a,0,last);
            Swap(a,last,max);
        }
    }

    public static void quickSort(int [] a , int low , int high){
        if (low >= high) {
            return;
        }
        int l = low;
        int h = high;
        int mid = low +( high - low )/2;
        int pivote = a[mid];

        while (l <= h) {
            while (a[l] < pivote) {
                l++;
            }
            while (a[h] > pivote) {
                h--;
            }
            if (l <= h) {
                int temp = a[l];
                a[l] = a[h];
                a[h] = temp;
                l++;
                h--;
            }
        }
        quickSort(a,low,h);
        quickSort(a,high,l);
    }

    public static int getMax(int [] a , int first , int last){
        int max = 0;
        for (int i = first; i <= last; i++) {
            if (a[max] < a[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void Swap(int [] a , int f , int s){
        int temp = a[f];
        a[f] = a[s];
        a[s] = temp;
    }

    public static void main(String[] args) {
        int [] a = {5,4,3,2,100};
        quickSort(a,0,a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
