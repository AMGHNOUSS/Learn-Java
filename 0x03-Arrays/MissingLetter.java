
/* the missing letter from an array of increasing letters.
(upper or lower). Assume there will always be one omission from the array. */

import java.util.Arrays;

public class MissingLetter {
    public static void main(String[] args) {
        char[] arr = new char[args.length];
        char c = ' ';
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  args[i].charAt(0);
        }
        System.out.println("Original array of elements: " + Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                c = (char) (arr[i] + 1);
                System.out.println("Missing letter in the said array: " + c);
            }
        }
    }
}
