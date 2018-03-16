package by.itcademy.jd2.jdk8samples._1_lambda.params;

public class ExampleMultipleParam {
    interface StringConcat {

        public String sconcat(String a, String b);
    }

    public static void main(final String args[]) {
        // lambda expression with multiple arguments
        // () обязательны
        final StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: " + s.sconcat("Hello ", "World"));
    }
}