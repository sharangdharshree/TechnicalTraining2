public class Ques1 {

    static void pon(int a, int b, int val) {
        if (b == 0) {
            System.out.println(val);
            return;
        }
        val = a * val;
        pon(a, b - 1, val);

    }

    static int pon(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int val = a * pon(a, b - 1);
        return val;
    }

    public static void main(String[] args) {
        // pon(5, 0, 1);
        System.out.println(pon(2, 0));
    }
}
