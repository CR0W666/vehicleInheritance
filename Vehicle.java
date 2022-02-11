class Vehicle {

    String manufacturer;
    String name;
    int age; //yrs
    int maxSpeed; //kmh
    final int passengerCount;
    boolean usable; 
    String type; // land | air | water

    public Vehicle(String manufacturer, String name, int age, int maxSpeed, int passengerCount, boolean usable, String type) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.age = age;
        this.maxSpeed = maxSpeed;
        this.passengerCount = passengerCount;
        this.usable = usable;
        this.type = type;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPassangerCount() {
        return this.passengerCount;
    }

    public boolean isUsable() {
        return this.usable;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

}