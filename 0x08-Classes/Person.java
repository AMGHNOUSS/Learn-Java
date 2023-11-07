
/* 
 * Create a class called "Person" with a name and age attribute.
 * Create two instances of the "Person" class, set their attributes using the constructor.
 * Print their name and age.
 */
class Person {
    int age;
    String name;
    
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void method() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}