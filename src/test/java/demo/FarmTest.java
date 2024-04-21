package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest
{
    @Test
    void test1()
    {
        Farm farmTime = new Farm();
        Field workinField=farmTime.getField();
        Farmer farmguy = new Farmer("Farm Man");
        farmguy.plant(workinField,"Tomato Plant",3);
        Crop[] cropRowTest = farmTime.getField().getRowCrops(3).getCrops();
    }
    @Test
    void test2()
    {
        Farm farmTime = new Farm(3,3,3,3,3);
        assert(farmTime.getField().getRowCrops().length == 3);
    }
}