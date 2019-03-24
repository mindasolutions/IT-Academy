public class Car implements Vehicle {
    private String color;
    private String fuelType;

    public Car(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    protected void startEngine() {
        System.out.println("Engine started");
    }

    protected static void clean() {
        System.out.println("You are use wipers and clean front window");
    }

    protected void changeTires() {
        System.out.println("I am changing my car tires for winter");
    }

    //question: - create method:
    //        - @Override protected void changeTires()
    //        - is @Override annotation applicable everywhere?

    // answer: no, it's only available on child methods. First method cannot be overwrite

    public void drive() {
        this.startEngine();
        System.out.println("I am driving with speed 50km/h");
    }
}
