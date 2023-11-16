
/*
 * Write code for the diamond pattern.
 */

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        System.out.print("Enter number of rows : ");
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int star = 1;
            int space = 18;
            for (int i = 1; i < (a * 2); i++) {
                for (int j = 0; j < space / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < star; j++) {
                    System.out.print("*");
                }
                System.out.println();
                if (i < a) {
                    star += 2;
                    space -= 2;
                }
                else {
                    star -= 2;
                    space += 2;
                }
            }
        }
    }
}
