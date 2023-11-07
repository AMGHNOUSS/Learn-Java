
// count all vowels in a string at given i narguments

public class Vowels {
    public static void main(String[] args) {
        System.out.print("Number of Vowels in the string: " + CountVowels(args[0]));
    }
    
    public static int CountVowels(String str) {
        String strV = "aeiou";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < strV.length(); j++) {
                if (str.charAt(i) == strV.charAt(j))
                    count++;
            }
        }
        return count;
    }
}