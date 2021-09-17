package p1;

import java.util.regex.*;

class Phone {
    private String phoneNumber;

    public String getNumber() {
        return this.phoneNumber;
    }

    public void setNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // verify if phone number is valid with regex
    public boolean phoneNumberIsValid() {
        String pattern = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})";

        if (this.phoneNumber.matches(pattern)) {
            return true;
        }
        else {
            return false;
        }
    }
}
