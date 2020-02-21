package ArrayLists;

public class Contacts {
    private String name;
    private long number;
    public Contacts (String name) {
        this.name = name;
    }
    public Contacts(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static Contacts createContact(String name, long number) {
        return new Contacts(name, number);
    }
}
