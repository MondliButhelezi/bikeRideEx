package bicycles;

public class BikeRide {
//    How do I import the bicycle class so that I use the bicycle method?
    public final Bicycle bicycle;
//    Importing object "bicycle" from class Bicycle

    public BikeRide(Bicycle newRide) {
        this.bicycle = newRide;
    }

    public int currentSpeed() {
        System.out.println(this.bicycle.currentSpeed());
        return this.bicycle.currentSpeed();
    }

//    creating a constructor that has bicycle object
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public static void main (String [] args) {
        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

        System.out.println(bikeRide.currentSpeed());
    }
}
