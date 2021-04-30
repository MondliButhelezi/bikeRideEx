package bicycles;

public class BikeRide implements Bicycle {

    private int speed = 0;

    public BikeRide(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        speed += 5;
    }

    @Override
    public void brake() {
        speed -= 3;
    }

    @Override
    public int currentSpeed() {
        System.out.println("Your current speed is " + speed + " km/h");
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    public final Bicycle bicycle; //Importing object "bicycle" from class Bicycle
//
//    public BikeRide(Bicycle newRide) {
//        this.bicycle = newRide;
//    }
////
////    public int currentSpeed() {
////        System.out.println(this.bicycle.currentSpeed());
////        return this.bicycle.currentSpeed();
////    }

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
//        Bicycle bicycle = new Bicycle();
//        BikeRide bikeRide = new BikeRide(bicycle);
//        bikeRide.ride();
//
//        System.out.println(bikeRide.currentSpeed());
    }


}
