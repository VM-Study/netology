import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneContact phoneContact = new PhoneContact();
        MissedCalls missedCalls = new MissedCalls();
        Scanner scanner = new Scanner(System.in);

        phoneContact.createContact("Иванов", "Борис", "+145478", Group.WORK);
        phoneContact.createContact("Петров", "Николай", "+147546", Group.WORK);
        phoneContact.createContact("Яша", "Шайгу", "+148756", Group.FAMILY);
        phoneContact.createContact("Наташа", "Буйнова", "+145562", Group.FRIENDS);
        phoneContact.createContact("Оля", "Пугачева", "+1244547", Group.FRIENDS);
        missedCalls.addMissCall("+123456");
        missedCalls.addMissCall("+148756");

        phoneContact.listOfAllContact();
        phoneContact.deleteContact("Яша", "Петров");
        phoneContact.deleteContact("Яша", "Шайгу");


        System.out.println("[Программа: пропущенные вызовы]");
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Редактировать контакт");
            System.out.println("4. Список контактов");
            System.out.println("5. Добавить пропущенный вызов");
            System.out.println("6. Вывести все пропущенные вызовы");
            System.out.println("7. Очистить пропущенные вызовы");
            System.out.println("8. Выход");
            String input = scanner.nextLine();
            if ("8".equals(input)) {
                System.out.println("Завершение работы");
                break;
            } else if ("7".equals(input)) {
                missedCalls.clearAllMissCall();
            } else if ("6".equals(input)) {
                missedCalls.listAllMissCall(phoneContact);
            } else if ("5".equals(input)) {
                System.out.println("Добавление пропущенного вызова:");
                System.out.println("Введите [Телефон]:");
                String phone = scanner.nextLine();
                missedCalls.addMissCall(phone);
            } else if ("4".equals(input)) {
                phoneContact.listOfAllContact();
            } else if ("3".equals(input)) {
                System.out.println("Редактирование контакта:");
                System.out.println("Введите [Имя]:");
                String firstName = scanner.nextLine();
                System.out.println("Введите [Фамилию]:");
                String lastName = scanner.nextLine();
                Contact contact = phoneContact.findContactWithName(firstName, lastName);
                if (contact == null) {
                    System.out.println("Контакт [" + firstName + " " + lastName + "] не найден.");
                    continue;
                }
                System.out.println("Редактирование контакта [" + firstName + " " + lastName + "]:");
                System.out.println("Введите новое [Имя]:");
                firstName = scanner.nextLine();
                contact.setFirstName(firstName);
                System.out.println("Введите новую [Фамилию]:");
                lastName = scanner.nextLine();
                contact.setLastName(lastName);
                System.out.println("Введите новую [Группу] WORK/FRIENDS/FAMILY:");
                String group = scanner.nextLine();
                contact.setGroup(Group.valueOf(group));
                System.out.println("Контакт измен на [" + firstName + " " + lastName + "] - " + group + ".");
            } else if ("2".equals(input)) {
                System.out.println("Удаление контакта:");
                System.out.println("Введите [Имя]:");
                String firstName = scanner.nextLine();
                System.out.println("Введите [Фамилию]:");
                String lastName = scanner.nextLine();
                phoneContact.deleteContact(firstName, lastName);
            } else if ("1".equals(input)) {
                System.out.println("Добавление нового контакта:");
                System.out.println("Введите [Имя]:");
                String firstName = scanner.nextLine();
                System.out.println("Введите [Фамилию]:");
                String lastName = scanner.nextLine();
                System.out.println("Введите [Телефон]:");
                String phone = scanner.nextLine();
                System.out.println("Введите [Группу] WORK/FRIENDS/FAMILY:");
                String group = scanner.nextLine();
                phoneContact.createContact(firstName, lastName, phone, Group.valueOf(group));
            } else {
                System.out.println("Ошибка ввода.");
            }
        }


        phoneContact.listOfAllContact();
        phoneContact.deleteContact("Яша", "Петров");
        phoneContact.deleteContact("Яша", "Шайгу");



    }
}
