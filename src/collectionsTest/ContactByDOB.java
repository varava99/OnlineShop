package collectionsTest;

import java.util.Comparator;

public class ContactByDOB implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {

        return o1.getDob().compareTo(o2.getDob());
    }
}
