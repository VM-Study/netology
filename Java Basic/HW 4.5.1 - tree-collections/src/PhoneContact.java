import java.util.HashMap;
import java.util.Map;

public class PhoneContact {
    Map<String, Contact> listOfPhoneContact = new HashMap<>();


    public void createContact(String firstName, String lastName, String phone, Enum group) {
        Contact newContact = new Contact(firstName, lastName, phone, group);
        System.out.println("  - Пользователь " + firstName + " " + lastName + " создан.");
        addContactToPhoneContact(phone, newContact);
    }

    public void addContactToPhoneContact(String phone, Contact contact) {
        listOfPhoneContact.put(phone, contact);
        System.out.println("  - Телефон " + phone + " сохранен в записной книжке.");
    }


    public void deleteContact(String firstName, String lastName) {
        for (Map.Entry<String, Contact> item : listOfPhoneContact.entrySet()) {
            if (item.getValue().firstName.equals(firstName) && item.getValue().lastName.equals(lastName)) {
                listOfPhoneContact.remove(item.getKey());
                System.out.println("  - Контакт [" + lastName + " " + firstName + "] успешно удален.");
                return;
            }
        }
        System.out.println("  - Контакт [" + lastName + " " + firstName + "] не найден.");
    }

    public Contact findContactWithName(String firstName, String lastName) {
        for (Map.Entry<String, Contact> item : listOfPhoneContact.entrySet()) {
            if (item.getValue().firstName.equals(firstName) && item.getValue().lastName.equals(lastName)) {
                return  item.getValue();
            }
        }
        return null;
    }

    public Contact findContactWithPhone(String phone) {
        Contact contact = listOfPhoneContact.get(phone);
        if (contact == null) {
            return null;
        }
        return contact;
    }

    public void listOfAllContact() {
        System.out.println("Контакты в записной книжке:");
        if (listOfPhoneContact.isEmpty()) {
            System.out.println("  - Нет записей контактов.");
            return;
        }
        for (Map.Entry<String, Contact> item : listOfPhoneContact.entrySet()) {
            System.out.println("  " + item.getKey() + " - " + item.getValue());
        }
    }

}
