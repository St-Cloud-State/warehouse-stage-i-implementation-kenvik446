package Client;
import java.util.*;
import java.io.Serializable;

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    private int clientID;
    private String name;
    private String address;
    private String contact;
    private List<String> orders = new LinkedList<>();         // Save Order with String
    private List<String> transactions = new LinkedList<>();   // Save Transaction with String

    // Constructor
    public Client(int clientID, String name, String address, String contact) {
        this.clientID = clientID;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    // Method to create a new order for the client
    public void createOrder(String orderDetails) {
        orders.add(orderDetails);  // Just add the order as a string
    }

    // Method to view all orders placed by the client
    public Iterator<String> viewOrders() {
        return orders.iterator();  // Returns the orders as strings
    }

    // Method to create a new transaction for the client
    public void createTransaction(String transactionDetails) {
        transactions.add(transactionDetails);  // Add transaction details as a string
    }

    // Method to view transaction history for the client
    public Iterator<String> viewTransactions() {
        return transactions.iterator();  // Returns the transactions as strings
    }

    // Getters for client attributes
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public int getClientID() {
        return clientID;
    }

    // Setters for client attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ClientID: " + clientID + ", Name: " + name + ", Address: " + address + ", Contact: " + contact;
    }
}
