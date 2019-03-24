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

        Scania scania = new Scania("white", "diesel");

        car.changeTires();
        ferrari.changeTires();
        scania.changeTires();

        Car carFerrari = new Ferrari("red", "rocket fuel");
        Car carScania = new Scania("black", "addBlue");

        carFerrari.changeTires();
        carScania.changeTires();

        //Ferrari ferrariScania = new Scania("black", "addBlue"); - incompatible types. Scania and Ferrari extends Car, but Scania dont know what is Ferrari, and same on other side.

    }
}
