package seedu.addressbook.data.person;

public class Street {

    private String streetNo;

    public Street(String streetNo) {
        this.streetNo = streetNo;
    }

    /**
     * Returns street number of address
     */
    public String getStreetNo() {
        return streetNo;
    }
}