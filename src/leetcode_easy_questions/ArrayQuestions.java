package leetcode_easy_questions;

import java.util.HashSet;

public class ArrayQuestions {

    //217. Contains Duplicate
    // Time O(n) Space O(n)
    private static boolean containsDuplicate(int [] arr){
        HashSet<Integer> seen = new HashSet<>();
        for(int i : arr){
            if(seen.contains(i)){
                return true;
            }
            seen.add(i);
        }
        return false;
    }

    //283. Move Zeroes
    public static void moveZeroes(int [] nums) {
        int l = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != 0){
                swap(i,l,nums);
                l++;
            }
        }
    }
    public static void swap(int i, int j, int [] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,1};
        System.out.println(containsDuplicate(arr));

        moveZeroes(arr);
        for (int i: arr) {
            System.out.print(i+" ");
        }


    }
}
