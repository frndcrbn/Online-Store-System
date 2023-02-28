package onlinestoresystem;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {

    private List<Product> products = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public void removedProduct(Product product){
        products.remove(product);
    }

    public void displayProducts(){
        for (Product p : products){
            System.out.println("Product Name            : " + p.productName());
            System.out.println("Product Description     : " + p.productDesc());
            System.out.println("Product Price           : " + p.productPrice());
            System.out.println("Product Quantity        : " + p.productQuantity());
            System.out.println("Product Availability    : " + (p.isAvailable() ? "Yes" : "No"));
        }
    }

    public List<Product> getProducts(){
        return products;
    }

    public List<Customer> getCustomers(){
        return customers;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    public void processOrder(Customer customer){
        System.out.println("Processing order for " + customer.getCustName() + "...");
        Cart cart = customer.getCart();
        for (Product p : cart.getCartProducts()){
            int quantity = p.productQuantity();
            if(quantity <= 0){
                System.out.println(p.productName() + " is out of stock.");
                continue;
            }
            if (quantity > p.productQuantity()){
                quantity = p.productQuantity();
            }
            System.out.println("- " + quantity + " x " + p.productName() + ": $" + p.productPrice());
            cart.removedToCartProduct(p);
            p.setQuantity(p.productQuantity() - quantity);
            System.out.println("Added to order.");
        }
        System.out.println("Total order price: $" + cart.getTotalPrice());
    }
}
