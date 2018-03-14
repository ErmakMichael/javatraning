package by.itcademy.jd2.jdk8samples._1_lambda.iteration;

import java.util.ArrayList;
import java.util.List;

public class ExampleIteration {
    public static void main(final String[] args) {
        final List<String> list = new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
        list.forEach((name) -> System.out.println(name));
    }
}
