package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideTwo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BicycleTest {
//    @Test
//    public void shouldAccelerate() {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        assertEquals(5, bicycle.currentSpeed());
//    }
//
//    @Test
//    public void shouldAccelerateAndBrakeCorrect() {
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.brake();
//        assertEquals(2, bicycle.currentSpeed());
//    }
//
//    @Test
//    public void shouldDoMultipleAcceleratesCorrectly() {
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.accelerate();
//        bicycle.accelerate();
//        assertEquals(15, bicycle.currentSpeed());
//    }
//
//    @Test
//    public void shouldBeAbleToStop() {
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.accelerate();
//        bicycle.stop();
//        assertEquals(0, bicycle.currentSpeed());
//    }

//    @Test
//    public void MountainBikeTest() {
//        MountainBike mountain = new MountainBike();
//        mountain.accelerate();
//        assertEquals(5, mountain.currentSpeed());
//    }

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
}
