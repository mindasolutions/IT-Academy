public class MainClass {
    public static void main(String[] args) {

        Ferrari myFerrari = new Ferrari("ON", 2, 13000);

        System.out.println("--- myFerrari ---");
        System.out.println("Fuel type: " + myFerrari.getFuel());
        System.out.println("Current mileage: " + myFerrari.getMileage());
        System.out.println("Number of seats: " + myFerrari.getNumberOfSeats());
        System.out.println();

        Ferrari myFerrari2 = new Ferrari("95", 4, 11000);

        System.out.println("--- myFerrari2 ---");
        System.out.println("Fuel type: " + myFerrari2.getFuel());
        System.out.println("Current mileage: " + myFerrari2.getMileage());
        System.out.println("Number of seats: " + myFerrari2.getNumberOfSeats());
        System.out.println();

        System.out.println("After changing numberOfSeats, myFerrari shows: " + myFerrari.getNumberOfSeats());
        System.out.println("Now i change Ferrari.numberOfSeats to 3");
        myFerrari.numberOfSeats = 3;
        System.out.println();

        System.out.println("myFerrari shows: " + myFerrari.getNumberOfSeats());
        System.out.println("myFerrari2 shows: " + myFerrari.getNumberOfSeats());
        // myFerrari.mileage = 30000; - cannot, private var
        // myFerrari.fuel = "Diesel"; - cannot, final var
    }
}
