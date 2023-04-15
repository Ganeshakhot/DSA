package Arrays;

//input : 442 1 22 3333 555564
//output : 3
//explanation :
//442 has 3 elements it is odd
//1 has only 1 element it is odd
//22 has 2 elements it is even
//3333 has 4 elements it is even
//555564 has 6 elements it is even
//
//so the output is 3

public class DigitsAreEven {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (noOfDigits(nums[i]) % 2 == 0)
                count++;
        }
        return count;
    }

    public int noOfDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
