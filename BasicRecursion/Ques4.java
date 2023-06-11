public class Ques4 {

    static double pon(double a, double b) {
        if (b == 0) {
            return 1;
        }
        double val = a * pon(a, b - 1);
        return val;
    }

    // 1/1^1 + 2 / 2 ^2 + 3 / 3^3
    static void sum(double n, double val) {
        if (n == 0) {
            System.out.println(val);
            return;
        }
        val += (n / (pon(n, n)));
        sum(n - 1, val);
    }

    static double sum(double n) {
        if (n == 0) {
            return 0;
        }
        double val;
        val = sum(n - 1);
        val += (n / (pon(n, n)));
        return val;

    }

    public static void main(String[] args) {
        // sum(3, 0);
        System.out.println(sum(1000));
    }
}
