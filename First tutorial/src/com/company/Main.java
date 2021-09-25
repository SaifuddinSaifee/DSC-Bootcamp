package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};	// write your code here
        Solution solution = new Solution();
        solution.duplicateZeros(arr);
    }
}

class Solution {
    public void duplicateZeros(int[] arr) {
        int[] dupArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i< arr.length-j; i++){
            dupArr[j]=arr[i];
            j++;
            if (arr[i] == 0){
                dupArr[j+1] = 9;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(dupArr));
    }
}
// 1 0 2 3 0 4 5 0
// 1 0 0 2 3 0 0 4