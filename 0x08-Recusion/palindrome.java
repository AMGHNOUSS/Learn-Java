
public class palindrome {
    public static void main(String[] args) {
        boolean isPalindrome1 = palindromeFunction(args[0]);
        System.out.println(args[0] + " is a palindrome: " + isPalindrome1);
    }

    public static boolean palindromeFunction(String txt) {
        if (txt.length() <= 1) {
            return true;
        }
        char str1 = txt.charAt(0);
        char str2 = txt.charAt(txt.length() - 1);
        if (str1 != str2)
            return false;
        else
            return palindromeFunction(txt.substring(1, txt.length() - 1));
    }
}
