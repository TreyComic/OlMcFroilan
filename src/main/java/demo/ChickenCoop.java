package demo;

public class ChickenCoop
{
    Chicken[] chickens;
    public ChickenCoop(int capacity)
    {
        chickens = new Chicken[capacity];
        System.out.println("Coop with room for "+capacity+" chickens constructed");
    }
    public ChickenCoop(int chickenCapacity,int emptyCoopSpots)
    {

        System.out.println("Stable with room for "+chickenCapacity+" constructed, with "+emptyCoopSpots+" empty spots.");
        this.chickens=new Chicken[chickenCapacity];
        int filledStables=chickenCapacity-emptyCoopSpots;
        for(int i=0;i<filledStables;i++)
        {
            Chicken currentChicken=chickens[i];
            currentChicken=new Chicken();
        }
    }
    public Chicken[] getChickens()
    {
        return chickens;
    }
    public void setChickens(Chicken[] replacements)
    {
        chickens = replacements;
    }
    public Chicken getChicken(int chickenIndex)
    {
        return chickens[chickenIndex];
    }
    public void setHorse(Chicken chicken,int chickenLocation)
    {
        this.chickens[chickenLocation] = chicken;
    }
    public void fillCoop(int chickenFill)
    {
        int counter=0;
        for(int i=0;i<chickenFill;i++)
        {
            chickens[i]=new Chicken();
            counter++;
        }
        System.out.println("Coop filled with "+counter+" chickens.");

    }
    public void fillCoop()
    {
        int counter=0;
        for(int i=0;i<chickens.length;i++)
        {
            chickens[i]=new Chicken();
            counter++;
        }
        System.out.println("Coop filled with "+counter+" chickens.");
    }
    public static void main(String[] args)
    {
        ChickenCoop chickens =new ChickenCoop(3,1);
        System.out.println(chickens.getChicken(2));
    }
}
