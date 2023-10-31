
// remove a specific element from an array at given in arguments.


public class RemoveValue {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5 ,6, 8, 9 ,11, 14, 16};
        boolean flag = false;
        int num = Integer.parseInt(args[0]);
        int i = 0;

        while (i < arr.length) {
            if (num == arr[i]){
                flag = true;
                break;
            }
            i++;
        }
        if (flag){
            System.out.println("Found.");
            int[] newarr = new int[arr.length - 1];
            for (int j = 0; j < newarr.length; j++) {
                if (j >= i)
                    newarr[j] = arr[j + 1];
                else {
                    newarr[j] = arr[j];
                }
                System.out.print(newarr[j] + " ");
            }
        }
        else {
            System.out.println("Not found.");
            for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
            }
        }
    }
}
