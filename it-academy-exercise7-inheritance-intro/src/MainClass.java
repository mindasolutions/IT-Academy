public class MainClass {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari("red", "diesel");
        Car car = new Car("pink", "lpg");

        ferrari.drive();
        car.drive();

        ferrari.clean();
        car.clean();

        //question: which clean() method is invoked on each instance?
        //answer: for each instanse method clean() is use on own class.

    }
}
