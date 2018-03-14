package by.itcademy.jd2.jdk8samples._3_method_ref.method;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}