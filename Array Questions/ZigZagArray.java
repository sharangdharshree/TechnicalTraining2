package Array;

public class ZigZagArray {
    public static void main(String[] args) {
        // 1st < 2nd > 3rd

        int[] arr = { 4, 3, 7, 8, 6, 2, 5, 9 };
        int prev = 0;
        int current = 1;
        int next = 2;
        while (current < arr.length - 1) {
            if (arr[current] < arr[prev]) {
                int temp = arr[current];
                arr[current] = arr[prev];
                arr[prev] = temp;
            }
            if (arr[current] < arr[next]) {
                int temp = arr[current];
                arr[current] = arr[next];
                arr[next] = temp;
            }
            // 3.7.4
            prev += 2;
            current += 2;
            next += 2;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
