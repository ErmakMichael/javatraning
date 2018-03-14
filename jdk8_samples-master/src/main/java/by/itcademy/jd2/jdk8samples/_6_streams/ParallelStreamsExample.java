package by.itcademy.jd2.jdk8samples._6_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ParallelStreamsExample {

    public static void main(final String[] args) {
        final int max = 1000000;
        final List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            final UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        sequentialSort(values);
        parallelSort(values);

    }

    private static void sequentialSort(final List<String> values) {

        final long t0 = System.nanoTime();

        final long count = values.stream().sorted().count();
        System.out.println(count);

        final long t1 = System.nanoTime();

        final long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }

    private static void parallelSort(final List<String> values) {
        final long t0 = System.nanoTime();

        final long count = values.parallelStream().sorted().count();
        System.out.println(count);

        final long t1 = System.nanoTime();

        final long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("parallel sort took: %d ms", millis));
    }

}
