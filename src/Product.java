
public class Product {

    private String productName;
    private String productType;
    private Double price;
    private Integer itemCount;
    private String productSale;
    private Double totalPrice;

    public Product() {
    }

    public Product(String productName, String productType, Double price, Integer itemCount, String productSale, Double totalPrice) {
        this.productName = productName;
        this.productType = productType;
        this.price = price;
        this.itemCount = itemCount;
        this.productSale = productSale;
        this.totalPrice = totalPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public String getProductSale() {
        return productSale;
    }

    public void setProductSale(String productSale) {
        this.productSale = productSale;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
