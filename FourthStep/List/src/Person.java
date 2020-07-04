public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person createPerson(String name, int age){
        return new Person(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
