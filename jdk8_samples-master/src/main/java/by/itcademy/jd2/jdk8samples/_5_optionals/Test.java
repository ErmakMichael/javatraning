package by.itcademy.jd2.jdk8samples._5_optionals;

import java.util.Optional;

public class Test {

    public static void main(final String[] args) {
        final Optional<String> optional = Optional.of("bam");

        System.out.println(optional.isPresent()); // true
        System.out.println(optional.get()); // "bam"
        System.out.println(optional.orElse("fallback")); // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0))); // "b"

    }

}
