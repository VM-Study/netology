public class Main {
    public static void main(String[] args) {
        User vasya = new User("vasya@ya.ru", "Vasya", "Ivanov");
        User petya = new User("petya@ya.ru", "Petya", "Petrov");
        User irina = new User("irina@ya.ru", "Irina", "Svetikova");

        System.out.println("Всего онлайн пользователей: " + User.totalOnline + " шт.");

    }
}
