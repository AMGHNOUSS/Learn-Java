
// compute the average of three numbers.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.print("The number " + (i + 1) + " : ");
                arr[i] = input.nextInt();
            }
        }

        float min = MinArray(arr);
        System.out.println("The smallest number of these three : " + min);
    }

    public static float MinArray(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
                min += arr[i];
        }
        return min / 3;
    }
}
