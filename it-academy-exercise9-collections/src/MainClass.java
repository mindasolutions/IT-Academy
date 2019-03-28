import com.github.javafaker.Faker;

import java.util.*;


public class MainClass {
    public static void main(String[] args) {
        List<Person> employees = new LinkedList<>();

        Faker faker = new Faker(new Locale("pl"));

        for (int i = 0; i < 5; i++) {
            Person person = new Person(faker.name().firstName(), faker.name().lastName(), faker.job().position(), faker.number().numberBetween(16, 35));
            employees.add(person);
            employees.add(person);
        }

        Set<Person> uniqueEmployees = new HashSet<>(employees);

        // question: How many Johns do we have in Set? Why?
        // answer: We are have only unique values without duplicates. List can have duplicated records, Set don't.

        Map<String, Person> nameToPerson = new HashMap<>();

        // extra try to use 'foreach' loop
        for (Person empl : employees) {
            nameToPerson.put(empl.getFirstName(), empl);
        }

        System.out.println("Person size=" + employees.size());
        System.out.println("Set size=" + uniqueEmployees.size());
        System.out.println("Map size=" + nameToPerson.size());

        //question: Are sizes of Set and HashMap the same? Should be?
        //answer: Yes. Set and HashMap doesn't allow duplicated records.
    }
}
