package by.itcademy.jd2.jdk8samples._6_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsExample {

    public static void main(final String[] args) {
        final List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        exampleFilter(stringCollection);

        exampleSorted(stringCollection);

        exampleMap(stringCollection);

        exampleMatch(stringCollection);

        exampleCount(stringCollection);

        exampleReduce(stringCollection);
    }

    private static void exampleReduce(final List<String> stringCollection) {
        final Optional<String> reduced = stringCollection.stream().sorted()
                .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
        // "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"
    }

    private static void exampleCount(final List<String> stringCollection) {
        final long startsWithB = stringCollection.stream()
                .filter((s) -> s.startsWith("b")).count();

        System.out.println(startsWithB); // 3
    }

    private static void exampleFilter(final List<String> stringCollection) {
        stringCollection.stream().filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        // "aaa2", "aaa1"
    }

    private static void exampleSorted(final List<String> stringCollection) {
        stringCollection.stream().sorted().filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        // "aaa1", "aaa2"
    }

    private static void exampleMap(final List<String> stringCollection) {
        stringCollection.stream().map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
    }

    private static void exampleMatch(final List<String> stringCollection) {
        final boolean anyStartsWithA = stringCollection.stream()
                .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA); // true

        final boolean allStartsWithA = stringCollection.stream()
                .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA); // false

        final boolean noneStartsWithZ = stringCollection.stream()
                .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ); // true
    }

}
