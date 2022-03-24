import java.util.Objects;

public class Contact {
    private String name;
    private String surname;
    private Enum group;

    public Contact(String name, String surname, Enum group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }



    @Override
    public String toString() {
        return  name + ' '  + surname ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name) && surname.equals(contact.surname)  && group.equals(contact.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, group);
    }
}
