public class Book {
    Author author;
    int pages;
    int year;

    public Book(Author author, int pages, int year) {
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    @Override
    public String toString() {
        return "  Book {\n" +
                "    Страниц: " + pages + "\n" +
                "    Год выпуска: " + year + "\n" +
                author + "\n" +
                "  }";
    }
}
