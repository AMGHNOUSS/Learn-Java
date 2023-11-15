
/*
 *  Find the length of a given string.
 */
public class Length {
    public static void main(String[] args) {
        String txt = "Hello";
        System.out.println("The length of \"" + txt + "\" is : " + lengthOfString(txt));
    }

    public static int lengthOfString(String txt) {
        if (txt.isEmpty())
            return 0;
        return 1 + lengthOfString(txt.substring(1));
    }
}
