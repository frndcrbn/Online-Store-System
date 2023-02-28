package onlinestoresystem;

public class Product {

    private String name, description;
    private double price;
    private int quantity;
    private boolean availability;

    Product(String name, String description, double price, int quantity){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.availability = true;
    }

    public String productName(){
        return name;
    }

    public String productDesc(){
        return description;
    }

    public double productPrice(){
        return price;
    }

    public int productQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public boolean isAvailable(){
        return availability;
    }

    public void setAvailability(boolean availability){
        this.availability = availability;
    }

}
