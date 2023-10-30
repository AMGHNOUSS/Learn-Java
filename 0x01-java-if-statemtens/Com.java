
// Print all possible different combinations of two digits.

public class Com {
    public static void main(String[] aargs) {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                if ((i * 10 + j) == 89)
                    System.out.println(i + "" + j);
                else if (i < j) {
                    System.out.print(i + "" + j + ", ");
                }
            }
        }
    }
}