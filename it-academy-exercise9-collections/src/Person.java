public class Person {
    String firstName;
    String lastName;
    String position;
    int age;

    public Person(String firstName, String lastName, String position, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
}
