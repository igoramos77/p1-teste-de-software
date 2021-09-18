package p1;

import java.util.ArrayList;
import java.util.List;

public class ClientPurchases {

    private List<Product> productListPurchases;
    private Client client;

    public List<Product> getProductListPurchases() {
        return productListPurchases;
    }

    public void setProductListPurchases(List<Product> productListPurchases) {
        this.productListPurchases = productListPurchases;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<String> getProductsPurchases() {
        List<String> products = new ArrayList<String>();

        for (Product product : this.productListPurchases) {
            if (!product.getProducts().equals("Product not found")) {
                products.add(product.getProducts());
            }
        }
        return products;
    }
}
