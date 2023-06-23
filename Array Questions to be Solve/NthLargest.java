package Array;

import java.util.Arrays;

public class NthLargest {
    static void nLargest(int[] arr, int n) {
        Arrays.sort(arr);
        System.out.println("Nth Largest: " + arr[arr.length - n]);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 70, 100, 1, 93, 44, 86 };
        nLargest(arr, 6);
    }
}
