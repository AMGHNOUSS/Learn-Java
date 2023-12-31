
/*
 * Exercise: Duplicate Removal and Ordering
 * Write a Java program that takes an ArrayList of integers as input and performs the following tasks:
 * 1- Remove all duplicate elements from the ArrayList.
 * 2- Sort the ArrayList in ascending order.
 * 3- Find and print the second-largest element in the sorted ArrayList.
 * 4- Reverse the order of elements in the ArrayList without using any built-in sorting or reverse methods.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
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
            removeDuplicate(MyNumbers);
            SortList(MyNumbers);
            int num = SecondLargest(MyNumbers);
            ReverseArray(MyNumbers);
            System.out.println("Second Largest number is  : " + num);
            System.out.println("List :" + MyNumbers);
        }
    }

    public static void removeDuplicate(ArrayList<Integer> arr){
        int count = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
            if (count != 1)
                arr.remove(i);
        }
    }

    public static void SortList(ArrayList<Integer> arr) {
        Collections.sort(arr);        
    }

    public static int SecondLargest(ArrayList<Integer> arr) {
        int flag = 0;
        int Fisrt = arr.get(0), Second = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > Fisrt) {
                Fisrt = arr.get(i);
                flag = i;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (flag == i)
                continue;
            else if (arr.get(i) > Second) {
                Second = arr.get(i);
            }
        }
        return Second;
    }

    public static void ReverseArray(ArrayList<Integer> arr) {
        int m, n;
        for (int i = 0; i < arr.size() / 2; i++) {
            m = arr.get(i);
            n = arr.get(arr.size() - 1 - i);
            arr.set(arr.size() - 1 - i, m);
            arr.set(i, n);
        }
    }
}