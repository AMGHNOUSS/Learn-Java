## Java ArrayList

The `ArrayList` class is a resizable array, which can be found in the `java.util` package.

Example:
Create an ArrayList object called cars that will store strings:
```
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```


The `ArrayList` class has many useful methods. For example, to add elements to the ArrayList, use the `add()` method:

Example
```
import java.util.ArrayList;
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
```

Access an Item
To access an element in the `ArrayList`, use the `get()` method and refer to the index number:

Example
```
cars.get(0);
```

Change an Item
To modify an element, use the `set()` method and refer to the index number:

Example
```
cars.set(0, "Opel");
```

Remove an Item
To remove an element, use the `remove()` method and refer to the index number:

Example
```
cars.remove(0);
cars.clear()
```

ArrayList Size
To find out how many elements an ArrayList have, use the size method:

Example
```
cars.size();
```

Loop Through an ArrayList
Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:

Exemple
```
import java.util.ArrayList;
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("Toyota");
cars.add("Dacia");

for (int i = 0; i < cars.size(); i++) {
    Sysyem.out.println(cars[i]);
}
```
OR
```
import java.util.ArrayList;
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("Toyota");
cars.add("Dacia");

foreach (String i : cars) {
    Sysyem.out.println(i);
}
```


Sort an ArrayList
Another useful class in the `java.util` package is the `Collections` class, which include the `sort()` method for sorting lists alphabetically or numerically:

Example
Sort an ArrayList of Strings:
```
import java.util.ArrayList;
import java.util.Collections;
ArrayList<int> MyNumber = new ArrayList<int>();
MyNumber.add(15);
MyNumber.add(20);
MyNumber.add(12);

Collections.sort(MyNumber);
foreach (int i : MyNumber) {
    Sysyem.out.println(i);
}
```