package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int [] mergeSot(int [] a){
        if (a.length == 1) {
            return a;
        }

        int mid = a.length / 2;
        int a1[] = mergeSot(Arrays.copyOfRange(a,0,mid));
        int a2[] = mergeSot(Arrays.copyOfRange(a,mid,a.length));
        return  merge(a1,a2);
    }

    public static int [] merge(int [] arr1 , int [] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] ans = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
            }else{
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < arr1.length){
            ans[k] = arr1[i];
            k++;
            i++;
        }
        while(j < arr2.length){
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;
    }


    public static void main(String[] args) {
        int [] a = {5,4,3,2,1,11,55};
        System.out.println(Arrays.toString(mergeSot(a)));
    }
}
