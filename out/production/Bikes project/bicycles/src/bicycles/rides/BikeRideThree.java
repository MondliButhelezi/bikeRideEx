package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideThree implements BikeRide {
    public final Bicycle bicycle;

    public BikeRideThree (Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public  void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
    }

    public int Speed() {
        return this.bicycle.currentSpeed();
    }
}
