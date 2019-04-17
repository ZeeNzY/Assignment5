package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.Contact;


public class ContactFactory {

    public static Contact getContact(String cellnumber, String emailAddress) {
        return new Contact.Builder().cellnumber(cellnumber)
                .emailAddress(emailAddress)
                .build();
    }

}
