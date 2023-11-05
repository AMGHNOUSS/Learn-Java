
/*
 * create a method that takes a string as input and throws
 * an exception if the string does not contain vowels.
 */

public class Vowels {
    public static void main(String[] args) {
        try {
            String s = "Exemple";
            check(s);
            System.out.println("String contains vowels.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());     
        }
    }
    public static void check(String s) throws Exception{
        boolean flag = false;
        char[] vow = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < s.length(); i++){
            for (char j : vow) {
                if (s.charAt(i) == j) {
                    flag = true;
                    break;
                }   
            }
        }
        if (!flag)
            throw new Exception(s + " does not contain vowels.");
    } 
}
