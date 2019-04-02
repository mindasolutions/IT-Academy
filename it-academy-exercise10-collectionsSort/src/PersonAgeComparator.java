import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.age == o2.age) {
            return 0;
        } else if (o1.age > o2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
