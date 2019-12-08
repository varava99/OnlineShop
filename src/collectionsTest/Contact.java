package collectionsTest;

import java.time.LocalDate;

public class Contact {
    private String name;
    private LocalDate dob;
    private String phoneNumber;

    public Contact(String name, LocalDate dob, String phoneNumber) {
        this.name = name;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
