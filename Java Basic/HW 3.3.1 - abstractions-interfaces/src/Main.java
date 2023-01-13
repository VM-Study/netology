public class Main {
    public static void main(String[] args) {

        Delivery deliveryman = new Delivery("Боб");
        deliveryman.deliverBook("Пушкин");
        deliveryman.rentBook("Покемоны");

        User vasya = new User("Вася");
        vasya.rentBook("Пушкин");
        vasya.returnBook("Сказки");

        Staff admin = new Staff("Валерия");
        admin.orderBook("Лермонтов");
        admin.overdueNotification(deliveryman);
        admin.rentbookfromlibrarinan(vasya, "Лунтик");



        //
//
//        pushkinBook.orderBook(vasya);
//        tolstoiBook.orderBook(vasya);
//        aneginBook.orderBook(vasya);
//
//        pushkinBook.deliverBook(petya);
//        tolstoiBook.deliverBook(petya);
//
//        pushkinBook.rentBook(vasya);
//        pushkinBook.returnBook(vasya);

    }

}

//rentbookfromlibrarinan
//
//        rentbooktoreader

//                user - читатель
//                delivered - читатель/поставщик
//                библиотекарь - читатель/библиотекарь/администратор
