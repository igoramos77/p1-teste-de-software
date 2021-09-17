package p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void handleReturnFullAddress() {
        Address address = new Address("Rua Maria Estela Moura", 40, null, "Centro", "Mendes", "RJ");
        Client client = new Client("igorbrownramos@gmail.com", "1234", "avatar1.jpg", address);

        assertEquals("Rua Maria Estela Moura, 40 - Centro - Mendes/RJ", client.getFormattedAddress());
    }
}