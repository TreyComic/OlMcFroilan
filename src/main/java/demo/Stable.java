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
    public Horse getHorse(int horseLocation)
    {
        return horses[horseLocation];
    }
    public void setHorse(Horse horse,int horseLocation)
    {
        this.horses[horseLocation] = horse;
    }
    public Stable(int horseCapacity)
    {
        System.out.println("Stable contstructed");
        this.horses=new Horse[horseCapacity];
    }
}
