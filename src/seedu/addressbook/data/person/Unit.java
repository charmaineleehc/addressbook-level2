package seedu.addressbook.data.person;

public class Unit {

    private String unitNo;

    public Unit(String unitNo) {
        this.unitNo = unitNo;
    }

    /**
     * Returns address unit number
     */
    public String getUnitNo() {
        return unitNo;
    }
}