public class MainClass {
    public static void main(String[] args) {

        Ferrari myFerrari = new Ferrari("ON", 2, 13000);

        System.out.println("--- myFerrari ---");
        System.out.println("Fuel type: " + myFerrari.getFuel());
        System.out.println("Current mileage: " + myFerrari.getMileage() + myFerrari.getUnit());
        myFerrari.setMileage(20000);
        System.out.println("Current mileage: " + myFerrari.getMileage() + myFerrari.getUnit());
        myFerrari.setMileage(22000, "km");
        System.out.println("Current mileage: " + myFerrari.getMileage() + myFerrari.getUnit());
        System.out.println("Number of seats: " + myFerrari.getNumberOfSeats());
        System.out.println();

        /*
        Output:
            --- myFerrari ---
            Fuel type: ON
            Current mileage: 13000km
            Current mileage: 20000mil
            Current mileage: 22000km
            Number of seats: 2
         */

        Ferrari myFerrari2 = new Ferrari("95", 4, 11000);

        System.out.println("--- myFerrari2 ---");
        System.out.println("Fuel type: " + myFerrari2.getFuel());
        System.out.println("Current mileage: " + myFerrari2.getMileage() + myFerrari.getUnit());
        System.out.println("Number of seats: " + myFerrari2.getNumberOfSeats());
        System.out.println();

        /*
        Output:
            --- myFerrari2 ---
            Fuel type: 95
            Current mileage: 11000km
            Number of seats: 4
         */

        System.out.println("After changing numberOfSeats, myFerrari shows: " + myFerrari.getNumberOfSeats());
        System.out.println("Now i change Ferrari.numberOfSeats to 3");
        myFerrari.numberOfSeats = 3;
        System.out.println();

        /*
        Output:
            After changing numberOfSeats, myFerrari shows: 4
            Now i change Ferrari.numberOfSeats to 3
         */

        System.out.println("myFerrari shows: " + myFerrari.getNumberOfSeats());
        System.out.println("myFerrari2 shows: " + myFerrari.getNumberOfSeats());
        // myFerrari.mileage = 30000; - cannot, private var
        // myFerrari.fuel = "Diesel"; - cannot, final var

        /*
        Output:
            myFerrari shows: 3
            myFerrari2 shows: 3
         */


    }
}
