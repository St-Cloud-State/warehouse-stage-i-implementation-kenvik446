package com.example;
import Client.Client;
import Client.ClientList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClientListTest {

    @Test
    void testAddClient() {
        ClientList clientList = new ClientList();
        Client client = new Client(1, "Phil Foden", "627 Minnesota", "Foden@gmail.com");
        clientList.addClient(client);
        assertEquals(client, clientList.findClientByID(1));
    }

    @Test
    void testRemoveClient() {
        ClientList clientList = new ClientList();
        Client client = new Client(1, "Phil Foden", "627 Minnesota", "Foden@gmail.com");
        clientList.addClient(client);
        assertTrue(clientList.removeClientByID(1));
        assertNull(clientList.findClientByID(1));
    }
}
