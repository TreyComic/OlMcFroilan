package demo;

public abstract class Crop implements Produce {
    boolean hasBeenHarvested;
    boolean isFertilized;

    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
