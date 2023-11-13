
/*
 * Count the number of occurrences of a specific element in an array.
 */
public class Counting {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 20, 50, 20, 60};
        int target = 20;
        int occurrences = count(numbers, target, 0);
        System.out.println("The number of occurrences of " + target + " in the array is: " + occurrences);
    }

    public static int countOccurrences(int[] arr, int target) {
        return count(arr, target, 0);
    }

    public static int count(int[] numbers, int num, int index) {
        if (index == numbers.length) {
            return 0;
        }
        int count = count(numbers, num, index + 1);
        if (numbers[index] == num) {
          count++;
        }
        return count;
    }
}