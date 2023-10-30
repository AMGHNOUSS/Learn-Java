
// Print all Number in arrays at given as arguments

public class PrintArrays {
    public static void main(String[] args){
        int[] arrays = new int[args.length];
        int i;
        for (i = 0; i < args.length; i++){
            arrays[i] = Integer.parseInt(args[i]);
        }
        for (i = 0; i < arrays.length; i++){
            if (i == arrays.length - 1)
                System.out.println(arrays[i]);
            else
                System.out.print(arrays[i] + ", ");
        }
    }
}