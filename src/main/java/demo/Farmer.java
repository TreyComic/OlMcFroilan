package demo;

public class Farmer extends Person implements Botanist {
    public Farmer(String name) {
        super(name);
    }

    @Override
    public void plant(Crop plantCrop) {

    }
    @Override
    public void eat(Edible edible) {

    }
    @Override
    public void makeNoise()
    {
        System.out.println("");
    }

    @Override
    public void mount() {

    }

    @Override
    public void disMount() {

    }
}
