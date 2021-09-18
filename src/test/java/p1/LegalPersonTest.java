package p1;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class LegalPersonTest {

    @Test
    void handleCnpjValid() {
        Address address = new Address("Rua Bla bla bla", 70, "Casa", "Centro", "Vassouras", "RJ");
        Phone phone = new Phone();
        phone.setNumber("(24) 99992-8639");

        LegalPerson legalPerson = new LegalPerson("suporte@poxalulu.com.br", "123","avatar2.jpg", address, "37.165.078/0001-76","Poxalulu",
                "Brown & Amaral Tecnologia e Treinamento", phone);

        assertEquals(true, legalPerson.handleCnpjIsValid());
    }

    @Test
    void handleCnpjInValid() {
        Address address = new Address("Rua Bla bla bla", 70, "Casa", "Centro", "Vassouras", "RJ");
        Phone phone = new Phone();
        phone.setNumber("(24) 99992-8639");

        LegalPerson legalPerson = new LegalPerson("suporte@poxalulu.com.br", "123","avatar2.jpg", address, "37.165.078/0001-777","Poxalulu",
                "Brown & Amaral Tecnologia e Treinamento", phone);

        assertFalse(legalPerson.handleCnpjIsValid());
    }

    @Test
    void handleCnpjInValidMook() {
        LegalPerson legalPerson = createMock(LegalPerson.class);

        expect(legalPerson.handleCnpjIsValid()).andReturn(false);
        replay(legalPerson);

        assertFalse(legalPerson.handleCnpjIsValid());
    }

    @Test
    void handleGetAddessMook() {
        Address address = createMock(Address.class);
        expect(address.getCity()).andReturn("Vassouras");
        replay(address);

        assertEquals("Vassouras", address.getCity());
    }
}