package p1;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PhysicalPersonTest {

    @Test
    void handleGetFormattedAddress() {
        Address address = new Address("Rua Bla bla bla", 70, null, "Centro", "Vassouras", "MG");
        PhysicalPerson physicalPerson = new PhysicalPerson("igorbrownramos@gmail.com", "123", "avatar.jpg", address, "Igor", "Brown Ramos", "15443385704", "M", new Date(1994-2-26), address);

        assertEquals("Rua Bla bla bla, 70 - Centro - Vassouras/MG", physicalPerson.getFormattedAddress());
    }

    @Test
    void handleCpfIsValid() {
        Address address = new Address("Rua Bla bla bla", 70, null, "Centro", "Vassouras", "MG");
        PhysicalPerson physicalPerson = new PhysicalPerson("igorbrownramos@gmail.com", "123", "avatar.jpg", address, "Igor", "Brown Ramos", "154.433.857-04", "M", new Date(1994-2-26), address);

        assertEquals(true, physicalPerson.handleCpfOrCnpjIsValid());
    }
}