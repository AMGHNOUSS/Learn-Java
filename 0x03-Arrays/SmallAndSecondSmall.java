
// find the smallest and second smallest elements of a given array.

public class SmallAndSecondSmall {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int FisrtSmall = arr[0], SecondSmall = arr[0];
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < FisrtSmall) {
                FisrtSmall = arr[i];
                flag = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (flag == i)
                continue;
            else if (arr[i] < SecondSmall) {
                SecondSmall = arr[i];
            }
        }
        System.out.println("The smallest number in array is " + FisrtSmall);
        System.out.println("The second smallest number in array is " + SecondSmall);    
    }
}
