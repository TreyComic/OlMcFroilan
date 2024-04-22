package demo;

public class Chicken extends Animal implements Produce
{
    boolean isFertilized;
    private int chickID;
    static int uniqueID=0;
    public Chicken()
    {
        chickID=uniqueID;
        uniqueID++;
    }
    public int getID()
    {
        return chickID;
    }
    public boolean getFert()
    {
        return isFertilized;
    }
    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }
    public Edible yield()
    {
        if (!isFertilized)
        {
            return new EdibleEgg();
        }
        else
        {
            return null;
        }
    }
    @Override
    public void makeNoise()
    {
        System.out.println("the chicken screeches.");
    }
}

