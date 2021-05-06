package bicycles.specifications;

import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase {

    public final BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
        this.bicycleSpecification = bicycleSpecification;
    }
    @Override
    public void accelerate() {
        this.changeSpeed(this.bicycleSpecification.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        this.changeSpeed(this.bicycleSpecification.setBrakeSpeed());
    }


    public static void main(String[] args) {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11,4);
        System.out.println(roadBikeSpec.getAccelerationSpeed());
        System.out.println(roadBikeSpec.setBrakeSpeed());

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,3);
        System.out.println(mountainBikeSpec.getAccelerationSpeed());
        System.out.println(mountainBikeSpec.setBrakeSpeed());
    }
}
