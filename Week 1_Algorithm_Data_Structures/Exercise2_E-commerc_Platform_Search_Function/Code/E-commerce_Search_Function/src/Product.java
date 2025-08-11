import java.util.List;

public class Product {

    private final int productId;
    private String productName;
    private String category;

    public Product(int productId,String productName,String category){
        this.category = category;
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public String toString (){
        return "Product { id = " + productId + ", name = '" + productName + "', category = '" + category + "' }";
    }

}
