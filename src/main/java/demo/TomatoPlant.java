package demo;

public class TomatoPlant extends Crop {

    @Override
    public Edible yield() {
        if(this.isFertilized && this.hasBeenHarvested == false){
            this.setHasBeenHarvested(true);
            return new Tomato();
        } else {
            return null;
        }
    }
}
