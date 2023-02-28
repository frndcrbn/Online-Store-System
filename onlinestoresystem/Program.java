package onlinestoresystem;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Online Store System");
            System.out.println("[1] Add Customer.");
            System.out.println("[2] Remove Customer.");
            System.out.println("[3] Add Products.");
            System.out.println("[4] Remove Products.");
            System.out.println("[5] Display Products.");
            System.out.println("[6] Add to Cart.");
            System.out.println("[7] View Cart.");
            System.out.println("[8] Process Orders.");
            System.out.println("[0] Exit.");
            System.out.print("Enter here: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter Customer(name)    : ");
                    String CusName = scanner.next();
                    System.out.print("Enter Customer(email)   : ");
                    String CusEmail = scanner.next();
                    System.out.print("Enter Customer(address) : ");
                    String CusAdd = scanner.nextLine();
                    scanner.nextLine();
                    store.addCustomer(new Customer(CusName, CusEmail, CusAdd));
                    System.out.println("Customer Added Successfully.");
                    break;
                case 2:
                    System.out.print("Enter Customer(name)    : ");
                    CusName = scanner.next();
                    System.out.print("Enter Customer(email)   : ");
                    CusEmail = scanner.nextLine();
                    System.out.print("Enter Customer(address) : ");
                    CusAdd = scanner.nextLine();
                    scanner.nextLine();
                    store.removeCustomer(new Customer(CusName, CusEmail, CusAdd));
                    System.out.println("Customer Removed Successfully.");
                    break;
                case 3:
                    System.out.print("Enter Product(name)           : ");
                    String ProdName = scanner.next();
                    System.out.print("Enter Product(description)    : ");
                    String ProdDesc = scanner.nextLine();
                    System.out.print("Enter Product(price)          : ");
                    double Prodprice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Product(quantity)       : ");
                    int ProdQuant = scanner.nextInt();
                    scanner.nextLine();
                    store.addProduct(new Product(ProdName, ProdDesc, Prodprice, ProdQuant));
                    System.out.println("Product Added Successfully.");
                    break;
                case 4:
                    System.out.print("Enter Product(name)           : ");
                    ProdName = scanner.next();
                    System.out.print("Enter Product(description)    : ");
                    ProdDesc = scanner.nextLine();
                    System.out.print("Enter Product(price)          : ");
                    Prodprice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Product(quantity)       : ");
                    ProdQuant = scanner.nextInt();
                    scanner.nextLine();
                    store.removedProduct(new Product(ProdName, ProdDesc, Prodprice, ProdQuant));
                    System.out.println("Product Removed Successfully.");
                    break;
                case 5:
                    store.displayProducts();
                    break;
                case 6:
                    System.out.println("CART");
                    System.out.print("Enter Product(name) :     ");
                    ProdName = scanner.nextLine();
                    System.out.print("Enter Customer(name) :    ");
                    CusName = scanner.next();
                    Product product = store.getProducts().stream().filter(p -> p.productName().equals(ProdName)).findFirst().orElse(null);
                    Customer customer = store.getCustomers().stream().filter(c -> c.getCustName().equals(CusName)).findFirst().orElse(null);
                    if (product != null && customer != null){
                        System.out.println("Select Menu: ");
                        System.out.println("[1] Add to Cart.");
                        System.out.println("[2] Removed to Cart.");
                        System.out.print("Enter here: ");
                        int select = scanner.nextInt();
                        scanner.nextLine();
                        switch (select){
                            case 1:
                                customer.modifyCart("add", product);
                                break;
                            case 2:
                                customer.modifyCart("remove", product);
                                break;
                        }
                    }else {
                        System.out.println("Product/Customer not found.");
                    }
                    break;
                case 7:
                    System.out.print("Enter Customer(name) :    ");
                    CusName = scanner.next();
                    customer = store.getCustomers().stream().filter(c -> c.getCustName().equals(CusName)).findFirst().orElse(null);
                    if (customer != null){
                        customer.viewCart();
                    }else {
                        System.out.println("Customer not found.");
                    }
                    break;
                case 8:
                    System.out.print("Enter Customer(name) :    ");
                    CusName = scanner.next();
                    customer = store.getCustomers().stream().filter(c -> c.getCustName().equals(CusName)).findFirst().orElse(null);
                    if (customer != null){
                        store.processOrder(customer);
                    }else {
                        System.out.println("Customer not found.");
                    }
                    break;
                case 0:
                    System.out.println("Thank you for using us.");
                    System.exit(0);
                default:
                    System.out.println("Please select of the choices only.");
                    break;
            }
        }
    }
}
