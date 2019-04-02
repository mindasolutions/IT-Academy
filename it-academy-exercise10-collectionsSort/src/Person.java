import java.util.*;
import java.util.stream.Collectors;

public class Person {
    String name;
    String surname;
    int age;
    Set<Person> family = new HashSet<>();

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void addFamilyMember(Person member) {
        family.add(member);
    }

    void getFamilyMembers() {
        ArrayList<Person>  familySorted = new ArrayList<>();
        familySorted.addAll(this.family);
        Collections.sort(familySorted, new PersonAgeComparator());

        for(Iterator<Person> person = familySorted.iterator(); person.hasNext();) {
            System.out.print(person.next());
            if(person.hasNext()) {
                System.out.print(", ");
            }
        }
    }


    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname();
    }
}
