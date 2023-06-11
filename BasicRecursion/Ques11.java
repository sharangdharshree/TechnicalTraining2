public class Ques11 {

    static void findAndReplace(int[] arr, int num, int replace, int i) {
        if (i == arr.length) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            return;
        }
        if (arr[i] == num) {
            arr[i] = replace;
        }
        findAndReplace(arr, num, replace, i + 1);
    }

    static int[] findAndReplace2(int[] arr, int num, int replace, int i) {
        if (i == arr.length) {
            return arr;
        }

        findAndReplace2(arr, num, replace, i + 1);

        if (arr[i] == num) {
            arr[i] = replace;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 0, 8, 3, 0, 1, 7, 6, 0 };

        for (int l : findAndReplace2(arr, 0, 69, 0)) {
            System.out.print(l + " ");
        }
    }
}
