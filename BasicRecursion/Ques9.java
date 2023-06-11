public class Ques9 {

    static void countAllOcurrance(int[] arr, int num, int count, int index) {
        if (index == arr.length) {
            System.out.println(count);
            return;
        }
        if (arr[index] == num) {
            ++count;
        }
        countAllOcurrance(arr, num, count, index + 1);

    }

    static int countAllOcurrance(int[] arr, int num, int index) {
        if (index == arr.length) {
            return 0;
        }
        int count;
        count = countAllOcurrance(arr, num, index + 1);
        if (arr[index] == num) {
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 0, 5, 8, 6, 7, 9, 0, 1, 3, 4, 0, 5, 8, 8 };
        // countAllOcurrance(arr, 8, 0, 0);
        System.out.println(countAllOcurrance(arr, 5, 0));
    }
}
