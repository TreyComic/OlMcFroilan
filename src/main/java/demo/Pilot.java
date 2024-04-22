package demo;

public class Pilot extends Person
{
    private Cropduster personalPlane;
    public Pilot(String name)
    {
        super(name);
        personalPlane=new Cropduster();
        System.out.println(name+" contstructed");
    }
    @Override
    public void mount(Rideable riddenObject)
    {
        super.mount(riddenObject);
    }
    public void mount()
    {
        super.setMount(personalPlane);
    }
    public void mount(Aircraft airplane)
    {
        super.setMount(airplane);
    }
}
