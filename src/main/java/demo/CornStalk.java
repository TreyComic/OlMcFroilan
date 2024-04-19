package demo;

public class CornStalk extends Crop{
    @Override
    public Edible yield() {
        if(this.isFertilized && this.hasBeenHarvested == false){
            this.setHasBeenHarvested(true);
            return new EarCorn();
        } else {
            return null;
        }
    }
}
