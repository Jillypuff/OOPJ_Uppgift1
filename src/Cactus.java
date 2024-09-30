public class Cactus extends Flora{

    public Cactus(int heightInCM, String name) {
        super(heightInCM, name, Drink.TAP_WATER, "cactus");
    }

    @Override
    public double calculateWaterNeeded() {
        double waterNeededDaily = 0.02;
        return waterNeededDaily;
    }
}
