
// checks whether a given string is a palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            String txt;
            System.out.print("Enter Your Text : ");
            txt = obj.nextLine();
            String revtxt = reverseWord(txt);
            if (txt.equals(revtxt))
                System.out.println(txt + " is palindrome!.");
            else
                System.out.println(txt + " is not palindrome!.");
        }
    }
    public static String reverseWord(String txt){
        String reversedStr = "";
        for (int i = 0; i < txt.length(); i++) {
            reversedStr = txt.charAt(i) + reversedStr;
        }
        return reversedStr;
    }
}
