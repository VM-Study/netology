import java.util.Objects;

public class Contact implements Comparable<Contact>{
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Contact o) {
        return (this.name.compareTo(o.name));
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Телефон: " + phone;
    }


}
