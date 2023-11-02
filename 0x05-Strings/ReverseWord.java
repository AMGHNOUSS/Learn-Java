
// Reverse every word in a string using methods.

public class ReverseWord {
    public static void main(String[] args) {
        
        String txt = args[0];
        System.out.println("The given string is: " + txt);
        System.out.print("The string reversed word by word is: ");
        reverseEachWordInString(txt); 
    }

    public static void reverseEachWordInString(String txt){
        String reversedStr = "";
        for (int i = 0; i < txt.length(); i++) {
            reversedStr = txt.charAt(i) + reversedStr;
        }
        System.out.print(reversedStr);
    }
}
