package Array;

public class ArrayRotate {
    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int rotations = 7;
        int arr[] = { 10, 20, 30, 40, 50 };
        // rotations negative
        if (rotations < 0) {
            rotations = arr.length + rotations;
        }

        // rotations must be in range
        rotations = rotations % arr.length;

        // 1st part reverse
        reverse(arr, 0, arr.length - rotations - 1);

        // 2nd part reverse
        reverse(arr, arr.length - rotations, arr.length - 1);

        // full reverse
        reverse(arr, 0, arr.length - 1);

        // the brute force apporoach will not work here as length of the array could be
        // as large as 10^5

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
