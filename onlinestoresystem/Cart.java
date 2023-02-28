package onlinestoresystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> addToCartProducts = new ArrayList<>();

    public void addToCartProduct(Product product){
        addToCartProducts.add(product);
        product.setAvailability(false);
    }

    public void removedToCartProduct(Product product){
        addToCartProducts.remove(product);
        product.setAvailability(true);
    }

    public List<Product> getCartProducts(){
        return addToCartProducts;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Product price : addToCartProducts ){
            totalPrice += price.productPrice();
        }
        return totalPrice;
    }
}
