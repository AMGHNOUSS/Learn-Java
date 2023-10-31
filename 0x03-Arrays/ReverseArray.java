
// reverse an array of integer values.

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5 ,6, 8, 9 ,11, 14, 16};
        int[] rev_arr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            rev_arr[j] = arr[i];
        }
        System.out.print("The original array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nThe reverse array : ");
        for (int i = 0; i < rev_arr.length; i++) {
            System.out.print(rev_arr[i] + " ");
        }
    }
}
