package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Represents the addition or deletion of a tag.
 */
public class Tagging {
    private static final String ADD_PREFIX = "+ ";
    private static final String DELETE_PREFIX = "- ";

    private static String personName;
    private static String tagName;
    private static boolean isAdded;

    /**
     * Creates an add or delete tagging record
     */
    public Tagging(Person person, Tag tag, boolean isAdded) {
        this.personName = person.getName().toString();
        this.tagName = tag.tagName;
        this.isAdded = isAdded;
    }

    @Override
    public String toString() {
        String taggingListEntry;

        if (isAdded) {
            taggingListEntry = ADD_PREFIX;
        } else {
            taggingListEntry = DELETE_PREFIX;
        }

        taggingListEntry += personName + " [" + tagName + "]";
        
        return taggingListEntry;
    }

}
