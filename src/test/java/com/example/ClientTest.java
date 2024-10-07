package com.example;
import Client.Client;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    void testClientCreation() {
        Client client = new Client(1, "Phil Foden", "627 Minnesota", "Foden@gmail.com");
        assertEquals(1, client.getClientID());
        assertEquals("Phil Foden", client.getName());
    }

    @Test
    void testCreateOrder() {
        Client client = new Client(1, "Phil Foden", "627 Minnesota", "Foden@gmail.com");
        client.createOrder("Order: 2 books");
        assertEquals("Order: 2 books", client.viewOrders().next());
    }
}
