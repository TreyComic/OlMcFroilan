package demo;

public class ChickenCoop
{
    Chicken[] inhabitants;
    public ChickenCoop(int capacity)
    {
        inhabitants = new Chicken[capacity];
    }
    public Chicken[] getChickens()
    {
        return inhabitants;
    }
    public void setChickens(Chicken[] replacements)
    {
        inhabitants = replacements;
    }
}
