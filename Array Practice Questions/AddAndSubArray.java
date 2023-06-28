package Array;

public class AddAndSubArray {

    static void sum(int a[], int b[]) {
        int carry = 0;

        int i = a.length - 1;
        int j = b.length - 1;

        int greater = (i > j) ? i + 1 : j + 1;
        int sum[] = new int[greater + 1];
        int k = sum.length - 1;

        while ((i > j) ? i >= 0 : j >= 0) {
            if (i >= 0 && j >= 0) {
                sum[k] = (a[i] + b[j] + carry) % 10;
                carry = (a[i] + b[j] + carry) / 10;
                i--;
                j--;
                k--;
            } else if (i >= 0 && j < 0) {
                sum[k] = (a[i] + carry) % 10;
                carry = (a[i] + carry) / 10;
                i--;
                k--;
            } else if (j >= 0 && i < 0) {
                sum[k] = (b[j] + carry) % 10;
                carry = (b[j] + carry) / 10;
                j--;
                k--;
            }

        }
        sum[0] = carry;
        StringBuffer sol = new StringBuffer();
        for (int q = 0; q < sum.length; q++) {
            sol.append(Integer.toString(sum[q]));
        }
        while (sol.charAt(0) == '0' && sol.length() > 1) {
            sol.deleteCharAt(0);
        }
        System.out.println(sol.toString());
    }

    static void sub(int a[], int b[]) {
        StringBuffer A = new StringBuffer();
        StringBuffer B = new StringBuffer();
        for (int eleA : a) {
            A.append(Integer.toString(eleA));
        }
        for (int eleB : b) {
            B.append(Integer.toString(eleB));
        }
        int diff = Math.abs(Integer.parseInt(A.toString()) - Integer.parseInt(B.toString()));
        StringBuffer Diff = new StringBuffer();
        Diff.append(Integer.toString(diff));
        int sub[] = new int[(a.length > b.length) ? a.length : b.length];
        for (int i = 0; i < sub.length; i++) {
            sub[i] = Integer.parseInt(String.valueOf(Diff.charAt(i)));
        }
        for (int ele : sub) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 0, 5, 3, 1 };
        int b[] = { 9, 4, 2, 0, 2 };
        // sum(a, b);
        sub(a, b);
    }
}
