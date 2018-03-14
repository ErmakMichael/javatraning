package by.itcademy.jd2.jdk8samples._3_method_ref.constructor;

import by.itcademy.jd2.jdk8samples.Person;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}