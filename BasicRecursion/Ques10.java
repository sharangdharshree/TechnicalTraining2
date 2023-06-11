public class Ques10 {

    static void allFoundElementIndex(int arr[], int num, int[] indexes, int index, int i) {
        if (index == arr.length) {
            for (int ind : indexes) {
                System.out.print(ind + " ");
            }
            return;
        }
        if (arr[index] == num) {
            indexes[i] = index;
            ++i;
        }
        allFoundElementIndex(arr, num, indexes, index + 1, i);

    }

    static int[] allFoundElementIndex(int[] arr, int num, int index) {
        if (index == arr.length) {
            int[] indexes = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                indexes[i] = -1;
            }
            return indexes;
        }
        int[] indexes = new int[arr.length];
        indexes = allFoundElementIndex(arr, num, index + 1);
        if (arr[index] == num) {
            indexes[index] = index;
        }
        return indexes;

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 0, 5, 8, 6, 7, 9, 0, 1, 3, 4, 0, 5, 8, 8 };
        int[] indexes = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        // allFoundElementIndex(arr, 0, indexes, 0, 0);
        for (int i : allFoundElementIndex(arr, 0, 0)) {
            System.out.print(i + " ");
        }

    }
}
