package p1;

import java.util.Date;

public class LegalPerson extends Client {
    private String cnpj;
    private String fantasyName;
    private String corporateName;
    private Address address;
    private Phone phone;

    public LegalPerson(String email, String password, String avatar_url, Address address, String cnpj, String fantasyName, String corporateName, Phone phone) {
        super(email, password, avatar_url, address);
        this.cnpj = cnpj;
        this.fantasyName = fantasyName;
        this.corporateName = corporateName;
        this.phone = phone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    // verify if CNPJ is valid with regex
    public boolean handleCnpjIsValid() {
        String cnpjRegexPattern = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})";

        if (this.cnpj.matches(cnpjRegexPattern)) {
            return true;
        }
        else {
            return false;
        }
    }
}
