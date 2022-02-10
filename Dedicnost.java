class Dedicnost {
    public static void main(String[] args) {
        //String manufacturer, String name, int age, int maxSpeed, int passengerCount, boolean usable, int numOfWheels, String fuelType
        Car car = new Car("skoda auto", "rapid", 69, 420, 5, true, 4, "benzin");
        //String manufacturer, String name, int age, int maxSpeed, boolean usable, boolean fishingCapable
        MotorBoat boat = new MotorBoat("muj tata", "lochneska", 16, 666, 2, true, true);
        //String manufacturer, String name, int age, int maxSpeed, int passengerCount, boolean usable, int flightTime
        Jet jet = new Jet("WolksVagen", "Sveg", 3, 999999, 2, true, 64);
    
        System.out.println("auto: " + car.getName());
        System.out.println("lod: " boat.getName());
        System.out.println("stihacka: " jet.getName());
    }
}