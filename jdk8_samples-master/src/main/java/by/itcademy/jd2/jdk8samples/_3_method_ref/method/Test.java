package by.itcademy.jd2.jdk8samples._3_method_ref.method;

public class Test {

    public static void main(final String[] args) {

        final Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        final Integer converted = converter.convert("123");
        System.out.println(converted); // 123

        showStaticMethodReference();
        showMethodReference();
    }

    private static void showStaticMethodReference() {
        final Converter<String, Integer> converter = Integer::valueOf;

        final Integer converted = converter.convert("123");
        System.out.println(converted); // 123
    }

    private static void showMethodReference() {
        final Something something = new Something();
        final Converter<String, String> converter = something::startsWith;
        final String converted = converter.convert("Java");
        System.out.println(converted); // "J"
    }

}
