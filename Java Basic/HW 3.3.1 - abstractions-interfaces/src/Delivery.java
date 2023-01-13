public class Delivery implements Supplier, Reader {
    private final String name;

    public Delivery(String name) {
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
    public void deliverBook(String book) {
        System.out.println("Книга [" + book + "] доставлена в библиотеку поставщиком [" + name + "]");
    }

    @Override
    public String toString() {
        return name;
    }
}
