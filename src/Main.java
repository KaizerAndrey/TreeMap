import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> person = new LinkedList<>();

        person.add(new Person("Ivan", "Tsarevich son", 16));
        person.add(new Person("Evpatiy", "Kolovrat son", 28));
        person.add(new Person("Alyosha", "Popovic first eldest son", 17));
        person.add(new Person("Ilya", "Muromets eldest son", 45));
        person.add(new Person("Dobrynya", "Nikitich", 28));

        Collections.sort(person, new PersonComparator<>(5));
        System.out.println(person);

        Collections.sort(person, new PersonComparator<>(1));
        System.out.println(person);

        Predicate<Person> personPredicate = pers -> pers.getAge() < 18;

        person.removeIf(personPredicate);
        System.out.println(person);
    }
}
