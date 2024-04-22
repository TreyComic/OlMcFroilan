package demo;

public interface Vehicle extends NoiseMaker {
    @Override
    default void makeNoise() {
        System.out.println("Vroom Vroom");
    }
}
