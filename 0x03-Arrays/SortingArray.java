
// Sort all value of arrays asc at given arguments
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < args.length; i++){
            System.out.print(arr[i] + " ");      
        }
    }
}