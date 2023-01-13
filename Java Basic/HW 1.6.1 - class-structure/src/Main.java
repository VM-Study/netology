public class Main {
    public static void main(String[] args) {
        Book mashaBook = new Book("Маша и Медведи", 458954123, 124, "Толстой", "Роспечать");
        Book mathematicBook = new Book("Математика", 422845124, 241, "Петров", "МазПечать");
        Book physicBook = new Book("Физика для студентов", 755622412, 187, "Иванов", "Научпок");

        System.out.println(mashaBook);
        System.out.println("Отформатированный ID: "+ mashaBook.toIsdnFormat());

    }
}
