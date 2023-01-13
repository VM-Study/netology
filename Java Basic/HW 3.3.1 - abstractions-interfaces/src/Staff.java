public class Staff implements Librarian, Administrator {
    private final String name;

    public Staff(String name) {
        this.name = name;
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор [" + name + "] вынес предупреждение [" + reader + "] за просрочку.");
    }

    @Override
    public void rentbookfromlibrarinan(Reader reader, String book) {
        System.out.println("Книга [" + book + "] взята в рент читателем [" + reader + "] через администратора [" + name + "]");
    }

    @Override
    public void orderBook(String book) {
        System.out.println("Книга [" + book + "] заказана библиотекарем [" + name + "]");
    }

}
