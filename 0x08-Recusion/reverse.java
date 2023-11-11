/*
 * Reverse a given string.
 */
public class reverse {
    public static void main(String[] args) {
        String txt = "Hello";
        System.out.println("Reverse of \"" + txt + "\" : " + rev(txt));
    }
    public static String rev(String txt) {
        if (txt.isEmpty() || txt.length() == 1)
            return txt;
        else
            return rev(txt.substring(1, txt.length())) + txt.charAt(0);
    }
}