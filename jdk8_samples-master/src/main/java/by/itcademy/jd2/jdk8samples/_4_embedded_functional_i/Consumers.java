package by.itcademy.jd2.jdk8samples._4_embedded_functional_i;

import java.util.function.Consumer;

import by.itcademy.jd2.jdk8samples.Person;

/**
 * Потребители (consumers) представляют собой операции, которые производятся на
 * одним входным аргументом.
 */
public class Consumers {

    public static void main(final String[] args) {
        final Consumer<Person> greeter = (p) -> System.out
                .println("Hello, " + p.getFirstName());
        greeter.accept(new Person("Luke", "Skywalker"));

    }

}
