package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BicycleTest {

    @Test
    public void MountainBikeTest() {
        MountainBike mountain = new MountainBike();
        mountain.accelerate();
        mountain.brake();
        assertEquals(2, mountain.currentSpeed());
    }


    @Test
    public void RoadBikeTest() {
        RoadBike road = new RoadBike();
        road.accelerate();
        road.brake();
        assertEquals(7, road.currentSpeed());
    }

    @Test
    public void TandemTest() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        assertEquals(5, tandem.currentSpeed());
    }

    @Test
    public void BikeRideOneTest() {
        //left hand side "Bicycle" is a parent class, but I can use the "Tandem" as well and it will not return an error
        Bicycle tandem = new Tandem();
        BikeRideOne one = new BikeRideOne(tandem);
        one.ride(tandem);
        assertEquals(34, one.Speed());
    }

    @Test
    public void BikeRideTwoTest() {
        Bicycle tandem = new Tandem();
        BikeRideTwo two = new BikeRideTwo(tandem);
        two.ride(tandem);
        assertEquals(15, two.Speed());
    }

    @Test
    public void BikeRideThreeTest() {
        Bicycle tandem = new Tandem();
        BikeRideThree three = new BikeRideThree(tandem);
        three.ride(tandem);
        assertEquals(51, three.Speed());
    }

    @Test
    public void RoadBikeSpecTest() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(11, roadBikeSpec.getAccelerationSpeed());
        assertEquals(4, roadBikeSpec.setBrakeSpeed());
    }

    @Test
    public void MountainBikeSpecTest() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(5, mountainBikeSpec.getAccelerationSpeed());
        assertEquals(3, mountainBikeSpec.setBrakeSpeed());
    }
}