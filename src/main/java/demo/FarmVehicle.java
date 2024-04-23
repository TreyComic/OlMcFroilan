package demo;

public interface FarmVehicle extends Vehicle {
    public void operate(Field field);

    @Override
    default void makeNoise() {

    }
    public default Crop[][] harvest(Crop[][] field){return null;}
}
