package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {-18, -12, -14, 0, 2, 3, 4, 15, 16, 22, 45, 89};
        int target = 22;
        int ans = ascBinarySearch(arr, target);
        System.out.println(ans); // must print 9


    }
    // this is for a code sort in ascending order
    public static int ascBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start / 2) + (end / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

    }
}
