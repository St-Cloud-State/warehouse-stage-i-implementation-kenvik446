
package Client;

public class ClientDriver {
    public static void main(String[] args) {
        // Create a ClientList to manage clients
        ClientList clientList = new ClientList();

        // Create some clients
        Client client1 = new Client(1, "Phil Foden", "627 Minnesota", "Foden@gmail.com");
        Client client2 = new Client(2, "Bob Marley", "462 New York", "Bob@gmail.com");

        // Add clients to the client list
        clientList.addClient(client1);
        clientList.addClient(client2);

        System.out.println("All clients:");
        // Display all clients
        clientList.displayClients();
            
        // View orders for a client (should be empty)
        System.out.println("\nViewing orders for Phil Foden:");
        client1.viewOrders().forEachRemaining(System.out::println);
            
        // Create an order for Phil Foden
        client1.createOrder("Order: 2 books");
        System.out.println("\nViewing orders for Phil Foden after adding an order:");
        client1.viewOrders().forEachRemaining(System.out::println);
            
        // Remove a client by ID
        System.out.println("\nRemoving Bob from the client list:");
        clientList.removeClientByID(2);
            
        // Display all clients again after removal
        System.out.println("\nAll clients after removal:");
        clientList.displayClients();
    }
}      