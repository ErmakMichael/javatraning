package by.itcademy.jd2.jdk8samples._2_default_methods;

interface Formula {
    double calculate(int a);

    default double sqrt(final int a) {
        return Math.sqrt(a);
    }
}