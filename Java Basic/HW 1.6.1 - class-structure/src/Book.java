public class Book {
    String name;
    int idNumber;
    int numberOfPages;
    String author;
    String publisher;

    public Book(String name, int idNumber, int numberOfPages, String author, String publisher) {
        this.name = name;
        this.idNumber = idNumber;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.publisher = publisher;

    }

    public String toString() {
        return "Book {\n" +
                "  Название: " + name + "\n" +
                "  ISDN: " + idNumber + "\n" +
                "  Страниц: " + numberOfPages + "\n" +
                "  Автор: " + author + "\n" +
                "  Издатель: " + publisher + "\n" +
                '}';
    }

    public String toIsdnFormat() {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < String.valueOf(idNumber).length(); i++) {
            if (i % 3 == 0 && i != 0) {
                tmp.append('-');
            }
            tmp.append(String.valueOf(idNumber).charAt(i));
        }

        return tmp.toString();
    }
}
