
/*
 * reads a list of integers from the user and throws
 * an exception if any numbers are duplicates.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)){
            ArrayList<Integer> MyNumbers = new ArrayList<Integer>();
            int input, i =0;
            System.out.println("Enter 0 if you want to stop");
            while (true) {
                System.out.print("Enter value de list at index " + i + " : ");
                input = obj.nextInt();
                if (input != 0) {
                    MyNumbers.add(input);
                }
                else
                    break;
                i++;
            }
            System.out.println("List :" + MyNumbers);
            Duplicate(MyNumbers);
            System.out.println("There are no numbers duplicated.");
        } catch (Exception e) {
            System.out.println(e);
        }    
    }
    public static void Duplicate(ArrayList<Integer> arr) throws Exception{
        int count = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
            if (count != 1) {
               throw new Exception("There are numbers duplicated.");
            }
        }
    }
}
