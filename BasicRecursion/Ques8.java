public class Ques8 {

    static void searchFromLast(int[] arr, int num, int lastIndex, int index) {
        if (lastIndex < 0) {
            System.out.println("Not Found");
            return;
        }
        if (arr[lastIndex] == num) {
            index = lastIndex;
            System.out.println("Found at Index: " + index);
            return;
        }
        searchFromLast(arr, num, lastIndex - 1, index);
    }

    static int searchFromLast(int[] arr, int num, int index) {
        if (index == arr.length) {
            return -1;
        }
        int foundIndex;
        foundIndex = searchFromLast(arr, num, index + 1);
        if (arr[index] == num) {
            foundIndex = index;
            System.out.println(foundIndex);
            System.exit(0);
            // return foundIndex;

        }
        return foundIndex;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 5, 4, 3, 2, 0, 9, 7, 8, 6 };
        // searchFromLast(arr, 8, 9, 0);
        searchFromLast(arr, 0, 0);
    }
}
