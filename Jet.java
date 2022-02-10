class Jet extends Vehicle {

    double mach;
    final int flightTime; //hrs

    public Jet(String manufacturer, String name, int age, int maxSpeed, int passengerCount, boolean usable, int flightTime) {
        super(manufacturer, name, age, maxSpeed, passengerCount, usable, "air");
        this.flightTime = flightTime;
        this.mach = maxSpeed / 1234
    }


    public double getMach() {
        return this.mach;
    }

    public void setMach() {
        this.mach = this.getMaxSpeed() / 1234
    }

    public int getFlightTime() {
        return this.flightTime;
    }
    

}