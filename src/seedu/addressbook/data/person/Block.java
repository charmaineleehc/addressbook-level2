package seedu.addressbook.data.person;

public class Block {

    private String blockNo;

    public Block(String blockNo) {
        this.blockNo = blockNo;
    }

    /**
     * Returns block number of address
     */
    public String getBlockNum() {
        return blockNo;
    }

}