package by.itcademy.jd2.jdk8samples._4_embedded_functional_i;

import java.util.function.Function;

/**
 * Функции принимают один аргумент и возвращают некоторый результат. Методы по
 * умолчанию могут использоваться для построения цепочек вызовов (compose,
 * andThen).
 */
public class Functions {

    public static void main(final String[] args) {
        final Function<String, Integer> toInteger = Integer::valueOf;
        final Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123"); // "123"

    }

}
