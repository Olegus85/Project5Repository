package org.olegus.types;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component("personBean")
@Scope("prototype")
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else System.out.println("Возраст не может быть отрицательным!!");
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public int compareTo(Person person1, Person person2) {

        return 0;
    }

    @Override
    public int compareTo(Person person1) {
        return this.age - person1.age;
    }
}
