public class Ques3 {

    static void sumOfNaturalNumber(int n, int val) {
        // sum of N natural number has a formula of sum = (n*(n+1))/2
        if (n == 0) {
            System.out.println(val);
            return;
        }
        val = n + val;
        sumOfNaturalNumber(n - 1, val);

    }

    static int sumOfNaturalNumber(int n) {
        if (n == 0) {
            return 0;
        }
        int val;
        val = n + sumOfNaturalNumber(n - 1);
        return val;
    }

    public static void main(String[] args) {
        // sumOfNaturalNumber(5, 0);
        System.out.println(sumOfNaturalNumber(1000));
    }
}
