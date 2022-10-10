package Week1_Evaluation;

public class Product_bean {
    private int productId;
    private String productName;
    private int price;
    private int Qunatity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQunatity() {
        return Qunatity;
    }

    public void setQunatity(int qunatity) {
        Qunatity = qunatity;
    }

    public Product_bean(int productId, String productName, int price, int qunatity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        Qunatity = qunatity;
    }

    @Override
    public String toString() {
        return "Product_bean{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", Qunatity=" + Qunatity +
                '}'+'\n';
    }
}
