package demo;

public class TomatoPlant extends Crop
{
    @Override
    public Edible yield() {
        if(this.isFertilized && !this.hasBeenHarvested){
            this.setHasBeenHarvested(true);
            return new Tomato();
        } else {
            return null;
        }
    }
    public String toString()
    {
        return "tomato plant";
    }
}
