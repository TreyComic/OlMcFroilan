package demo;

public class Pilot extends Person
{
    public Pilot(String name)
    {
        super(name);
    }
    @Override
    public void mount(Rideable riddenObject)
    {
        super.setMount(riddenObject);
    }
}
