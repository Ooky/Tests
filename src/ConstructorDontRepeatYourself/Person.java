package ConstructorDontRepeatYourself;

public class Person {

    public Person(String name, Integer age, String maleFemale) {

    }

    public Person(String name, Integer age) {
        this(name, age, "female");
    }

    public Person(String name) {
        this(name, 1337);
    }

    public Person() {
        this("dummy");
    }
}
