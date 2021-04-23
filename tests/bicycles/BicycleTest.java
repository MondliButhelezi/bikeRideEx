package bicycles;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BicycleTest {
    @Test
    public void shouldAccelerate() {

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());
    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(15, bicycle.currentSpeed());
    }

    @Test
    public void shouldBeAbleToStop() {
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }
}
