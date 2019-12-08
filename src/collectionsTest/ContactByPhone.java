package collectionsTest;

import java.util.Comparator;

public class ContactByPhone  implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
    }
}
