package by.itcademy.jd2.jdk8samples._8_annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Hints.class)
@interface Hint {
    String value();
}