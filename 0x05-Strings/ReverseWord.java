
// Reverse every word in a string using methods.
/*
 * Given: The given string is: This is a test string
 * Exepcted: The string reversed word by word is: sihT si a tset gnirts
 */

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("The given string is: ");
            String txt = obj.nextLine();
            System.out.print("The string reversed word by word is: ");
            String[] arr = txt.split(" ");
            for (int i = 0; i < arr.length; i++) {
                reverseWord(arr[i]);
                System.out.print(" ");
            }
        } 
    }

    public static void reverseWord(String txt){
        String reversedStr = "";
        for (int i = 0; i < txt.length(); i++) {
            reversedStr = txt.charAt(i) + reversedStr;
        }
        System.out.print(reversedStr);
    }
}
