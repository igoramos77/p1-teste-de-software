package p1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String email;
    private String password;
    private String avatar_url;
    private Address address;

    public Client(String email, String password, String avatar_url, Address address) {
        this.email = email;
        this.password = password;
        this.avatar_url = avatar_url;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFormattedAddress() {
        return this.address.getStreet() + ", "  + this.address.getNumber() + " - " + this.address.getDistrict() + " - " + this.address.getCity() + "/" + this.address.getState();
    }
}
