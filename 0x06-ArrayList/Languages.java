
/* 
 * Write a Java program to retrieve an element (at a specified index) from a given array list.
 * Write a Java program to update an array element by the given element.
 * Write a Java program to remove the third element from an array list.
*/

import java.util.ArrayList;

public class Languages {
    public static void main(String[] args) {
        ArrayList<Integer> MyNumbers = new ArrayList<Integer>();
        MyNumbers.add(10);
        MyNumbers.add(15);
        MyNumbers.add(20);
        MyNumbers.add(22);
        MyNumbers.add(17);
        for (int i : MyNumbers) {
            System.out.print(i + " ");
        }
        System.out.println("\nThe value of index 3 : " + Retrieve(MyNumbers, 3));
        System.out.println("Update value of index 4 by 8 " + update(MyNumbers, 8, 4));
        for (int i : MyNumbers) {
            System.out.print(i + " ");
        }
    }
    static int Retrieve(ArrayList<Integer> arr, int n) {
        return arr.get(n);
    }
    static int update(ArrayList<Integer> arr, int valueNew, int n) {
        return arr.set(n, valueNew);
    }
    
}
