package demo;

public class Horse extends Animal implements Rideable
{
    private int horseID;
    static int uniqueID=0;
    public Horse()
    {
        horseID=uniqueID;
        uniqueID++;
    }
    public int getHorseID() {
        return horseID;
    }

    @Override
    public void eat(Edible edible)
    {

    }

    @Override
    public void makeNoise()
    {
        System.out.println("The Horse goes WeeSnaw");
    }
}
