public class Offer {
    private final int width;
    private final int height;
    private final int totalPrice;

    public Offer(int width, int height, int totalPrice) {
        this.width = width;
        this.height = height;
        this.totalPrice = totalPrice;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
