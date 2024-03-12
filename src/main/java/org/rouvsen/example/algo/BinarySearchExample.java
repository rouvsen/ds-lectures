package org.rouvsen.example.algo;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,14,55,23,77};
        int res = searchBinary(arr, 14);//
        if (res == -1) {
            System.out.println("Couldn't find the concrete value");
        } else {
            System.out.println("Entered value's index is: " + res);
        }
        System.out.println("Entered value: " + arr[res]);
    }


    public static int searchBinary(int[] arr, int target) {
        sortAnyArray(arr);
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void sortAnyArray(int [] arr) {
        Arrays.sort(arr);
    }
}
