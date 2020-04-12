package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("name1", 23));
        people.add(new Person("name2", 12));
        people.add(new Person("name3", 56));
        people.add(new Person("name4", 6));
        people.add(new Person("name5", 28));

        System.out.println("Compare by age: ");

        people
                .stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

        System.out.println("Compare by name");

        people
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
