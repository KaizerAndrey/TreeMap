import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> person = new LinkedList<>();

        person.add(new Person("Ivan", "Tsarevich son", 23));
        person.add(new Person("Evpatiy", "Kolovrat son", 28));
        person.add(new Person("Alyosha", "Popovic first eldest son", 19));
        person.add(new Person("Ilya", "Muromets eldest son", 45));
        person.add(new Person("Dobrynya", "Nikitich", 28));

        Collections.sort(person, new PersonComparator<Person>(5));
        System.out.println(person);

        Collections.sort(person, new PersonComparator<Person>(1));
        System.out.println(person);
    }
}
