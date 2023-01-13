import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PhoneContacts {
    private Map<String, ArrayList<Contact>> phoneGroups = new HashMap<>();

    public void addContact(String newName, String newPhone, String group) {
        Contact newContact = new Contact(newName, newPhone);
        String[] groups = group.split(" ");
        for (int i = 0; i < groups.length; i++) {
            addContactInGroup(newContact, groups[i]);
        }
    }

    public void addContactInGroup(Contact contact, String group) {
        ArrayList<Contact> contactList = phoneGroups.get(group);
        int index = Collections.binarySearch(contactList, contact);
        index = Math.abs(index) - 1;
        System.out.println(contact.name + " - " + index);
        if (index == -1) {
            System.out.println("Контакт [" + contact + "] уже существует в группе [" + group + "]");
            return;
        }
        contactList.add(index, contact);
    }

    public void addGroup(String name) {
        if (phoneGroups.containsKey(name)) {
            System.out.println("Группа [" + name + "] уже существует.");
            return;
        }
        phoneGroups.put(name, new ArrayList<>());

    }

    public void listGroupAndUser() {
        System.out.println("Группы в справочнике:");
        for (String key : phoneGroups.keySet()) {
            System.out.println(" - " + key + ":");
            for (Contact list : phoneGroups.get(key)) {
                System.out.println("     " + list);
            }
        }
    }

    public String[] getGroups() {
        return phoneGroups.keySet().toArray(new String[0]);
    }

    // private Map<String, ArrayList<Contact>> phoneGroups = new HashMap<>();
    public Contact[] getContacts(String group) {
        ArrayList<Contact> list = phoneGroups.get(group);
        Contact[] list2 = list.toArray(new Contact[list.size()]);
        return list2;
    }

}

