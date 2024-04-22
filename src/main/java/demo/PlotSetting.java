package demo;

public class PlotSetting
{
    public static void main(String[] args)
    {
        Farmer farmerFroilan = new Farmer("Farmer Froilan");
        Pilot sisterFroilanda = new Pilot("Froilanda");
        Person[] personArray = new Person[]{farmerFroilan,sisterFroilanda};
        Farm daFarm = new Farm(1,1,1,1,1);
        daFarm.getFarmhouse().setPeople(personArray);
        farmerFroilan.plant(daFarm.getField(),"tomato plant",0);
    }
}
