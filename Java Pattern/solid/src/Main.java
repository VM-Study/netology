import print.MsgLogger;
import print.PrintMsg;

public class Main {
    public static PrintMsg print = new MsgLogger();

    public static void main(String[] args) {
        Store store = new Store("Магазин #1");
        store.addItem(new Item("Galaxy A20", 250, "Samsung"), 5);
        store.addItem(new Item("Galaxy A75", 400, "Samsung"), 10);
        store.addItem(new Item("Iphone 10", 425, "Apple"), 3);
        store.addItem(new Item("Iphone 12", 850, "Apple"), 5);
        store.addItem(new Item("Phone 5G", 350, "LG"), 7);
        System.out.println();
        store.listAllItems("");
        System.out.println();

        store.listAllItems("Samsung");
        System.out.println();

        User vasya = new User(1, "Vasya Petrov", "1234", "14 Lenina, kv 44", "912111222");
        vasya.getStoreCart().connectToStore(store);
        vasya.getStoreCart().addItem(3, 1);
        vasya.getStoreCart().addItem(4, 3);
        vasya.getStoreCart().addItem(2, 1);

        System.out.println();
        vasya.getStoreCart().listAllItems("");

        System.out.println();
        vasya.getStoreCart().deleteItem(2, 1, true);
        vasya.getStoreCart().deleteItem(4, 1, true);

        System.out.println();
        vasya.getStoreCart().listAllItems("");

        PostMail poshta = new PostMail("Почта");
        poshta.startDelivery(vasya, vasya.getStoreCart(), store);
        System.out.println();
        poshta.listOfDelivery();

        System.out.println();
        store.changeRaiting(3, 4.8);
        store.changeRaiting(4, 2.5);

        System.out.println();
        store.listAllItems("");

        System.out.println();
        poshta.sendNotifyWithWeb(vasya);

    }
}
