package p1;

import exercRelampagoSurpresaPI.Cidade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void handleReturnAdressConstructor() {
        Address address = new Address("Av. Expedicionário Osvaldo de Almeida Ramos", 280, "Rua popularmente conhecida como Broadway", "Centro", "Vassouras", "RJ");

        assertEquals("RJ", address.getState());
    }

    @Test
    void handleReturnExceptionConstructorStateNull() {
        try {
            Address address = new Address("Av. Expedicionário Osvaldo de Almeida Ramos", 280, "Rua popularmente conhecida como Broadway", "Centro", "Vassouras", null);
        }
        catch (NullPointerException e) {
            assertEquals("state is required", e.getMessage());
        }
    }

    @Test
    void handleCheckIfComplementIsNull() {
        Address address = new Address("Av. Expedicionário Osvaldo de Almeida Ramos", 280, null, "Centro", "Vassouras", "RJ");

        assertNull(null, address.getComplement());
    }

}