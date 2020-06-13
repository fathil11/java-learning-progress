public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public static Contact create(String name, String number) {
        return new Contact(name, number);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
