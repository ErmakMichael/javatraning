package by.itcademy.jd2.jdk8samples._4_embedded_functional_i;

import java.util.Comparator;

import by.itcademy.jd2.jdk8samples.Person;

/**
 * Компараторы хорошо известны по предыдущим версиям Java. Java 8 добавляет в
 * интерфейс различные методы по умолчанию.
 */
public class Comparators {

    public static void main(final String[] args) {
        final Comparator<Person> comparator = (p1, p2) -> p1.getFirstName()
                .compareTo(p2.getFirstName());

        final Person p1 = new Person("John", "Doe");
        final Person p2 = new Person("Alice", "Wonderland");

        comparator.compare(p1, p2); // > 0
        comparator.reversed().compare(p1, p2); // < 0
    }

}
