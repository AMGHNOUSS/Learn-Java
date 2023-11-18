public class Dog {
    String name;
    String breed;

    public Dog(String n, String b){
        name = n;
        breed = b;
    }
    public String getName() {
        return this.name;
    }
    
    public String getBreed() {
        return this.breed;
    }
    public void setName(String n) {
        this.name = n;
    }
    
    public void setBreed(String b) {
        this.breed = b;
    }
    public void print(){
        System.out.println("Name of dog is " + name + " and her breed is " + breed + ".");
    }
    public static void main(String[] args) {
        Dog d1 = new Dog("Max", "Rottweiler");
        Dog d2 = new Dog("Fred", "German");
        d1.setName("Fred");
        d2.setName("Max");
        d1.setBreed("German");
        d2.setBreed("Rottweiler");
        d1.print();
        d2.print();
    }
}