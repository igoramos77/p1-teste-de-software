package p1;

public class Address {
    private String street;
    private int number;
    private String complement;
    private String district;
    private String city;
    private String state;

    public Address(String street, int number, String complement, String district, String city, String state) {
        if ((street == null) || (street.trim().equals(""))) {
            throw new NullPointerException("street is required");
        }

        if ((number == 0)) {
            throw new NullPointerException("number is required");
        }

        if ((district == null) || (district.trim().equals(""))) {
            throw new NullPointerException("district is required");
        }

        if ((city == null) || (city.trim().equals(""))) {
            throw new NullPointerException("city is required");
        }

        if ((state == null) || (state.trim().equals(""))) {
            throw new NullPointerException("state is required");
        }

        this.street = street;
        this.number = number;
        this.complement = complement;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street == null) {
            throw new NullPointerException("street is required");
        }

        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number <= 0) {
            throw new NullPointerException("number must be >= 0");
        }

        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        if (district == null) {
            throw new NullPointerException("district is required");
        }

        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null) {
            throw new NullPointerException("city is required");
        }

        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state == null) {
            throw new NullPointerException("state is required");
        }

        this.state = state;
    }
}
