import text.MobileApp;

import java.util.ArrayList;
import java.util.List;

public class PostMail {
    private String name;
    private List<Delivery> deliveryList;


    public PostMail(String name) {
        this.name = name;
        deliveryList = new ArrayList<>();
    }

    public void startDelivery(User user, StoreCart cart, Store store) {
        List<Integer> storeCardList = cart.listAllItemsId();
        for (Integer id : storeCardList) {
            deliveryList.add(new Delivery(id, user, user.getAddress(), "Ожидает отправки"));
            cart.deleteItem(id, 1, false);
            store.deleteItem(id, 1, false);
        }
    }

    public List<String> listOfDelivery() {
        List<String> list = new ArrayList<>();
        System.out.println("Список товаров к доставке:");
        for (Delivery item : deliveryList) {
            list.add("Id товара [" + item.getItemId() + "] - Адресс: " + item.getAddress() + " [" + item.getStatus() + "]");
        }
        return list;
    }

    public void sendNotifyWithWeb(User vasya) {
        List<String> list = listOfDelivery();
        MobileApp mobileApp = new MobileApp();
        for (String text : list) {
            mobileApp.sendSms(vasya.getPhone(), text);
        }
    }
}
