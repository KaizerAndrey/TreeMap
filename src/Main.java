import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> person = new LinkedList<>();

        person.add(new Person("Ivan", "Tsarevich son", 23));
        person.add(new Person("Evpatiy", "Kolovrat son", 28));
        person.add(new Person("Alyosha", "Popovic first eldest son", 19));
        person.add(new Person("Ilya", "Muromets eldest son", 45));
        person.add(new Person("Dobrynya", "Nikitich", 28));

        Comparator <Person> personComparator = (Person o1, Person o2) -> {

            TreeSet<String> text = new TreeSet<>(List.of(o1.getSurname().split("\\P{IsAlphabetic}+")));
            TreeSet<String> text1 = new TreeSet<>(List.of(o2.getSurname().split("\\P{IsAlphabetic}+")));

            if (text.size() > text1.size()) {
                return -1;
            } else if (text.size() < text1.size()) {
                return 1;
            }
            if (o1.getAge() > o2.getAge()) {
                return -1;
            } else if (o1.getAge() < o2.getAge()) {
                return 1;
            }
            return 0;
        };


        Collections.sort(person,personComparator);
        System.out.println(person);

        Collections.sort(person, personComparator);
        System.out.println(person);
    }
}
