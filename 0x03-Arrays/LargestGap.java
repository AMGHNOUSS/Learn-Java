

// calculate the largest gap between sorted elements of an array of integers. 

import java.util.Arrays;

public class LargestGap {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        int def = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (def < arr[i + 1] - arr[i]) {
                def = arr[i + 1] - arr[i];
            }
        }
        System.out.println("Largest gap between sorted elements : " + def);
    }
}