import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        Person person1 = new Person("John", "Smith", 45);
        Person person2 = new Person("Alice", "Smith", 43);
        Person person3 = new Person("John", "Doe", 34);
        Person person4 = new Person("Joshua", "Smith", 20);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        for(Person person : people) {
            for(Person per : people) {
                if(person.hashCode() == per.hashCode()) {
                    continue;
                }
                if(person.getSurname() == per.getSurname()) {
                    person.addFamilyMember(per);
                }
            }
        }

        //printing people
        for(Person person : people) {
            System.out.println(" - " +person);
            person.getFamilyMembers();
            System.out.println("");
        }
    }
}
