package demo;

public class Croprow
{
    Crop[] crops;
    public Croprow(int cropRowLength)
    {
        crops=new Crop[cropRowLength];
        System.out.println("Croprow of length "+cropRowLength+" constructed");
    }
    public Croprow()
    {
        crops=new Crop[10];
        System.out.println("No length given. Croprow of length 10 constructed");
    }
    public Crop[] getCrops()
    {
        return crops;
    }

    public void setCrops(Crop[] workingRow)
    {
        crops=workingRow;
    }
}
