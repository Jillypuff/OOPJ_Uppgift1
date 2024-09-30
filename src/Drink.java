public enum Drink {
    TAP_WATER("tap water"),
    MINERAL_WATER("mineral water"),
    PROTEIN_DRINK("protein drink");

    private final String displayDrink;

    Drink(String displayDrink) {
        this.displayDrink = displayDrink;
    }

    public String getDisplayDrink() {
        return displayDrink;
    }
}
