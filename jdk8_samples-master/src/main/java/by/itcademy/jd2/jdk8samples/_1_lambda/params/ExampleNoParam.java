package by.itcademy.jd2.jdk8samples._1_lambda.params;

public class ExampleNoParam {

    @FunctionalInterface
    interface MyFunctionalInterface {

        // A method with no parameter
        public String sayHello();
    }

    public static void main(final String args[]) {
        // lambda expression
        final MyFunctionalInterface msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());
    }
}