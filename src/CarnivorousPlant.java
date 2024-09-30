public class CarnivorousPlant extends Flora{

    public CarnivorousPlant(int heightInCM, String name) {
        super(heightInCM, name, Drink.PROTEIN_DRINK, "carnivorous plant");
    }

    @Override
    public double calculateWaterNeeded(){
        double baseWaterNeed = 0.1;
        double additionalWaterPerMeter = 0.2;
        double heightInMeters = (double) this.getHeightInCM() / 100;
        double additionalWater = additionalWaterPerMeter * heightInMeters;
        return baseWaterNeed + additionalWater;
    }
}
