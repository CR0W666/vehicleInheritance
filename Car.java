class Car extends Vehicle {
    
    final int numOfWheels;
    final String fuelType; // electric | boring | lpg

    public Car(String manufacturer, String name, int age, int maxSpeed, int passengerCount, boolean usable, int numOfWheels, String fuelType) {
        super(manufacturer, name, age, maxSpeed, passengerCount, usable, "land");
        this.numOfWheels = numOfWheels;
        this.fuelType = fuelType;
    }


    public int getNumOfWheels() {
        return this.numOfWheels;
    }


    public String getFuelType() {
        return this.fuelType;
    }

    public void tune(int someValue) {
        this.setMaxSpeed(maxSpeed * someValue);
    }
}