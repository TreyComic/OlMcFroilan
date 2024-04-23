package demo;

public class Tractor implements FarmVehicle, Vehicle, Rideable {

    @Override
    public void operate(Field field) {
    }

    @Override
    public void makeNoise() {
        System.out.println("Clunk Clunk");
    }

    @Override
    public Crop[][] harvest(Crop[][] field) {
        if (field == null || field.length == 0)
            return new Crop[0][0];
        int rows = field.length;
        int col = field[0].length;
        Crop[][] cropsHarvested = new Crop[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int x = 0; x < col; x++) {
                Crop currentCrop = field[i][x];
                if (currentCrop != null && currentCrop.isHasBeenHarvested(false))
                    if (currentCrop instanceof TomatoPlant) {
                        cropsHarvested[i][x] = new TomatoPlant();
                    } else if (currentCrop instanceof CornStalk) {
                        cropsHarvested[i][x] = new CornStalk();

                        currentCrop.isHasBeenHarvested(true); // Mark as harvested
                    } else if (currentCrop != null) {
                        currentCrop.isHasBeenHarvested(false); // Mark as not harvested
                    }
                field[i][x] = null; // Clear the spot
            }
        }
        return cropsHarvested;
    }
}
