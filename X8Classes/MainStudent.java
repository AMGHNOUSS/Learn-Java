
/*
 * create a class called "Student" with a name, grade, and courses attributes
 * create methods to add and remove courses.
 */

import java.util.ArrayList;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Carolus Vitali", "11");
        Student student2 = new Student("Nakeisha Uhuru", "10");
        Student student3 = new Student("Gabriella Cherice", "10");
        System.out.println("Student Details:");
        student1.print();
        student2.print();
        student3.print();
        System.out.println("Adding courses for " + student1.getName());
        student1.add("Math");
        student1.add("Science");
        student1.add("English");

        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        System.out.println("\nAdding courses for " + student2.getName());
        student2.add("History");
        student2.add("Geography");
        student2.add("English");
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
        System.out.println("\nRemoving 'Science' course for " + student1.getName());
        student1.remove("Science");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());   
    }
}

class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    
    public String getName() {
        return this.name;
    }

    public String getGrade() {
        return this.grade;
    }

    public ArrayList<String> getCourses() {
        return this.courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public void setCourses(ArrayList<String> courses){
        this.courses = courses;
    }
    
    public void add(String course) {
        this.courses.add(course);
    }
    
    public void remove(String course) {
        this.courses.remove(course);
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
        System.out.println("Courses: " + courses + "\n" );
    }
}