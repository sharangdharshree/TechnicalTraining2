public class Ques2 {

    static void countZero(int n, int count, boolean org) {
        if (n == 0) {
            if (org == true) {
                System.out.println("1");
                return;
            }
            System.out.println(count);
            return;
        }
        if (n % 10 == 0) {
            ++count;
        }

        countZero(n / 10, count, false);
    }

    static int countZero(int n, boolean org) {

        if (n == 0) {
            if (org == true) {
                return 1;
            }
            return 0;

        }
        int count;
        count = countZero(n / 10, false);
        if (n % 10 == 0) {
            ++count;
        }

        return count;
    }

    public static void main(String[] args) {
        // int n = 0121; this 0121 will be converted from octal to decimal then used, so
        // its usuable value will be 81
        // any number starting with 0 in java will automatically be treated as
        // octal-number and will be coverted to decimal then passed/used further

        // countZero(0, 0, true);

        System.out.println(countZero(102050, true));
    }
}
