import java.util.ArrayList;
import java.util.List;

public class MainApplication {

//    static List<Product> productList = new ArrayList<>();
    static ProductService productService = new ProductService();

    public static void main(String[] args) {
        double grandTotal = 0;

        for(Product p : getListOfProductsSold()){
            System.out.println("Product Name: "+p.getProductName());
            System.out.println("Product Type: "+p.getProductType());
            System.out.println("Product Price: "+p.getPrice());

            int totalItemCount = productService.getTotalProductItemCountWithSale(p.getItemCount(), p.getProductSale());

            System.out.println("Product Item Count: "+(p.getProductType().equals("Piece") ? totalItemCount+"/pc(s)" : totalItemCount+"/kg"));
            System.out.println("SALE: "+p.getProductSale());
            System.out.println("TOTAL: "+p.getTotalPrice());
            System.out.println();

            grandTotal += p.getTotalPrice();
        }

        System.out.println();
        System.out.println();
        System.out.println("GRAND TOTAL: "+grandTotal);
    }

    public static List<Product> getListOfProductsSold() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(
                "Sugar",
                "Piece",
                70.0,
                1,
                ProductConstant.BUY_1_TAKE_1,
                productService.getTotalPrice(70, 1)));
        productList.add(new Product(
                "Mango",
                "Piece",
                50.0,
                3,
                ProductConstant.BUY_2_TAKE_1,
                productService.getTotalPrice(50, 3)));
        productList.add(new Product(
                "Apples",
                "Bulk",
                55.0,
                40,
                null,
                productService.getTotalPrice(55, 40)));
        productList.add(new Product(
                "Oranges",
                "Piece",
                32.0,
                3,
                ProductConstant.BUY_1_TAKE_1,
                productService.getTotalPrice(32, 3)));

        return productList;
    }
}
