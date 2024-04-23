package demo;

public class Stable
{
    Horse[] horses;
    public Stable(int horseCapacity)
    {
        System.out.println("Empty stable with room for "+horseCapacity+" constructed");
        this.horses=new Horse[horseCapacity];
    }
    public Stable(int horseCapacity,int emptyStables)
    {

        System.out.println("Stable with room for "+horseCapacity+" constructed, with "+emptyStables+" empty.");
        this.horses=new Horse[horseCapacity];
        int filledStables=horseCapacity-emptyStables;
        for(int i=0;i<filledStables;i++)
        {
            Horse currentHorse=horses[i];
            currentHorse=new Horse();
        }
    }
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
    public void fillStable(int horseFill)
    {
        int counter=0;
        for(int i=0;i<horseFill;i++)
        {
            horses[i]=new Horse();
            counter++;
        }
        System.out.println("Stable filled with "+counter+" horses.");
    }
    public void fillStable()
    {
        int counter=0;
        for(int i=0;i<horses.length;i++)
        {
            horses[i]=new Horse();
            counter++;
        }
        System.out.println("Stable filled with "+counter+" horses.");
    }
    public static void main(String[] args)
    {
        new Stable(3,1);
    }
}
