package demo;
public class Cropduster implements FarmVehicle, Aircraft{
    public void fly()
    {
        System.out.println("cropduster fly");
    }
    @Override
    public void operate(Field field)
    {

    }
    @Override
    public void makeNoise()
    {
        System.out.println("BRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
    }
}
