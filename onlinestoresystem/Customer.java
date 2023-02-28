package onlinestoresystem;

public class Customer {

    private String cusName, cusEmail, cusAddress;
    private Cart cart;

    Customer(String custName, String custEmail, String custAddress){
        this.cusName = custName;
        this.cusEmail = custEmail;
        this.cusAddress = custAddress;
        this.cart = new Cart();
    }

    public String getCustName(){
        return cusName;
    }

    public String getCustEmail(){
        return cusEmail;
    }

    public String getCustAddress(){
        return cusAddress;
    }

    public Cart getCart(){
        return cart;
    }

    public void viewCart(){
        System.out.println("Cart: ");
        for (Product product : cart.getCartProducts()){
            System.out.println("- " + product.productName() + ": " + product.productQuantity() + "x $" + product.productPrice());
        }
        System.out.println("Total price: $" + cart.getTotalPrice());
    }

    public void modifyCart(String action, Product product){
        switch (action){
            case "add":
                cart.addToCartProduct(product);
                System.out.println(product.productName() + " added to the cart.");
                viewCart();
                break;
            case "remove":
                cart.removedToCartProduct(product);
                System.out.println(product.productName() + " removed from the cart.");
                viewCart();
                break;
            default:
                System.out.println("Invalid action. Please choose 'add' or 'remove' only.");
                break;
        }
    }

}
