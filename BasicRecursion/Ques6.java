public class Ques6 {

    static void checkArmstrong(int n, int sum, int num) {
        if (n == 0 & sum == num) {
            System.out.println("It's an Armstrong!!");
            return;
        } else if (n == 0) {
            System.out.println("Not Armstrong");
            return;
        }
        int digit = n % 10;
        sum += digit * digit * digit;
        checkArmstrong(n / 10, sum, num);
    }

    static int checkArmstrong(int n, boolean org) {
        if (n == 0 && org == true) {
            return 1;
        } else if (n == 0 && org == false) {
            return 0;
        }
        int sum;
        int digit = n % 10;
        sum = (digit * digit * digit) + checkArmstrong(n / 10, false);
        if (org == true && sum == n) {
            return 1;
        } else if (org == true && sum != n) {
            return 0;
        } else {
            return sum;
        }
    }

    public static void main(String[] args) {
        // checkArmstrong(111, 0, 111);
        System.out.println(checkArmstrong(111, true));
    }
}
