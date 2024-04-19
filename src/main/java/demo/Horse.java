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
}
