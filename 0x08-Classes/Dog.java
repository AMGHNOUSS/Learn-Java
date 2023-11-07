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
}