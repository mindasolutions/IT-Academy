public class Ferrari extends Car {
    public Ferrari(String color, String fuelType) {
        super(color, fuelType);
    }

    //question: How many parameters should it have?
    //answer: When we use super(); - we need as many parameters as the constructor contains. We can define parameter static, without variable, but number parameters should be be same.

    //question: Can I do not create constructor at all or different size input parameters than parent?
    //answer: Only if parent had overloaded constructor or if we don't user super(); keyword.


    @Override
    public void drive() {
        setFuelType("gasoline");
        setColor("Red");
        startEngine();
        System.out.println("I am driving with speed 120km/h");
        super.drive();
    }

    protected static void clean() {
        System.out.println("You are use wipers and fluid and clean front window");
    }

    @Override
    protected void changeTires() {
        System.out.println("I am changing my ferrari tires for winter");
    }

    //question: which statement is true: hide or override?
    //answer: hide

    //question: can I use @Override annotation?
    //answer: no, we can't override static method
}
