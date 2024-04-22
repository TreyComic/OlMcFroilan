package demo;

public abstract class Person implements NoiseMaker,Eater,Rider
{
    private String name;
    private Rideable riddenObject;

    public Person(String name)
    {
        this.name = name;
    }
    public void mount(Rideable riddenObject)
    {
        this.riddenObject=riddenObject;
    }

    public void dismount()
    {
        System.out.println(name+" gets off of "+riddenObject.toString());
        this.riddenObject=null;
    }

    public void Ride()
    {
        System.out.println(name + " rides Horse #" + riddenObject.toString());
    }
}
