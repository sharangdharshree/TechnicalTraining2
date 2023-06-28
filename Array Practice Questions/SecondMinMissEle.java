package Array;

public class SecondMinMissEle {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 5 };
        int miss = 0;
        int secondMiss = 0;
        int max = 0;
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        if (max < 0) {
            max = 2;
        }
        int arr[] = new int[max + 3];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arr[array[i]] = 1;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0 && count == 1) {
                miss = i;
                count++;
            } else if (arr[i] == 0 && count == 2) {
                secondMiss = i;
                break;
            }
        }
        System.out.println("First Minimum Missing is: " + miss);
        System.out.println("Second Minimum Missing is: " + secondMiss);
    }
}
