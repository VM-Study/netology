public class Item {
    private int id;
    private String name;
    private int price;
    private String company;
    private double raiting;

    private static int idIndex = 0;

    public Item(String name, int price, String company) {
        this.id = ++idIndex;
        this.name = name;
        this.price = price;
        this.company = company;
        this.raiting = 3.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getRaiting() {
        return raiting;
    }

    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }

    public int getId() {
        return id;
    }
}
