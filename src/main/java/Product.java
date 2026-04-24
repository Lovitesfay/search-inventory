public class Product {
    private int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String name, double price, int quantity) {
        this.productID = productID;
        this.productName = name;
        this.price = price;
        this.quantity = quantity;

    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;

    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }
}

