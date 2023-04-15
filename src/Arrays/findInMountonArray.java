package Arrays;

public class findInMountonArray {
    int search(int[] arr, int target) {
        int peak = peekElement(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    public int peekElement(int a[]) {
        int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (a[mid] > a[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int orderAgnosticBS(int[] a, int target , int low , int high) {

        boolean isSorted = a[low] < a[high];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target){
                return mid;
            }

            if (isSorted) {
                if (target < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
