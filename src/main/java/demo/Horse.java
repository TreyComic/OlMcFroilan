package demo;

public class Horse extends Animal implements Rideable{


    @Override
    public void makeNoise() {
        System.out.println("The horse goes NEHHHH");
    }


    Rider currentRider;
    private int horseID;
    static int uniqueID=0;
    public Horse() {
        horseID = uniqueID;
        uniqueID++;
    }



    public int getHorseID() {
        return horseID;

    }




}





