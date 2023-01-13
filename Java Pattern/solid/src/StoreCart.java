public class StoreCart extends Store {
    private Store store;

    public StoreCart(String name) {
        super(name);
    }

    public void addItem(int id, int amount) {
        Item item = store.getItemFromId(id);
        addItem(item, amount);
    }

    public void connectToStore(Store store) {
        this.store = store;
        System.out.println("Подключение к [" + name + "] в [" + store.name + "]");
    }
}

