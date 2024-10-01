import javax.swing.*;

public abstract class Flora implements Water {

    /* Mina variabler är private för inkapsulering
    det finns getters för dom värdena som behövs
    det finns inga setters för det är dom limitationerna
    jag har satt på programmet efter uppgiftens beskrivning
     */

    private final int heightInCM;
    private final String name;
    private final Drink drink;
    private final String species;

    public Flora(int heightInCM, String name, Drink drink, String species) {
        this.heightInCM = heightInCM;
        this.name = name;
        this.drink = drink;
        this.species = species;
    }

    // Alla specifika plantor ärver den här metoden så calculateWaterNeeded() kommer ge den plantas uträkning
    public void printWaterNeeded(){
        double waterNeeded = calculateWaterNeeded();
        waterNeeded = Math.round(waterNeeded * 100.0) / 100.0; // Forcera högst 2 decimaler
        String waterNeededPrompt = waterNeeded < 1 ? waterNeeded * 100 + " cl" : waterNeeded + " liter";
        JOptionPane.showMessageDialog(null,
                "The " + this.species + " " + this.name + " needs " + waterNeededPrompt
                        + " of " + this.drink.getDisplayDrink() + " each day.");
    }

    public int getHeightInCM() {
        return heightInCM;
    }

    public String getName() {
        return name;
    }
}
