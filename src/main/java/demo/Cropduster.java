package demo;
public class Cropduster implements FarmVehicle, Aircraft{
    public void fly()
    {
        System.out.println("Cropduster flying");
    }
    @Override
    public void operate(Field field) {
        System.out.println("Engine starting");
        makeNoise();

    }

    @Override
    public void makeNoise() {
        System.out.println("Zoom zoom");
    }

    public void fertilize(Croprow[] cropRows) {
        for (Croprow cropRow : cropRows) {
            for (Crop crop : cropRow.getCrops()) {
                crop.isHasBeenHarvested(true);
                System.out.println("Crop is fertilized");
            }
        }
    }
}
