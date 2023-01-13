import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Программа справочник]");
        PhoneContacts phoneContacts = new PhoneContacts();

        phoneContacts.addGroup("Друзья");
        phoneContacts.addGroup("Семья");
        phoneContacts.addGroup("Дети");
        phoneContacts.addGroup("Дети");

        phoneContacts.addContact("Яна", "+128888", "Друзья Дети");
        phoneContacts.addContact("Яна", "+128888", "Друзья Дети");

        phoneContacts.addContact("Яша", "+127777", "Друзья Дети");
        phoneContacts.addContact("Петя2", "+124464", "Друзья Дети");
        phoneContacts.addContact("Вася", "+122545", "Друзья");
        phoneContacts.addContact("Петя", "+124442", "Семья");
        phoneContacts.addContact("Яша", "+127777", "Друзья Дети");

        phoneContacts.addContact("Оля2", "+184542", "Дети");
        phoneContacts.addContact("Оля", "+184566", "Дети Друзья");
        phoneContacts.addContact("Аня", "+1845456", "Дети Семья");
        System.out.println();

        System.out.println("[Автоматическое создание групп и пользователей]");
        System.out.println("Полный список через getGroups & getСontacts:");
        String[] groups = phoneContacts.getGroups();
        for (String group : groups) {
            System.out.println("Группа: [" + group + "]");
            Contact[] contacts = phoneContacts.getContacts(group);
            for (Contact contact : contacts) {
                System.out.println(" - " + contact);
            }
        }
        System.out.println();
        System.out.println("[Ручное создание групп и пользователей]");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите название новой группы контактов (end для завершения): ");
            String value = scanner.nextLine();
            if ("end".equals(value)) {
                System.out.println("Конец ввода информации о группах.");
                break;
            }
            phoneContacts.addGroup(value);
        }
        while (true) {
            System.out.println("Создать новый контакт введите наименование и его номер (end для завершения): ");
            String value = scanner.nextLine();
            if ("end".equals(value)) {
                System.out.println("Конец ввода информации о контактах.");
                break;
            }
            String[] contact = value.split(" ");
            if (contact.length != 3) {
                System.out.println("Ошибка ввода информации контакта.");
                continue;
            }
            System.out.println("Укажите группы контакта [" + contact[0] + " " + contact[1] + "] через пробел: ");
            String group = scanner.nextLine();
            phoneContacts.addContact(contact[0] + " " + contact[1], contact[2], group);
        }


        System.out.println("---------------------------------------");
        System.out.println("Полный список через listGroupAndUser:");
        phoneContacts.listGroupAndUser();
    }
}
