class MotorBoat extends Vehicle {

    final boolean fishingCapable;

    public MotorBoat(String manufacturer, String name, int age, int maxSpeed, int passengerCount, boolean usable, boolean fishingCapable) {
        super(manufacturer, name, age, maxSpeed, passengerCount, usable, "water");
        this.fishingCapable = fishingCapable;
    }


    public boolean isFishingCapable() {
        return this.fishingCapable;
    }

}