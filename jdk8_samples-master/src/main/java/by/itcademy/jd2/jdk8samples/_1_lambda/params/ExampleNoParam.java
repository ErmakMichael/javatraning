package by.itcademy.jd2.jdk8samples._1_lambda.params;

public class ExampleNoParam {
/*
     @FunctionalInterface -- проверка интерфейса на наличие только одного
     абстрактного метода. Используются для лямбда выражений которые работают
     только с 1 методом

*/    @FunctionalInterface
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