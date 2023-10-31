
/* determine whether numbers in an array can be rearranged so that each number appears
 exactly once in a consecutive list of numbers. Return true otherwise false.*/

import java.util.Arrays;

public class SortingConsecutive {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        int def = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - def != arr[i]) {
                flag = false;
            }
        }
        System.out.println("Check consecutive numbers in the said array! " + flag);
    }
}