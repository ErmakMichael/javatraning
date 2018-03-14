package by.itcademy.jd2.jdk8samples._1_lambda.params;

public class ExampleSingleParam {
    @FunctionalInterface
    interface MyFunctionalInterface {

        // A method with single parameter
        public int incrementByFive(int a);
    }

    public static void main(final String args[]) {
        // lambda expression with single parameter num
        final MyFunctionalInterface f = (num) -> num + 5;
        System.out.println(f.incrementByFive(22));
    }
}