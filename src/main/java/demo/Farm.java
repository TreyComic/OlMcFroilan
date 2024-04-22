package demo;

public class Farm
{
    private Field field;
    private Stable[] stables;
    private ChickenCoop[] coopsChicken;
    private FarmHouse farmhouse;
    Farm()
    {
        this.field = new Field(5);
        this.stables=new Stable[3];
        for (int i=0;i<stables.length;i++)
        {
            stables[i]=new Stable(4);
        }
        this.coopsChicken= new ChickenCoop[4];
        for (int i=0;i<coopsChicken.length;i++)
        {
            coopsChicken[i]=new ChickenCoop(4);
        }
        this.farmhouse= new FarmHouse(2);
    }
    Farm(int numberOfStables,int numberOfChickenCoops,int fieldSize)
    {
        this.field = new Field(fieldSize);
        this.stables= new Stable[numberOfStables];
        this.coopsChicken= new ChickenCoop[numberOfChickenCoops];
        this.farmhouse= new FarmHouse(2);
        for (int i=0;i<stables.length;i++)
        {
            stables[i]=new Stable(4);
        }
        for (int i=0;i<coopsChicken.length;i++)
        {
            coopsChicken[i]=new ChickenCoop(4);
        }
    }
    Farm(int numberOfStables,int numberOfChickenCoops,int fieldSize,int coopCapacity,int stableCapacity)
    {
        this.field = new Field(fieldSize);
        this.stables = new Stable[numberOfStables];
        this.coopsChicken = new ChickenCoop[numberOfChickenCoops];
        this.farmhouse = new FarmHouse(2);
        int counter=0;
        for (int i = 0; i < stables.length; i++)
        {
            stables[i] = new Stable(stableCapacity);
            counter=i;
        }
        System.out.println("Constructed "+counter+" stables with a capacity of "+stableCapacity+" horses each.");
        counter=0;
        for (int i = 0; i < coopsChicken.length; i++)
        {
            coopsChicken[i] = new ChickenCoop(coopCapacity);
            counter=i;
        }
        System.out.println("Constructed "+counter+" chicken coops with a capacity of "+coopCapacity+" chickens each.");
    }
    public ChickenCoop[] getCoopsChicken()
    {
        return coopsChicken;
    }
    public void setCoopsChicken(ChickenCoop[] coopsChicken)
    {
        this.coopsChicken = coopsChicken;
    }
    public Stable[] getStables()
    {
        return stables;
    }
    public void setStables(Stable[] stables)
    {
        this.stables = stables;
    }
    public Field getField()
    {
        return field;
    }
    public void setField(Field field)
    {
        this.field = field;
    }
    public FarmHouse getFarmhouse()
    {
        return farmhouse;
    }
    public void setFarmhouse(FarmHouse farmhouse)
    {
        this.farmhouse = farmhouse;
    }

}
