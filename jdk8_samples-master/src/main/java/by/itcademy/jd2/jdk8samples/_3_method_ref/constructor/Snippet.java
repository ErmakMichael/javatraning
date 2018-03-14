package by.itcademy.jd2.jdk8samples._3_method_ref.constructor;

import by.itcademy.jd2.jdk8samples.Person;

public class Snippet {

    public static void main(final String[] args) {
        final PersonFactory<Person> personFactory = Person::new;
        personFactory.create("Peter", "Parker");
    }
}
