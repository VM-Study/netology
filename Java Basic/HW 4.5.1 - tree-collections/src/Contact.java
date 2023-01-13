import java.util.HashMap;
import java.util.Map;

public class Contact {
    String firstName;
    String lastName;
    String phone;
    Enum group;

    public Contact(String firstName, String lastName, String phone, Enum group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + phone + " [" + group + "]";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(Enum group) {
        this.group = group;
    }
}

