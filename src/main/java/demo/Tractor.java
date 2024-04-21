package demo;

public class Tractor implements FarmVehicle, Vehicle{

    @Override
    public void operate(Field field)
    {

    }
    @Override
    public void makeNoise()
    {
        System.out.println("The tractor screams");
    }
}
