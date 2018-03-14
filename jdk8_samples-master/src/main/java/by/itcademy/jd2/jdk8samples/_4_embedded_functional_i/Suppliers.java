package by.itcademy.jd2.jdk8samples._4_embedded_functional_i;

import java.util.function.Supplier;

import by.itcademy.jd2.jdk8samples.Person;

/**
 * Поставщики (suppliers) предоставляют результат заданного типа. В отличии от
 * функций, поставщики не принимают аргументов.
 */
public class Suppliers {

    public static void main(final String[] args) {
        final Supplier<Person> personSupplier = Person::new;
        personSupplier.get(); // new Person

    }

}
