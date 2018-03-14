package by.itcademy.jd2.jdk8samples._8_annotations;

public class Example {

    public static void main(final String[] args) {
        final Hint hint = P.class.getAnnotation(Hint.class);
        System.out.println(hint); // null

        final Hints hints1 = P.class.getAnnotation(Hints.class);
        System.out.println(hints1.value().length); // 2

        final Hint[] hints2 = P.class.getAnnotationsByType(Hint.class);
        System.out.println(hints2.length);

    }

}
