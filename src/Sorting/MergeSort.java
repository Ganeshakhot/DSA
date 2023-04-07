package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int [] mergeSort(int [] a){
        if (a.length == 1) {
            return a;
        }

        int mid = a.length / 2;
        int a1[] = mergeSort(Arrays.copyOfRange(a,0,mid));
        int a2[] = mergeSort(Arrays.copyOfRange(a,mid,a.length));
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
        mergeSort(a,0,a.length);

        System.out.println(Arrays.toString(a));
    }



    //using recursion

    public static void mergeSort(int [] a , int s , int e){
        if (e - s  == 1) {
            return;
        }

        int mid = (s + e) / 2;
        mergeSort(a,s,mid);
        mergeSort(a,mid,e);
        Tomerge(a,s,mid,e);
    }

    public static void Tomerge(int [] arr,int s , int m , int e){
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
