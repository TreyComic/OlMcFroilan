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
        System.out.println(name+" constructed...");
    }
    @Override
    public void mount(Rideable riddenObject)
    {
       // if (riddenObject.getClass()!=Cropduster.getClass())
        // {
            this.riddenObject=riddenObject;
            //}
        // else
        //    System.out.println(name+ " doesn't know how to fly an Aircraft!");
    }
    protected void setMount(Rideable setMount)
    {
        this.riddenObject=setMount;
        //This is protected because we don't want to be able to call this personally, we want to call it from the mount
        //method on pilot so that we can set the riddenObject to a cropduster without going through the if statement on Mount.
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
