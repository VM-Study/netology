public class User {
    String email;
    String firstName;
    String lastName;
    Book book;

    public User(String email, String firstName, String lastName, Book book) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.book = book;
    }

    @Override
    public String toString() {
        return "User {\n" +
                "  Имя: " + firstName + '\n' +
                "  Фамилия: " + lastName + '\n' +
                "  E-mail: " + email + '\n' +
                book +
                "\n}";
    }
}

