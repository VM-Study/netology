import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {

    Map<LocalDateTime, String> listOfMissedCalls = new TreeMap<>();

    public void addMissCall(String phone){
        listOfMissedCalls.put(LocalDateTime.now(), phone);
        System.out.println("  - Пропущенный номер " + phone + " сохранен.");
    };

    public void listAllMissCall(PhoneContact phoneContact){
        System.out.println("Список пропущенных звонков:");
        if (listOfMissedCalls.isEmpty()) {
            System.out.println("  - Нет пропущенных звонков.");
            return;
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        for (Map.Entry<LocalDateTime, String> item : listOfMissedCalls.entrySet()) {
            Contact contact = phoneContact.findContactWithPhone(item.getValue());
            if (contact != null) {
                System.out.println("  " + item.getKey().format(format) + "   " + item.getValue() + "   (" + contact.firstName + " " + contact.lastName + ")");
            } else {
                System.out.println("  " + item.getKey().format(format) + "   " + item.getValue() + "   (НЕИЗВЕСТНЫЙ)");
            }
        }
    }
    public void clearAllMissCall(){
        listOfMissedCalls.clear();
        System.out.println("Список пропушенных звонков очищен.");
    }
}
