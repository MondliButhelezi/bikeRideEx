package bicycles;

// A class that has one field called speed and has 4 methods
public class Bicycle {
    private int speed;

//    First methods that increments the bike speed by 5 everytime it accelerates
    public void accelerate () {
        speed += 5;
    }
    //    2nd methods that decrements the bike speed by 3 everytime it decelerates
    public void brake () {
        speed -= 3;
    }

//    a method that shows the current speed of the bike at that particular moment
    public int currentSpeed () {
        System.out.println("Your current speed is " + speed + " km/h");
        return speed;
    }
// a method that brings the current speed of the bike to zero.
    public void stop () {
        speed = 0;
    }
}


