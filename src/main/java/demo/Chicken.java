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
    public Edible yield()
    {
        if isFertilized==true
        {
            return new Egg;
        }
        else
        {
            return null;
        }
    }
}

