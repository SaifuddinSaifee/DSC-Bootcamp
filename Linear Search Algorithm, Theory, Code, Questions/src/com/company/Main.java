package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] intArr = {6, 3, 7, 45, 52, 11, 66, 54};
        int target = 45;
        System.out.println(linearSearch(intArr, target));

        String[] strArray = {"Ram", "Sham", "dham", "kaam"};
    }

    // search in the array: return index if item found
    // otherwise if item not found return -1

    static int linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }


    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return Integer.MAX_VALUE;
    }

    static boolean stringSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean stringSearch2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }

    static int linearSearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run loop
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }

    static int FindMin(int[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;

    }

    // test array :
    // int[][] arr = new int[][] {
    // {23, 5},
    // {14, 77, 40},
    // {84, 22, 43},
    // {97, 86, 10, 99}
    // }
    static int[] searchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1};
    }

    static int searchMaxIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    // short-cut of finding number of digits
    static int NoOfDigits(int num){
        if (num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num))+1;
    }

    static int maxSum(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int account = 0; account < accounts.length; account++) {
                sum += ints[account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }


}
