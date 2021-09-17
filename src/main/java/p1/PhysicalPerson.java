package p1;

import java.util.Date;

public class PhysicalPerson extends Client {
    private String firstName;
    private String lastName;
    private String cpf;
    private String gender;
    private Date birthdayDate;
    private Address address;

    public PhysicalPerson(String email, String password, String avatar_url, Address address, String firstName, String lastName, String cpf, String gender, Date birthdayDate, Address address1) {
        super(email, password, avatar_url, address);
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.gender = gender;
        this.birthdayDate = birthdayDate;
        this.address = address1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }


    // verify if cpf is valid with regex
    public boolean handleCpfOrCnpjIsValid() {
        String cpfRegexPattern = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})";

        if (this.cpf.matches(cpfRegexPattern)) {
            return true;
        }
        else {
            return false;
        }
    }
}
