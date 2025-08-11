import java.util.*;

public class Main {

    public static Product searchById(int id,List<Product> products){
        for(Product p : products){
            if(p.getProductId() == id) return p;
        }
        return null;
    }

    public static Product binarySearchByName(int id, List<Product> products) {
        int low = 0;
        int high = products.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Product midProduct = products.get(mid);

            if(mid == id){
                return midProduct;
            }else if(mid < id){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Pen", "Stationery"),
                new Product(2, "Pencil", "Stationery"),
                new Product(3, "Notebook", "Stationery"),
                new Product(4, "Bottle", "Utility"),
                new Product(5, "Bag", "Utility"),
                new Product(6, "Shoes", "Footwear"),
                new Product(7, "T-shirt", "Clothing"),
                new Product(8, "Cap", "Clothing"),
                new Product(9, "Phone", "Electronics"),
                new Product(10, "Charger", "Electronics")
        );

        // Applying the linear search on the products list;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the id :");
        int id = kb.nextInt();
        Product product = searchById(id,products);
        System.out.println(product);

        // Applying the binarySearch for the product list;

        System.out.println("Enter the product id :");
        kb.nextLine();
        id = kb.nextInt();
        Product foundProduct = binarySearchByName(id,products);
        if ((foundProduct != null)) {
            System.out.println(foundProduct);
        } else {
            System.out.println("Product not found");
        }
    }
}