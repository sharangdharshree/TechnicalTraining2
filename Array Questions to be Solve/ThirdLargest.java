package Array;

public class ThirdLargest {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 70, 100, 1, 93, 44, 86 };
        int firstLargest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[firstLargest]) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = i;
            } else if (arr[i] > arr[secondLargest] && arr[i] != arr[firstLargest]) {
                thirdLargest = secondLargest;
                secondLargest = i;
            } else if (arr[i] > arr[thirdLargest] && arr[i] != arr[firstLargest] && arr[i] != arr[thirdLargest])
                thirdLargest = i;
        }
        System.out.println("First Largest: " + arr[firstLargest]);
        System.out.println("Second Largest: " + arr[secondLargest]);
        System.out.println("Third Largest: " + arr[thirdLargest]);
    }
}
