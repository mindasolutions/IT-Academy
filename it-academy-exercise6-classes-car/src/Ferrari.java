public class Ferrari {
    public final String fuel;
    public static int numberOfSeats;
    private int mileage;

    public Ferrari(String fuel, int numberOfSeats, int mileage) {
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeats;
        this.mileage = mileage;
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

    public static void setNumberOfSeats(int numberOfSeats) {
        Ferrari.numberOfSeats = numberOfSeats;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
