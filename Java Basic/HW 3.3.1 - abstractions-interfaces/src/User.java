public class User implements Reader {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void rentBook(String book) {
        System.out.println("Книга [" + book + "] взята в рент читателем [" + name + "]");
    }

    @Override
    public void returnBook(String book) {
        System.out.println("Книга [" + book + "] возвращена в библиотеку читателем [" + name + "]");
    }

    @Override
    public String toString() {
        return name;
    }
}
