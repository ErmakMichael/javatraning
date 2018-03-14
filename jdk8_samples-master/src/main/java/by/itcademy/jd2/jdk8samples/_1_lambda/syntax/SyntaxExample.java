package by.itcademy.jd2.jdk8samples._1_lambda.syntax;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SyntaxExample {

    public static void main(final String[] args) {
        final List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        v1(names);
        v2(names);
        v3(names);
        v4(names);
    }

    private static void v1(final List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(final String a, final String b) {
                return b.compareTo(a);
            }
        });
    }

    private static void v2(final List<String> names) {
        Collections.sort(names, (final String a, final String b) -> {
            return b.compareTo(a);
        });
    }

    private static void v3(final List<String> names) {
        Collections.sort(names, (final String a, final String b) -> b.compareTo(a));
    }

    private static void v4(final List<String> names) {
        Collections.sort(names, (a, b) -> b.compareTo(a));
    }
}
