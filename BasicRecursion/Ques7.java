public class Ques7 {

    static void checkPalindrome(String str, int len, boolean isPalindrome) {
        if (isPalindrome == false) {
            System.out.println("Not palindrome");
            return;
        } else if ((str.length() == 1 || str.length() == 0) && isPalindrome == true) {
            System.out.println("Palindrome");
            return;
        }
        if (str.charAt(0) == str.charAt(len - 1)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        checkPalindrome(str.substring(1, len - 1), len - 2, isPalindrome);

    }

    static boolean checkPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        boolean isPalindrome;
        isPalindrome = checkPalindrome(str.substring(1, str.length() - 1));
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
            System.out.println("Not Palindrome");
            System.exit(0);
            return isPalindrome;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        // Check Palindrome
        // checkPalindrome("7984", 4, true);
        System.out.println(checkPalindrome("12") ? "Palindrome" : "Not Palindrome");
    }
}
