package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.Persons.Address;

public class AddressFactory {

    public static Address getAddress(String homeAddress, String postalAddress, String postalCode) {
        return new Address.Builder().homeAddress(homeAddress)
                .postalAddress(postalAddress)
                .postalCode(postalCode)
                .build();
    }

}
