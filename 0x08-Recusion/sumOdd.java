
/*
 * Find the sum of all odd numbers in an array. 
 */

public class sumOdd {
    public static void main(String[] args) {
        int[] arr = {15, 12, 23, 26, 17};
        System.out.println("The sum of all odd numbers in array is : " + sumOddnumbers(arr));
    }
    
    public static int sumOddnumbers(int[] arr) {
        return sumOddnumbers(arr, 0);
    }

    private static int sumOddnumbers(int[] arr, int index) {
        if (index == arr.length)
            return 0;
        int sum = sumOddnumbers(arr, index + 1);
        if (arr[index] % 2 == 1)
            sum += arr[index];
        return sum;
    }
}
