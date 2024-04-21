package demo;

public class Person implements NoiseMaker,Eater,Rider
{
    private String name;
    private Rideable riddenObject;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Person(String name)
    {
        this.name = name;
    }
    @Override
    public void mount(Rideable riddenObject)
    {
        if (riddenObject.getClass()!=Cropduster.class)
        {
            this.riddenObject=riddenObject;
        }
        else
            System.out.println(name+ " doesn't know how to fly an Aircraft!");
    }
    @Override
    public void dismount()
    {
        System.out.println(name+" gets off of "+riddenObject.toString());
        this.riddenObject=null;
    }
    public void Ride()
    {
        System.out.println(name + " rides "+ riddenObject.toString());
    }
    public void eat(Edible edible)
    {
        System.out.println(name+" eats "+edible);
    }
    public void makeNoise()
    {
        System.out.println(name+" screams.");
    }
}
