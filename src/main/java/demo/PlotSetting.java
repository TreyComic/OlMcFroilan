package demo;

public class PlotSetting
{
    public static void main(String[] args)
    {
        Farmer farmerFroilan = new Farmer("Farmer Froilan");
        Pilot sisterFroilanda = new Pilot("Froilanda");
        Person[] personArray = new Person[]{farmerFroilan,sisterFroilanda};
        Farm daFarm = new Farm(3,4,5,4,4);
        daFarm.getFarmhouse().setPeople(personArray);
        farmerFroilan.plant(daFarm.getField(),"tomato plant",0);
        farmerFroilan.plant(daFarm.getField(),"corn stalk",1);
        Stable[] stables=daFarm.getStables();
        stables[0].fillStable();
        ChickenCoop[] chickens=daFarm.getCoopsChicken();
        chickens[0].fillCoop();
    }
}
