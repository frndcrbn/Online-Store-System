# Online-Store-System

This project is a simple implementation of an online store in Java, consisting of four classes: Product, Cart, Customer, and OnlineStore.

The Product class represents a product with a name, description, price, and quantity. The Cart class represents a customer's shopping cart and allows products to be added and removed, as well as calculating the total price of the cart. The Customer class represents a customer and has methods for displaying the customer's name, email, and address, as well as viewing and modifying their cart. The OnlineStore class represents an online store and has methods for adding and removing products, displaying a list of all products, adding and removing customers, and processing orders.

The main functionality of the online store is to allow customers to browse available products, add products to their cart, view their cart, and place an order. The program prompts the user to enter a product name to add to their cart, and uses the Scanner class to get input from the user. The program then processes the order by looping through the products in the customer's cart, checking if they are in stock, and adding them to the order if so. It also updates the product's quantity and removes it from the cart.

Overall, this project provides a simple framework for an online store and can be extended to add more functionality as needed.
