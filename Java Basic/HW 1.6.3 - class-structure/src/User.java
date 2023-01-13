public class User {

    static int totalOnline;
    static {
        totalOnline = 0;
    }

    String email;
    String firstName;
    String lastName;

    public User(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        totalOnline++;
    }
}
