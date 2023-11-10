
/*
 * Create class called "TrafficLight" with attributes for color and duration.
 * Create methods to change the color and check for red or green.
 */

public class MainTrafficLight {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 30);

        if (light.check())
            System.out.println("The light is green");
        else
            System.out.println("The light is red");
        light.setColor("green");

        if (light.check())
            System.out.println("The light is now green");
        else
            System.out.println("The light is now red");
        light.setDate(20);
        System.out.println("The light duration is now: " + light.getDate());       
    }
}

class TrafficLight {
    private String color;
    private int date;
    
    public TrafficLight(String color, int date) {
        this.color = color;
        this.date = date;
    }
    public String getColor() {
        return this.color;
    }

    public int getDate() {
        return this.date;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDate(int date){
        this.date = date;
    }

    public boolean check() {
        if (this.color.equals("red"))
            return false;
        else
            return true;
    }
}