public class User {
    private long id;
    private String name;
    private String password;
    private String address;
    private String phone;
    private StoreCart storeCart;

    public User(long id, String name, String password, String address, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.storeCart = new StoreCart("Корзина " + name);
        this.phone = phone;
    }

    public StoreCart getStoreCart() {
        return storeCart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
}
