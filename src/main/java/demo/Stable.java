package demo;

public class Stable
{
    Horse[] horses;
    public Horse[] getHorses()
    {
        return horses;
    }
    public void setHorses(Horse[] horses)
    {
        this.horses = horses;
    }
    public Stable(int horseCapacity)
    {
        this.horses=new Horse[horseCapacity];
    }
}
