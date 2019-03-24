public class Scania extends Car {

    public Scania(String color, String fuelType) {
        super(color, fuelType);
    }

    @Override
    protected void changeTires() {
        System.out.println("I am changing my scania tires for winter");
    }
}
