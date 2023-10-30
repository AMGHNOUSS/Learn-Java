
// Convert Roman Number to decimal.

public class RomanNumber {
    public static void main(String[] args){
        String str = args[0];
        char c_next = 'a';
        int result = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (i != (str.length() - 1))
                c_next = str.charAt(i + 1);
            if (c == 'M')
                result += 1000;
            else if (c == 'D')
                result += 500;
            else if (c == 'C')
                result += 100;
            else if (c == 'L')
                result += 50;
            else if (c == 'X')
                result += 10;
            else if (c == 'V')
                result += 5;
            else if (c == 'I'){
                if (c_next == 'V'){
                    result += 4;
                    i++;
                }
                else if (c_next == 'X'){
                    result += 9;
                    i++;
                }
                else
                    result++;
            }
        }
        System.out.println("The Roman Number is : " + str);
        System.out.println("The Decimal of roman number  is : " + result);
    }
}