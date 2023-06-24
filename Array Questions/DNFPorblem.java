package Array;

public class DNFPorblem {
    public static void main(String[] args) {
        // Sort an array of 0s, 1s and 2s
        // Example 1:
        // Input:
        // N = 5
        // arr[]= {0 2 1 2 0}
        // Output:
        // 0 0 1 2 2

        int arr[] = { 0, 2, 1, 2, 0, 1, 2 };
        int i = 0;

        for (int k = 0; k <= 2; k++) {
            int j = i;
            while (j < arr.length) {
                if (arr[i] == k) {
                    i++;
                    if (j < i) {
                        j = i;
                    }

                    // 0011222
                }
                if (j == arr.length) {
                    break;
                }
                if (arr[j] != k) {
                    j++;
                } else {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i++;
                    j++;
                }
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}
