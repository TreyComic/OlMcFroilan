package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest
{
    @Test
    void test1()
    {
        Farm farmTime = new Farm();
        Farmer farmerOne=new Farmer("Colin Schmolin");
        assert(farmTime.getField()!=null);
    }
    @Test
    void test2()
    {
        Farm farmTime = new Farm(3,3,3,3,3);

        assert(farmTime.getField()!=null);
    }
}