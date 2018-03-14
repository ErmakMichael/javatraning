package by.itcademy.jd2.jdk8samples._4_embedded_functional_i;

import java.util.function.Predicate;

/**
 * Предикаты — это функции, принимающие один аргумент, и возвращающие значение
 * типа boolean. Интерфейс содержит различные методы по умолчанию, позволяющие
 * строить сложные условия (and, or, negate).
 */
public class Predicates {

    public static void main(final String[] args) {
        final Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo"); // true
        predicate.negate().test("foo"); // false

        final Predicate<String> isEmpty = String::isEmpty;
        isEmpty.negate();

    }

}
