package seedu.addressbook.data.person;

public class PostalCode {

    private String postalCodeNo;

    public PostalCode(String postalCodeNo) {
        this.postalCodeNo = postalCodeNo;
    }

    /**
     * Returns postal code of address
     */
    public String getPostalCodeNo() {
        return postalCodeNo;
    }
}