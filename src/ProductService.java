
public class ProductService {

    public Double getTotalPrice(double productPrice, double productClassification) {
        return productPrice * productClassification;
    }

    public Integer getTotalProductsWithSale(int productClassification, String productSale) {
        int totalProductClassification = 0;

        if(productSale == null){
            totalProductClassification = productClassification;
        } else if (productSale.equals(ProductConstant.BUY_1_TAKE_1)){
            totalProductClassification = productClassification * 2;
        } else {
            int freeProduct = 0;

            if(productClassification == 2){
                freeProduct = 1;
            } else {
                for(int i = 2; i <= productClassification; i+=2){
                    freeProduct++;
                }
            }

            totalProductClassification = productClassification + freeProduct;
        }

        return totalProductClassification;
    }
}
