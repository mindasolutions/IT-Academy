public class Ferrari {
    public final String fuel;
    public static int numberOfSeats;
    private int mileage;
    private String unit;

    public Ferrari(String fuel, int numberOfSeats, int mileage) {
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeats;
        this.mileage = mileage;
        this.unit = "km";
    }

    public String getFuel() {
        return fuel;
    }

    public static int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getMileage() {
        return mileage;
    }

    public String getUnit() {
        return unit;
    }

    public static void setNumberOfSeats(int numberOfSeats) {
        Ferrari.numberOfSeats = numberOfSeats;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
        this.unit = "mil";
    }

    public void setMileage(int mileage, String unit) {
        this.mileage = mileage;
        this.unit = unit;
    }

    //public String setFuel(String typeOfFuel) { this.fuel = typeOfFuel}; - setter cannot be created for final var.
}
