public class PalmTree extends Flora{

    public PalmTree(int heightInCM, String name){
        super(heightInCM, name, Drink.MINERAL_WATER, "palm tree");
    }

    @Override
    public double calculateWaterNeeded() {
        double waterPerMeter = 0.5;
        double heightInMeters = (double) this.getHeightInCM() / 100;
        return waterPerMeter * heightInMeters;
    }
}
