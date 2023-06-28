package Array;

public class MinMisssingEle {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 5 };
        int miss = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        if (max < 0) {
            max = 2;
        }
        int arr[] = new int[max + 2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arr[array[i]] = 1;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                miss = i;
                break;
            }
        }
        System.out.println("1st Minimum Missing is:" + miss);
    }
}
