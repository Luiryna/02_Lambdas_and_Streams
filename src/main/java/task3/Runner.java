package task3;

import task1.Person;

public class Runner {
    public static void main(String[] args) {
        ThreeFunction<Integer, Integer, Integer, Integer> sum = (a , b, c) -> (a + b + c);
        System.out.println(sum.apply(1, 2, 3));

        ThreeFunction<Person, Person, Person, String> info = (a, b, c) -> (a.toString()+ " " + b.toString() + " " + c.toString());
        System.out.println(info.apply(new Person("name1", 4), new Person("name2", 7),
                new Person("name3", 12)));
    }
}
