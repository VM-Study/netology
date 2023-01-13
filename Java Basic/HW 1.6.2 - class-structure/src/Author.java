public class Author {
    String firstName;
    String lastName;
    int birthday;
    String country;

    public Author(String firstName, String lastName, int birthday, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.country = country;
    }

    @Override
    public String toString() {
        return  "    Имя автора: " + firstName + '\n' +
                "    Фамилия автора: " + lastName + '\n' +
                "    Год рождение автора: " + birthday + "\n" +
                "    Страна рождение автора: " + country;
    }
}
