
// Insert an element into the array list at the first position at given an argument.

import java.util.ArrayList;

public class Cars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        String txt = args[0];
        cars.add("Toyota");
        cars.add("Dacia");
        cars.add("Volvo");
        cars.add("Mercides");
        cars.add(0, txt);
        for (String string : cars) {
            System.out.println(string);
        }
    }
}
