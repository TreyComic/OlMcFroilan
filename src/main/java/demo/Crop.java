package demo;

public abstract class Crop implements Produce {
    boolean hasBeenHarvested;
    boolean isFertilized;
    public Crop()
    {
        hasBeenHarvested=false;
        isFertilized=false;
    }
    public void setFertilized(boolean fertilized)
    {
        isFertilized = fertilized;
    }
    public abstract Edible yield();


    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
