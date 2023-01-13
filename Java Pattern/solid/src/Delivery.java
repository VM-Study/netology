public class Delivery {
    private int itemId;
    private User user;
    private String address;
    private String status;

    public Delivery(int itemId, User user, String address, String status) {
        this.itemId = itemId;
        this.user = user;
        this.address = address;
        this.status = status;
    }

    public int getItemId() {
        return itemId;
    }

    public User getUser() {
        return user;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
