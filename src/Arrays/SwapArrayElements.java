package Arrays;

import java.util.Arrays;

public class SwapArrayElements {
    void swap(int [] a , int f , int s){
        int temp = a[f];
        a[f] = a[s];
        a[s] = temp;
    }

    public int [] swapElements(int [] a){
        int l = 0;
        int h = a.length - 1;

        while(l <= h){
            if(a[l] == 2 && a[h] == 5){
                swap(a,l,h);
                l++;
                h--;
            }
            if(a[l] != 2 ) l++;
            if(a[l] != 2 ) h--;
        }
        return a;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8};
        SwapArrayElements s = new SwapArrayElements();
        System.out.println(Arrays.toString(s.swapElements(a)));
    }
}
