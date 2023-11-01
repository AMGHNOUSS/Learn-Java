
// check whether a string is a valid password.

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("A password consists of only letters and digits.");
            System.out.println("A password must have at least ten characters.");
            System.out.println("A password must contain at least two digits.");
            System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");
            String password = obj.nextLine();
            if (check_password(password))
                System.out.println("Password is valid: " + password);
            else
                System.out.println("Password is invalid: " + password);
        }
    }
    
    public static boolean check_password(String str){
        boolean flag = true;
        if (str.length() < 10)
            return false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < 47)
                return false;
            else if (c > 57 && c < 65)
                return false;
            else if (c >  90 && c < 97)
                return false;
            else if (c > 122)
                return false;
        }
        return flag;
    }
}
