package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("");
        person1.setLastName("");
        person1.setAge(19);

        System.out.println(person1.isTeen());
    }
}
