

public class SumArrays {
    public static void main(String[] args){
        int[] array = {12, 13, 4, 6, 17};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("The sum is : " + sum);
    }
}