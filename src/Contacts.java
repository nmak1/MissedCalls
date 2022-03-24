import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Contacts {
    public Map<String, Contact> contacts = new HashMap<>();


    public Contact getContacts(String phone) {
        return contacts.get(phone);
    }


    public void addContacts(String input, Contact contact) {
        contacts.put(input, contact);

    }

    public void printHashMap() {
        System.out.println("телефонная книга");
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println("Номер телефрна  " + entry.getKey() + " " + entry.getValue());
        }

    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contacts=" + contacts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacts)) return false;
        Contacts contacts1 = (Contacts) o;
        return contacts.equals(contacts1.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts);
    }
}
