package p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    void handleReturnValidPhoneNumber() {
        Phone phone = new Phone();
        phone.setNumber("(24) 99992-8639"); // valid number

        assertEquals(true, phone.phoneNumberIsValid());
    }

    @Test
    void handleReturnInvalidPhoneNumber() {
        Phone phone = new Phone();
        phone.setNumber("(24) 99992-"); // invalid number

        assertEquals(false, phone.phoneNumberIsValid());
    }


}