package demo;

public class ChickenCoop
{
    Chicken[] chickens;
    public ChickenCoop(int capacity)
    {
        chickens = new Chicken[capacity];
        System.out.println("Coop constructed");
    }
    public Chicken[] getChickens()
    {
        return chickens;
    }
    public void setChickens(Chicken[] replacements)
    {
        chickens = replacements;
    }
    public Chicken getChicken(int chickenLocation)
    {
        return chickens[chickenLocation];
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
        System.out.println("Stable filled with "+counter+" horses.");
    }
}
