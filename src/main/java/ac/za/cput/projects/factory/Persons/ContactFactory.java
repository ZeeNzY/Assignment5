package ac.za.cput.projects.factory.Persons;

import ac.za.cput.projects.domain.Persons.Contact;


public class ContactFactory {

    public static Contact getContact(String cellnumber, String emailAddress) {
        return new Contact.Builder().cellnumber(cellnumber)
                .emailAddress(emailAddress)
                .build();
    }

}
