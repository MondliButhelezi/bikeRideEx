package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideOne implements BikeRide {
    public final Bicycle bicycle; // creating an instance variable and Importing methods from Bicycle class

    public BikeRideOne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    //    creating a constructor that has bicycle object
//    public void ride() {
//        this.bicycle.accelerate();
//        this.bicycle.accelerate();
//        this.bicycle.accelerate();
//        this.bicycle.brake();
//        this.bicycle.brake();
//        this.bicycle.accelerate();
//        this.bicycle.currentSpeed();
//    }

    @Override
    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int Speed() {
        return this.bicycle.currentSpeed();
    }


//    public static void main (String [] args) {
//        Bicycle bicycle = new Bicycle();
//        BikeRideOne bikeRide = new BikeRideOne(bicycle);
//        bikeRide.ride();
//        System.out.println(bicycle.currentSpeed());
//    }
}


