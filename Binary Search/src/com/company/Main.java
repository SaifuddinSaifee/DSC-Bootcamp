package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {-18, -12, -14, 0, 2, 3, 4, 15, 16, 22, 45, 89};
        int target = 22;
        int ans = ascBinarySearch(arr, target);

        int[] arr2 = {89, 45, 22, 16, 15, 4, 3, 2, 0, -12, -14, -18};
        int target2 = 22;
        int ans2 = desBinarySearch(arr2, target2);
        System.out.println(ans); // must print 9
        System.out.println(ans2);


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

    // this is for a code sort in descending order
    public static int desBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start / 2) + (end / 2);

            if (target < arr[mid]) {
                start = mid - 1;
            } else if (target > arr[mid]) {
                end = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //Find whether the array is sort in ascending or descending order
        boolean isASC = (arr[start] < arr[end]);

        while (start <= end) {
            int mid = (start / 2) + (end / 2);

            if (arr[mid] == target) {
                return mid;
            }

            if (isASC) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid - 1;
                } else if (target > arr[mid]) {
                    end = mid + 1;
                }
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

        }
        return -1;

    }

}
